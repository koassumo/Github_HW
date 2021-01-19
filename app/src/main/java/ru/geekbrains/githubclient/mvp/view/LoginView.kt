package ru.geekbrains.githubclient.mvp.view

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType
import ru.geekbrains.githubclient.mvp.view.list.IItemView

@StateStrategyType(AddToEndSingleStrategy::class)
interface LoginView : MvpView, IItemView {
    fun printLogin(login: String)
}


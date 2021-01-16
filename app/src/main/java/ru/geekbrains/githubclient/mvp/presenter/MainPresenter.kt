package ru.geekbrains.githubclient.mvp.presenter

import moxy.MvpPresenter
import ru.geekbrains.githubclient.mvp.model.entity.GithubUsersRepo
import ru.geekbrains.githubclient.mvp.view.MainView
import ru.geekbrains.githubclient.navigation.Screens
import ru.terrakok.cicerone.Router

class MainPresenter(val router: Router) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        router.replaceScreen(Screens.UsersScreen())
    }

    fun backClicked() {
        router.exit()
    }

}
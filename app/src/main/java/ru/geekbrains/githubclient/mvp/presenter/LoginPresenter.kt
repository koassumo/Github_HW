package ru.geekbrains.githubclient.mvp.presenter

import moxy.MvpPresenter
import ru.geekbrains.githubclient.mvp.model.entity.GithubUser
import ru.geekbrains.githubclient.mvp.view.LoginView
import ru.terrakok.cicerone.Router

class LoginPresenter (val userLogin: GithubUser, val router: Router) : MvpPresenter<LoginView>() {

//    override fun onFirstViewAttach() {
//        super.onFirstViewAttach()
//        viewState.printLogin(user.login)
//    }

    private fun loadData() {
        val users = mutableListOf<GithubUser>()
        val user = users[1]
        viewState.printLogin(user.login)
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }
}
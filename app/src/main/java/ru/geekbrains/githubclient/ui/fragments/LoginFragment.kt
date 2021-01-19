package ru.geekbrains.githubclient.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.geekbrains.githubclient.App
import ru.geekbrains.githubclient.R
import ru.geekbrains.githubclient.mvp.model.entity.GithubUsersRepo
import ru.geekbrains.githubclient.mvp.presenter.LoginPresenter
import ru.geekbrains.githubclient.mvp.view.LoginView

class LoginFragment : MvpAppCompatFragment(), LoginView {
    companion object {
        fun newInstance() = LoginFragment()
    }

    val presenter: LoginPresenter by moxyPresenter { LoginPresenter(GithubUsersRepo(), App.instance.router) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        View.inflate(context, R.layout.fragment_login, null)

    override fun printLogin(login: String) {
        textView.text = login
    }

//    override fun backPressed(): Boolean {
//        TODO("Not yet implemented")
//    }


}
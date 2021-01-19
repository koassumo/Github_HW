package ru.geekbrains.githubclient.navigation

import ru.geekbrains.githubclient.ui.fragments.LoginFragment
import ru.geekbrains.githubclient.ui.fragments.UsersFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class Screens {
    class UsersScreen() : SupportAppScreen() {
        override fun getFragment() = UsersFragment.newInstance()
    }
    class LoginScreen(val login: String) : SupportAppScreen() {
        override fun getFragment() = LoginFragment.newInstance(login)
    }

}
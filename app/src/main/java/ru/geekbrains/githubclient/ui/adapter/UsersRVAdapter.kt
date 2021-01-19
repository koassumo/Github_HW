package ru.geekbrains.githubclient.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_user.view.*
import ru.geekbrains.githubclient.R
import ru.geekbrains.githubclient.mvp.presenter.list.IUserListPresenter
import ru.geekbrains.githubclient.mvp.view.list.UserItemView

class UsersRVAdapter(val presenter : IUserListPresenter) : RecyclerView.Adapter<UsersRVAdapter.ViewHolder>() {

    inner class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer, UserItemView {
        override var pos = -1

        override fun setLogin(text: String) = with(containerView) {
            tv_login.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false))

    override fun getItemCount() = presenter.getCount() //сколько элементов в RecycleView

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.pos = position
        holder.containerView.setOnClickListener { presenter.itemClickListener?.invoke(holder) }
        presenter.bindView(holder)
    }
}
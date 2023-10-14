package com.example.viewpagerrecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.View
import android.view.ViewParent
import androidx.fragment.app.FragmentContainerView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_friends_item.*
import java.text.FieldPosition

class MyFriendAdapter(private val context:Context, private val items:
ArrayList<FriendList>):RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewParent, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.list_friends_item,parent,false)
    )

    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.bindItem(items.get(position))
    }
    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView), LayoutContainer{
                fun bindItem(item:FriendList){
                    txtFriendName.text=item.Nama
                    txtFriendEmail.text=item.Email
                    txtFriendPhone.text=item.Phone
                }
            }
}


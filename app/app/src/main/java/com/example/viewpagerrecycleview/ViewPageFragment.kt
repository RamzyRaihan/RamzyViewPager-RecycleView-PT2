package com.example.viewpagerrecycleview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_myfriend.*

class ViewPageFragment : Fragment() {
    lateinit var listTeman:ArrayList<FriendList>
    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(FriendList("Jk.Rowling","Laki Laki","jkrowling@gmail.com","00000","Jepang"))
        listTeman.add(FriendList("Eiichiro Oda","Laki Laki","Odasensei@gmail.com","00001","Jepang"))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun tampilTeman(){
        rv_listFriends.layoutManager=LinearLayoutManager(activity)
        rv_listFriends.adapter=MyFriendAdapter(activity!!,listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_myfriend, container , false)
    }

    override fun onViewCreated(view: View,@Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}

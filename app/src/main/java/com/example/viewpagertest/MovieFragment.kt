package com.example.viewpagertest

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.fragment_movie.*


class MovieFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_movie, container, false)
        val users = ArrayList<User>()

        val chatsList = arrayListOf<Any>()
        chatsList.add(Chat("Drake", "1:00 AM"))
        chatsList.add(Chat("Cardi B", "2:00 AM"))
        chatsList.add(Chat("Burna Boy", "3:00 AM"))
        chatsList.add(Video("Burna Boy", "Lagos", "3:30 AM"))
        chatsList.add(Chat("Peter", "4:00 AM"))
        chatsList.add(Chat("Lady Gaga", "5:00 AM"))
        chatsList.add(Chat("Rihanna", "6:00 AM"))
        chatsList.add(Chat("Wizkid", "7:00 AM"))
        chatsList.add(Video("Wizkid", "Abuja", "7:05 AM"))
        chatsList.add(Video("Wizkid", "Abuja", "7:10 AM"))
        chatsList.add(Chat("Davido", "8:00 AM"))
        chatsList.add(Chat("Davido", "9:00 AM"))
        chatsList.add(Chat("Henry", "10:00 AM"))
        chatsList.add(Video("Henry", "Sweden", "10:10 AM"))
        chatsList.add(Chat("Cardi B", "11:00 AM"))
        chatsList.add(Chat("Drake", "12:00 AM"))

        val video_recyclerview = rootView.findViewById(R.id.recyclerView) as RecyclerView

        video_recyclerview.layoutManager = LinearLayoutManager(activity)
        video_recyclerview.adapter = MixedAdapter(chatsList)
        video_recyclerview.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )
        return rootView
    }
}

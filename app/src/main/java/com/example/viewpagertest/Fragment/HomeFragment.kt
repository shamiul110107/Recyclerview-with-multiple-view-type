package com.example.viewpagertest.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagertest.Adapter.CustomAdapter
import com.example.viewpagertest.R
import com.example.viewpagertest.Model.User

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        val users = ArrayList<User>()

        users.add(
            User(
                "sami",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami1",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami2",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami3",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami4",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami5",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )
        users.add(
            User(
                "sami6",
                "Dhaka, Rajshahi"
            )
        )


        val video_recyclerview = rootView.findViewById(R.id.home_recyclerView) as RecyclerView

        video_recyclerview.layoutManager = LinearLayoutManager(activity)
        video_recyclerview.adapter =
            CustomAdapter(users)
        video_recyclerview.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )
        return rootView
    }
}
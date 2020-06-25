package com.example.viewpagertest.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagertest.R

private const val TYPE_CHAT: Int = 1
private const val TYPE_VIDEO: Int = 2

class MixedAdapter(var mData: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemViewType(position: Int): Int {
        if (mData[position] is Chat) {
            return TYPE_CHAT
        } else if (mData[position] is Video) {
            return TYPE_VIDEO
        }
        return -1
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var layout = 0
        val viewHolder: RecyclerView.ViewHolder?
        when (viewType) {
            TYPE_CHAT -> {
                layout =
                    R.layout.recyclerview_adapterchat
                val chatView = LayoutInflater.from(parent.context).inflate(layout, parent, false)
                viewHolder = ChatViewHolder(chatView)
            }
            TYPE_VIDEO -> {
                layout =
                    R.layout.recyclerview_adaptervideo
                val videoView = LayoutInflater.from(parent.context).inflate(layout, parent, false)
                viewHolder =
                    VideoViewHolder(videoView)
            }
            else -> viewHolder = null
        }
        return viewHolder!!
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            TYPE_CHAT -> {
                val chat = mData[position] as Chat
                (holder as ChatViewHolder).showDetails(chat)
            }
            TYPE_VIDEO -> {
                val video = mData[position] as Video
                (holder as VideoViewHolder).showDetails(video)
            }
        }
    }
    override fun getItemCount(): Int {
        return mData.size
    }
    inner class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val userNameTextView: TextView
        private val TimeTextView: TextView
        init {
            // Initiate view
            userNameTextView = itemView.findViewById(R.id.userName)
            TimeTextView = itemView.findViewById(R.id.Time)
        }
        fun showDetails(chat: Chat) {
            // Attach values for each item
            val userName = chat.getuserName()
            val Time = chat.gettime()
            userNameTextView.text = userName
            TimeTextView.text = Time
        }
    }
}
class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val userNameTextView: TextView
    private val PlaceTextView: TextView
    private val TimeTextView: TextView
    init {
        userNameTextView = itemView.findViewById(R.id.userName)
        PlaceTextView = itemView.findViewById(R.id.place)
        TimeTextView = itemView.findViewById(R.id.videoTime)
    }
    fun showDetails(video: Video) {
        userNameTextView.text = video.getuserName()
        PlaceTextView.text = video.getplace()
        TimeTextView.text = video.gettime()
    }
}
class Chat(val userName: String, val time: String){
    fun getuserName(): String {
        return userName
    }
    fun gettime(): String {
        return time
    }
}
class Video(val userName: String, val place: String, val time: String) {
    fun getuserName(): String {
        return userName
    }
    fun getplace(): String {
        return place
    }
    fun gettime(): String {
        return time
    }
}
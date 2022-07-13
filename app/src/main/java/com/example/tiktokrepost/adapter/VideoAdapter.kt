package com.example.tiktokrepost.adapter

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tiktokrepost.databinding.ItemRowBinding
import com.example.tiktokrepost.db.VideoResponse
import com.squareup.picasso.Picasso

class VideoAdapter() : RecyclerView.Adapter<VideoAdapter.VideoHolder>()  {
    var onItemLongClickAdd: ((VideoResponse) -> Unit)?= null
    var onItemLongClickDelete: ((VideoResponse) -> Unit)?= null
    var onItemClick: ((VideoResponse) -> Unit)?= null
    class VideoHolder(val binding : ItemRowBinding) : RecyclerView.ViewHolder(binding.root){
        val cancelItem = binding.cancel
        fun bind(video : VideoResponse){
            Glide.with(binding.imageView).load(video.imageUrl).into(binding.imageView)
        }
    }

    private val diff =object  : DiffUtil.ItemCallback<VideoResponse>(){
        override fun areItemsTheSame(oldItem: VideoResponse, newItem: VideoResponse): Boolean {

            return oldItem.videoId == oldItem.videoId
        }

        override fun areContentsTheSame(oldItem: VideoResponse, newItem: VideoResponse): Boolean {

            return oldItem == oldItem

        }

    }
    val differ = AsyncListDiffer(this,diff)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
       val binding =ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VideoHolder(binding)
    }


    override fun onBindViewHolder(holder: VideoHolder, position: Int){
        val video =differ.currentList[position]
        holder.bind(video)
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(video)
        }
        holder.itemView.setOnLongClickListener {
            if(holder.binding.cancel.visibility == View.VISIBLE){
                holder.binding.cancel.visibility = View.INVISIBLE
                onItemLongClickDelete?.invoke(video)
            }else{
                holder.binding.cancel.visibility = View.VISIBLE
                onItemLongClickAdd?.invoke(video)
            }
            notifyDataSetChanged()
            return@setOnLongClickListener true

        }

    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}
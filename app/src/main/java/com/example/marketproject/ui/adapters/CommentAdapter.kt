package com.example.marketproject.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marketproject.databinding.ItemCommentBinding
import org.w3c.dom.Comment

class CommentAdapter(var items: List<Comment>): RecyclerView.Adapter<CommentAdapter.ViewHolder>() {
    class ViewHolder(val item: ItemCommentBinding): RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCommentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
//        holder.item.itemCommentName.text = item.author
//        holder.item.itemCommentName.text = item.description
//        holder.item.itemDate.text = item.date
//        Glide.with(holder.itemView).load(item.image).into(holder.item.itemImageCommentView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
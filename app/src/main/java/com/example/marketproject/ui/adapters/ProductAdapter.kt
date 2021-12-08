package com.example.marketproject.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marketproject.ui.listeners.OnProductListener
import com.example.marketproject.databinding.ItemProductBinding
import com.example.marketproject.data.model.Product

class ProductAdapter(var items: List<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(val item: ItemProductBinding): RecyclerView.ViewHolder(item.root)
    var listener: OnProductListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemReplace = items[position]
        holder.run {
            item.itemProductName.text = itemReplace.name
            item.itemDescription.text = itemReplace.description
            item.itemProductStock.text = itemReplace.stock
            item.itemProductPrecio.text = itemReplace.price
            Glide.with(holder.itemView).load(itemReplace.image).into(holder.item.itemImageProductView)
            item.root.setOnClickListener {
                listener?.onClick(itemReplace)
            }
        }


    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun newDataSet(newData: List<Product>){
        items = newData
        notifyDataSetChanged()
    }
}
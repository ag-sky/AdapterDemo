package com.example.viewholderunderstanding.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewholderunderstanding.R
import com.example.viewholderunderstanding.ViewHolders.FooterViewHolder
import com.example.viewholderunderstanding.ViewHolders.ProductViewHolder
import com.example.viewholderunderstanding.ViewHolders.TitleViewHolder
import com.example.viewholderunderstanding.models.Footer
import com.example.viewholderunderstanding.models.ListItem
import com.example.viewholderunderstanding.models.Product
import com.example.viewholderunderstanding.models.Title

class MultiViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items: List<ListItem> = listOf()
    fun setItems(newItems: List<ListItem>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is Title -> VIEW_TYPE_TITLE
            is Product -> VIEW_TYPE_PRODUCT
            is Footer -> VIEW_TYPE_FOOTER
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        return when(viewType){
             VIEW_TYPE_TITLE -> TitleViewHolder(inflator.inflate(R.layout.item_title, parent, false))
             VIEW_TYPE_PRODUCT -> ProductViewHolder(inflator.inflate(R.layout.item_product,parent,false))
             VIEW_TYPE_FOOTER -> FooterViewHolder(inflator.inflate(R.layout.item_footer,parent,false))
            else ->  throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is TitleViewHolder -> holder.bind(items[position] as Title)
            is ProductViewHolder -> holder.bind(items[position] as Product)
            is FooterViewHolder -> holder.bind(items[position] as Footer)
        }
    }

    companion object {
        const val VIEW_TYPE_TITLE = 0
        const val VIEW_TYPE_PRODUCT = 1
        const val VIEW_TYPE_FOOTER = 2
    }
}


package com.example.viewholderunderstanding.ViewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewholderunderstanding.R
import com.example.viewholderunderstanding.models.Product

class ProductViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    private val productNameTextView: TextView = view.findViewById(R.id.tv_name)
    private val productPriceTextView: TextView = view.findViewById(R.id.tv_price)

    fun bind(product : Product){
        productNameTextView.text = product.name
        productPriceTextView.text = "$${product.price}"
    }
}
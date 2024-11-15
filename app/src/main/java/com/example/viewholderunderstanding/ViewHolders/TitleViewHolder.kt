package com.example.viewholderunderstanding.ViewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewholderunderstanding.R
import com.example.viewholderunderstanding.models.Title

class TitleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val titleTextView : TextView = view.findViewById(R.id.tv_title)

    fun bind (title: Title){
        titleTextView.text = title.titleText
    }
}
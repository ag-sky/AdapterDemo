package com.example.viewholderunderstanding.ViewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewholderunderstanding.R
import com.example.viewholderunderstanding.models.Footer

class FooterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val footerTextView: TextView = view.findViewById(R.id.tv_footer)

    fun bind(footer: Footer) {
        footerTextView.text = footer.footerText
    }
}
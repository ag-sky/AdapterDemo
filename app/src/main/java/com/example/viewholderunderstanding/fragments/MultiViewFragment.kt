package com.example.viewholderunderstanding.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.viewholderunderstanding.R
import com.example.viewholderunderstanding.adapters.MultiViewAdapter
import com.example.viewholderunderstanding.viewmodel.MultiViewModel

class MultiViewFragment : Fragment(R.layout.fragment_multiple_views) {
    private lateinit var viewModel: MultiViewModel
    private lateinit var adapter: MultiViewAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MultiViewModel::class.java)
        adapter = MultiViewAdapter()
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_multi_view)
        recyclerView.adapter = adapter
        viewModel.items.observe(viewLifecycleOwner, { items ->
            adapter.setItems(items)
        })
        viewModel.loadItems()
    }
}
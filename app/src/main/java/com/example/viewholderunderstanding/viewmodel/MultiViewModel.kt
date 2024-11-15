package com.example.viewholderunderstanding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewholderunderstanding.models.Footer
import com.example.viewholderunderstanding.models.ListItem
import com.example.viewholderunderstanding.models.Product
import com.example.viewholderunderstanding.models.Title

class MultiViewModel: ViewModel() {
    private val _items = MutableLiveData<List<ListItem>>()
    val items: LiveData<List<ListItem>> = _items

    fun loadItems() {
        val mockData = listOf(
            Title("Our Products"),
            Product(1, "Laptop", 999.99),
            Product(2, "Smartphone", 799.99),
            Footer("End of Product List")
        )
        _items.value = mockData
    }
}
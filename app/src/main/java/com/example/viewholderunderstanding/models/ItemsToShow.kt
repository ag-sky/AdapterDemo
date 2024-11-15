package com.example.viewholderunderstanding.models


sealed class ListItem

data class Title(
    val titleText: String
) : ListItem()

data class Product(val id: Int, val name: String, val price: Double) : ListItem()

data class Footer(val footerText: String) : ListItem()
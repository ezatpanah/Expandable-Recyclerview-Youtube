package com.ezatpanah.expandable_recyclerview.model


object SampleData {

    private val movieModels = listOf(
        SubItemModel("Rose"),
        SubItemModel("Daisy"),
        SubItemModel("Lily"),
        SubItemModel("Narcissus"),
        SubItemModel("Lotus"),
        SubItemModel("Jasmine"),
        SubItemModel("Tulip")
    )

    val collections = listOf(
        MainModel("All Flowers ", movieModels),
        MainModel("Want to Buy", movieModels.reversed()),
        MainModel("Popular Flowers", movieModels.shuffled()),
    )
}
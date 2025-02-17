package com.deal.github.api

import com.google.gson.annotations.SerializedName
import com.deal.github.data.model.Repo

data class RepoSearchResponse(

    @SerializedName("total_count")
    val total: Int = 0,

    @SerializedName("items")
    val items: List<Repo> = emptyList(),

    val nextPage: Int? = null
)
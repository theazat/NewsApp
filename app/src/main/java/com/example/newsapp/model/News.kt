package com.example.newsapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/*************************
 * Created by AZAT SAYAN *
 *                       *
 * Contact: @theazat     *
 *                       *
 * 02/03/2020 - 10:47 PM *
 ************************/

@Parcelize
data class News(
    val status: String?,
    val totalResults: Int?,
    val articles: List<Articles>?
) : Parcelable
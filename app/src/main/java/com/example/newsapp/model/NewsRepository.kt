package com.example.newsapp.model


/*************************
 * Created by AZAT SAYAN *
 *                       *
 * Contact: @theazat     *
 *                       *
 * 01/04/2020 - 10:17 PM *
 ************************/
class NewsRepository(private val newsApiService: NewsApi) {

    suspend fun getLatestNews(): MutableList<Articles>? {
        return try {
            val response = newsApiService.getNewsAsync("us", "8fc34d247dee40b5ba90295e691cf8b7")
                .await()
            response.articles?.toMutableList()
        } catch (e: Exception) {
            null
        }
    }
}
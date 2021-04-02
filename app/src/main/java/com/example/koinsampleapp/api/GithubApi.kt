package com.example.koinsampleapp.api

import com.example.koinsampleapp.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET

interface GithubApi {

    @GET("users")
    fun getUsers(): Call<List<GithubUser>>

}
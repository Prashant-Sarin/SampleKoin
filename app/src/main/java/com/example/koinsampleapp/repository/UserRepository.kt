package com.example.koinsampleapp.repository

import com.example.koinsampleapp.api.GithubApi

class UserRepository(private val api: GithubApi) {
    fun getAllUsers() = api.getUsers()
}
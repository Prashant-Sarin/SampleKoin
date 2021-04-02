package com.example.koinsampleapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.koinsampleapp.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userViewModel.data.observe(this, Observer {
            Log.d(TAG, "list of github users: $it")
        })

        userViewModel.loadingState.observe(this, Observer {
            Log.d(TAG, "loaded: $it")
        })
    }
}
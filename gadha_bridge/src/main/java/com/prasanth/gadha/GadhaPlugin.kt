package com.prasanth.gadha

import android.content.Context

class GadhaPlugin(private val context: Context) {

    fun onStart() {
        println("GadhaPlugin started")
        // Initialize backend connections here
    }

    fun onStop() {
        println("GadhaPlugin stopped")
        // Clean up here
    }

    fun onLogout() {
        println("GadhaPlugin logout")
        // Handle logout lifecycle here
    }
}

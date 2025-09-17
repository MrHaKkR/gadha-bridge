package com.prasanth.gadha

import android.content.Context
import android.util.Log

// Basic skeleton plugin — will connect to Gadha backend later
class GadhaPlugin : Plugin {
    override fun onLoad(context: Context) {
        Log.d("GadhaPlugin", "Loaded Gadha Bridge Plugin")
    }

    override fun onStart() {
        Log.d("GadhaPlugin", "Plugin started")
    }

    override fun onStop() {
        Log.d("GadhaPlugin", "Plugin stopped")
    }
}

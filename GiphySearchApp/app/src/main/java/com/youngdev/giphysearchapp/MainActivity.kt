package com.youngdev.giphysearchapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.tooling.preview.Preview
import com.youngdev.giphysearchapp.ui.theme.GiphySearchAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GiphySearchAppTheme {
                val android_giphy_sdk = "https://api.giphy.com/v1/gifs/search?api_key=TVYxZP1cBtDXhz6iiSEuuEnYLmGNvGbF&q=&limit=25&offset=0&rating=g&lang=en&bundle=messaging_non_clips";

            }
        }
    }
}
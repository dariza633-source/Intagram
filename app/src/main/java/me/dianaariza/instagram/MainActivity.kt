package me.dianaariza.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.dianaariza.instagram.ui.screens.FeedScreen
import me.dianaariza.instagram.ui.theme.InstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramTheme {
                FeedScreen()
            }
        }
    }
}

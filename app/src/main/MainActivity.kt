package com.serenify.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.serenify.app.ui.theme.SerenifyTheme
import com.serenify.app.ui.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SerenifyTheme {
                Surface(color = MaterialTheme.colors.background) {
                    AppNav()
                }
            }
        }
    }
}

@Composable
fun AppNav() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = "login") {
        composable("login") { LoginScreen(onLogin = { nav.navigate("home") }) }
        composable("home") { HomeScreen(onNavigate = { nav.navigate(it) }) }
        composable("mood") { MoodTrackerScreen() }
        composable("mindfulness") { MindfulnessScreen() }
        composable("resources") { ResourcesScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SerenifyTheme {
        Text("Serenify preview")
    }
}

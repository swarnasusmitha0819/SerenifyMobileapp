package com.serenify.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onNavigate: (String)->Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TopAppBar(title = { Text("Serenify") })
        Spacer(Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Mood Tracker")
                Spacer(Modifier.height(8.dp))
                Button(onClick = { onNavigate("mood") }) { Text("Open") }
            }
        }
        Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Mindfulness Exercises")
                Spacer(Modifier.height(8.dp))
                Button(onClick = { onNavigate("mindfulness") }) { Text("Open") }
            }
        }
        Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Self-care Resources")
                Spacer(Modifier.height(8.dp))
                Button(onClick = { onNavigate("resources") }) { Text("Open") }
            }
        }
    }
}

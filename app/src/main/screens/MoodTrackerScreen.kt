package com.serenify.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MoodTrackerScreen() {
    val mood = remember { mutableStateOf(5f) }
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Mood Tracker", style = androidx.compose.material.MaterialTheme.typography.h5)
        Spacer(Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("How are you feeling today?")
                Spacer(Modifier.height(8.dp))
                Slider(value = mood.value, onValueChange = { mood.value = it }, valueRange = 0f..10f)
                Spacer(Modifier.height(8.dp))
                Text("Score: ${'$'}{mood.value.toInt()}")
                Spacer(Modifier.height(8.dp))
                Button(onClick = { /* Save to Firestore: instructions in README */ }) { Text("Save") }
            }
        }
    }
}

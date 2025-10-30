package com.serenify.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MindfulnessScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Mindfulness Exercises", style = androidx.compose.material.MaterialTheme.typography.h5)
        Spacer(Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("5-minute breathing exercise")
                Spacer(Modifier.height(8.dp))
                Button(onClick = { /* Start local timer or audio - add later */ }) { Text("Start") }
            }
        }
        Spacer(Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Guided journaling prompt")
                Spacer(Modifier.height(8.dp))
                Button(onClick = { /* Open journaling UI */ }) { Text("Open") }
            }
        }
    }
}

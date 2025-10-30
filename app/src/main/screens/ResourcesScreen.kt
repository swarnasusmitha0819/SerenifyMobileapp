package com.serenify.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResourcesScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Self-care Resources", style = androidx.compose.material.MaterialTheme.typography.h5)
        Spacer(Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("• Breathing exercises\n• Local helplines\n• Articles and tips")
            }
        }
    }
}

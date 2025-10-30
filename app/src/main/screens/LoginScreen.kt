package com.serenify.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(onLogin: () -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp),
        verticalArrangement = Arrangement.Center) {
        val email = remember { mutableStateOf("") }
        val pass = remember { mutableStateOf("") }

        Text("Welcome to Serenify", style = MaterialTheme.typography.h5)
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = email.value, onValueChange = { email.value = it }, label = { Text("Email") })
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(value = pass.value, onValueChange = { pass.value = it }, label = { Text("Password") })
        Spacer(Modifier.height(16.dp))
        Button(onClick = onLogin, modifier = Modifier.fillMaxWidth()) { Text("Sign in") }
        Spacer(Modifier.height(8.dp))
        Text("(Firebase auth instructions in README)")
    }
}

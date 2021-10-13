package com.example.jcompose.ui.theme.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun counterStateHoisting(count: Int, updateCount:(Int)-> Unit){
    Button(onClick = {updateCount(count+1)}, Modifier.fillMaxWidth()) {
        Text(text = "my value $count")
    }
}
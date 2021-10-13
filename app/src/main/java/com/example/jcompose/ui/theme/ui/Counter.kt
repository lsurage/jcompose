package com.example.jcompose.ui.theme.ui

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


@Composable
fun counter(){
    val count  = remember { mutableStateOf(0)}
    Button(onClick = {count.value++},modifier = Modifier.fillMaxWidth()) {
        Text(text = "click me time ${count.value}")
    }
}
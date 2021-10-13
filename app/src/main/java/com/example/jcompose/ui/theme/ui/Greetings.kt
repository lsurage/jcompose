package com.example.jcompose.ui.theme.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


/**
 * this is normal greeting function
 */
//@Composable
//fun Greeting(name: String) {
//    Surface(color = Color.Yellow) {
//        Text(text = "Hello $name!", color = Color.Red, modifier = Modifier.padding(20.dp))
//    }
//}

/**
 * this greeting animates the text
 */
@Composable
fun Greeting(name: String) {
    var isSelected by remember { mutableStateOf(false) }
    val backgroundColor by animateColorAsState (if(isSelected) Color.Red else Color.Transparent)
        Text(text = "Hello $name!",
            modifier = Modifier.padding(20.dp)
                .background(backgroundColor)
                .clickable(onClick = {isSelected = !isSelected}))

}


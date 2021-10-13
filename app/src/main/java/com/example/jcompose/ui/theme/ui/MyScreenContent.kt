package com.example.jcompose.ui.theme.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun myScreenContent(names : List<String> = listOf("lokesh","shweta")){
    Column {
       names.forEach{
           Greeting(name = it)
           Divider()
       }
    }
}
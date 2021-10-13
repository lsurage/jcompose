package com.example.jcompose.ui.theme.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun myScreenContent(names: List<String> = listOf("lokesh", "shweta")) {
    val countState = remember { mutableStateOf(0)}
    Column {
        names.forEach {
            Greeting(name = it)
            Divider()
        }
        Divider(thickness = 32.dp)
        counter()
        Divider(thickness = 32.dp)
        counterStateHoisting(count = countState.value , updateCount ={
            count ->
            countState.value = count
        } )
    }
}
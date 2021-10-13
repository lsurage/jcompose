package com.example.jcompose.ui.theme.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun myFlexScreenContent(list: List<String> = listOf("lokesh","shweta")){
    val counterState = remember {
        mutableStateOf(0)
    }

    Column(Modifier.fillMaxHeight()) {
        Column(Modifier.weight(1f)) {
            list.forEach {
                Greeting(name = it)
                Divider(thickness = 2.dp)
            }

        }
        counterStateHoisting(count = counterState.value, updateCount = {
            counterState.value = it
        })
    }
}
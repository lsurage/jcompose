package com.example.jcompose.ui.theme.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun nameList(nameList: List<String>, modifire: Modifier = Modifier){
    
    Column(modifier = modifire) {
        nameList.forEach {
            Greeting(name = it)
            Divider(thickness = 2.dp, color = Color.Blue)
        }
    }
}

@Composable
fun lazyNameList(names: List<String>, modifire: Modifier = Modifier){
    LazyColumn(modifier = modifire) {
     items(names) { name ->
         Greeting(name = name)
         Divider(thickness = 2.dp, color = Color.Blue)
     }
    }
}
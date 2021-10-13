package com.example.jcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcompose.ui.theme.JComposeTheme
import com.example.jcompose.ui.theme.ui.Greeting
import com.example.jcompose.ui.theme.ui.lazyNameList
import com.example.jcompose.ui.theme.ui.myFlexScreenContent
import com.example.jcompose.ui.theme.ui.myScreenContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp{
//              myScreenContent(listOf("you","me"))
//                myFlexScreenContent()
                myFlexScreenContent()

            }
        }
    }
}


@Composable
fun MyApp(content : @Composable () -> Unit) {
    Surface (color = Color.Yellow){
        JComposeTheme {
           content()
        }
    }
}


@Preview("Text preview")
@Composable
fun DefaultPreview() {
    MyApp{
//       myScreenContent()
        myFlexScreenContent()
    }
}
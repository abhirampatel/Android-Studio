package com.smarttoolfactory.composedrawingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Expand
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.smarttoolfactory.composedrawingapp.ui.theme.ComposeDrawingAppTheme
import com.smarttoolfactory.composedrawingapp.ui.theme.backgroundColor
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDrawingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(

                        topBar = {
                            TopAppBar(
                                elevation = 2.dp,
                                backgroundColor = MaterialTheme.colors.surface,
                                contentColor = MaterialTheme.colors.onSurface,
                                title = {
                                    Text("Drawing App - Uppula Abhiram Patel - CYS21087")
                                },

                                actions = {}
                            )
                        }
                    ) { paddingValues: PaddingValues ->
                        DrawingApp(paddingValues)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDrawingAppTheme {
        Greeting("Android")
    }
}
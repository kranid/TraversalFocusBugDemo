package com.example.traversalfocusbugdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BreakingFocusContainer()
        }
    }
}

@Composable
fun BreakingFocusContainer() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Scaffold(topBar = {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text("The first element")
            }
        }
        ) { padding ->
            LazyColumn(
                contentPadding = padding,
                modifier = Modifier.background(Color.Blue)
            ) {
                item { Text("The second element") }
                item { Text("the Third element") }
            }
        }
    }
}
package com.example.traversalfocusbugdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                Box(Modifier.fillMaxSize()) {
                    BreakingFocusContainer()
                }
            }
        }
    }

    @Composable
    fun BreakingFocusContainer() {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
                .semantics { isTraversalGroup = true }
                .border(2.dp, Color.Red),
            Alignment.Center
        ) {
            Text("Element №2")
            Text("Element №3", Modifier.offset(y = 30.dp))
        }
        Box(
            Modifier
                .height(40.dp)
                .width(100.dp)
                .background(Color.Blue)
                .border(2.dp, Color.Yellow),
            Alignment.Center    ) {
            Text("Element №1")
        }
        Box(
            modifier = Modifier
                .offset(y =100.dp)
                .height(50.dp)
                .width(100.dp)
                .background(Color.Magenta),
            Alignment.Center) {
            Text("Element №4")
        }
    }
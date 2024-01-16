package com.example.traversalfocusbugdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.isContainer
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.example.traversalfocusbugdemo.ui.theme.TraversalFocusBugDemoTheme

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
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green)
                .border(2.dp, Color.Red),
            Alignment.BottomCenter
        ) {
            Text("The first element")
        }
        Box(
            Modifier
                .height(50.dp)
                .width(200.dp)
                .offset(y=25.dp)
                .background(Color.Blue)
                .border(2.dp, Color.Yellow),
                    Alignment.BottomCenter
        ) {
            Text("hello world!", Modifier.offset(x = 10.dp))
        }
    }

}
package com.example.row

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.row.ui.theme.RowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RowTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyRow(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyRow(name: String, modifier: Modifier = Modifier) {
    Row (modifier = Modifier.fillMaxSize().background(Color.Blue).horizontalScroll(rememberScrollState())){
        Text("Ejemplo1", modifier = Modifier.background(Color.Red).fillMaxWidth().height(150.dp))
        Text("Ejemplo2", modifier = Modifier.background(Color.Yellow).fillMaxWidth().height(150.dp))
        Text("Ejemplo3", modifier = Modifier.background(Color.Red).fillMaxWidth().height(150.dp))
        Text("Ejemplo4", modifier = Modifier.background(Color.Yellow).fillMaxWidth().height(150.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RowTheme {
        MyRow("Android")
    }
}
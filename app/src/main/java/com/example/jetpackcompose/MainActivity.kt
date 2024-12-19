package com.example.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) { innerPadding ->
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .border(5.dp, Color.Red)
                            .padding(5.dp)
                            .border(5.dp, Color.Blue)
                            .padding(5.dp)
                            .border(5.dp, Color.Green)
                            .padding(5.dp)
                            .border(5.dp, Color.Yellow)
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text(text = "Jetpack")
                        Text(text = "Compose")
                    }
                    Row (
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(onClick = {
                            val intent = Intent(this@MainActivity, ImageCardActivity::class.java)
                            startActivity(intent)
                        }) {
                            Text("Image Card")
                        }
                        Button(onClick = {
                            val intent = Intent(this@MainActivity, ColorBoxActivity::class.java)
                            startActivity(intent)
                        }) {
                            Text("Color Box")
                        }
                        Button(onClick = {
                            val intent = Intent(this@MainActivity, LazyColumnActivity::class.java)
                            startActivity(intent)
                        }) {
                            Text("Lazy Column")
                        }
                    }
                }
            }
        }
    }
}
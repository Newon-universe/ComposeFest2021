package com.example.week2_1layoutsinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week2_1layoutsinjetpackcompose.ui.theme.Week21LayoutsInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week21LayoutsInJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                LayoutsCodelab()
            }
        }
    }
}

@Composable
fun LayoutsCodelab() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "LayoutsCodelab")
                },
                actions = {
                    Row{
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.Favorite, contentDescription = null)
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.Earbuds, contentDescription = null)
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.DownhillSkiing, contentDescription = null)
                        }
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigation(
                content = {
                    Row() {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.AccountBox, contentDescription = null)
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.ElectricCar, contentDescription = null)
                        }

                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.ImageNotSupported, contentDescription = null)
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        BodyContent(modifier = Modifier
            .padding(innerPadding)
            .padding(8.dp))
    }


}

@Composable
fun BodyContent(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi there !")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}


@Preview
@Composable
fun DefaultPreview() {
    Week21LayoutsInJetpackComposeTheme {
        LayoutsCodelab()
    }
}
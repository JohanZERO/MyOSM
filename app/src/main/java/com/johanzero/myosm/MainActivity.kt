package com.johanzero.myosm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.johanzero.myosm.ui.MapViewModel
import com.johanzero.myosm.ui.theme.OpenStreetMapTheme
import ovh.plrapps.mapcompose.ui.MapUI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OpenStreetMapTheme {
//                 A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
//                        AndroidView(factory = {})
                    }
                }

                /* Inside a composable */
            }
        }
    }
}


@Composable
fun MapContainer(
    modifier: Modifier = Modifier, viewModel: MapViewModel
) {
    MapUI(modifier, state = viewModel.state)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OpenStreetMapTheme {
        Greeting("Android")
    }
}
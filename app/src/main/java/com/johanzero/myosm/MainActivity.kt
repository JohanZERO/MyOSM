package com.johanzero.myosm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                    MapContainer(viewModel = MapViewModel())
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
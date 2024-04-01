package com.example.myagenda

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambdaNInstance
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myagenda.ui.theme.MyAgendaTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

//Seal class for route
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Login : Screen("MyFirstScreen")
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAgendaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val dateFormat =
                        SimpleDateFormat("yyyy-MM-dd HH:mm:ss",
                            Locale.getDefault())
                    val navigationController = rememberNavController()
                    NavHost(navController=navigationController,
                        startDestination ="pantalla1"){
                            composable("pantalla1"){
                                MyFirstScreen(navController = navigationController)
                            }
                    }
                    //MyFirstScreen()
                }
            }
        }
    }
}
fun getCurrentDateTime(): String {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
    return dateFormat.format(Date())
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
    MyAgendaTheme {
        Greeting("Android")
    }
}
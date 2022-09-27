package hu.gyuriczaadam.tddtestapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import hu.gyuriczaadam.tddtestapp.presentation.main_screen.MainScreen
import hu.gyuriczaadam.tddtestapp.presentation.ui.theme.TDDTestAppTheme
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TDDTestAppTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.MainScreen.route
                ) {
                    composable(route = Screen.MainScreen.route) {
                        MainScreen(navController = navController)
                    }
                }
            }
        }
    }
}


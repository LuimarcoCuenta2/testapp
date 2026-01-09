package com.example.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testapp.screens.LoginScreen
import com.example.testapp.screens.RegisterScreen
import com.example.testapp.ui.theme.TestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TestAppTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "Login"
                ) {
                    composable("Login") {
                        LoginScreen(navController)
                    }

                    // Más adelante puedes agregar:
                    // composable("Welcome") { WelcomeScreen(navController) }
                     composable("Register") { RegisterScreen(navController) }
                }
            }
        }
    }
}

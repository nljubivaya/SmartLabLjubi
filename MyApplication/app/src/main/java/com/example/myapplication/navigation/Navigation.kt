package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ViewModelSmartLab
import com.example.myapplication.screens.Code
import com.example.myapplication.screens.Hello
import com.example.myapplication.screens.Karta
import com.example.myapplication.screens.Password
import com.example.myapplication.screens.Start
import com.example.myapplication.screens.Swipe

@Composable
fun Navigation (viewModel: ViewModelSmartLab) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Start.route)
    {
        composable(route = Screens.Start.route)
        {
            Start(navController = navController)

        }
        composable(route = Screens.Swipe.route)
        {
            Swipe(navController = navController)
        }
        composable(route = Screens.Hello.route)
        {
            Hello(navController = navController, viewModel)
        }
        composable(route = Screens.Code.route)
        {
            Code(navController = navController)
        }
        composable(route = Screens.Password.route)
        {
            Password(navController = navController)
        }
        composable(route = Screens.Karta.route)
        {
            Karta()
        }

    }
}
package com.example.movieapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MovieNavigation(){
    val NavController = rememberNavController()
    NavHost(navController = NavController, startDestination = MovieScreens.HomeScreen.name ) {
        composable(MovieScreens.HomeScreen.name){
            //here we pass where this lead us to
//            HomeScreen()
        }
    }
}
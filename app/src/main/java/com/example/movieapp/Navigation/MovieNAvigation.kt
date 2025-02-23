package com.example.movieapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.Screens.homes.HomeScreen
import com.example.movieapp.Screens.home.details.DetailsScreen

@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name ) {
        composable(MovieScreens.HomeScreen.name){
            //here we pass where this lead us to
         HomeScreen(navController = navController)
        }
        composable(MovieScreens.DetailsScreen.name + "/{movie}",
        arguments = listOf(navArgument(name = "movie"){type = NavType.StringType})){
            backStackEntry ->

            DetailsScreen(navController = navController,backStackEntry.arguments?.getString("movie"))
        }
    }
}
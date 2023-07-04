package com.example.movieapp.Navigation

//www.google.com/sign_in
enum class MovieScreens {
    HomeScreen,
    DetailsScreen;
    companion object{
        fun fromRoute(route: String?): MovieScreens =
            when (route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                DetailsScreen.name -> DetailsScreen
                null -> HomeScreen
                else -> throw java.lang.IllegalArgumentException("Route $route is not recoganised")
            }
    }
}
package com.example.myapplication.navigation

sealed class Screens (val route:String) {

    object Start : Screens("start")
    object Hello : Screens("hello")
    object Karta :Screens("karta")
    object Password:Screens("password")
    object Swipe:Screens("swipe")
    object Code:Screens("code")

    fun withArg(vararg args:String):String
    {
        return buildString {
            append(route)
            args.forEach {arg ->
                append("/$arg")
            }
        }
    }

}
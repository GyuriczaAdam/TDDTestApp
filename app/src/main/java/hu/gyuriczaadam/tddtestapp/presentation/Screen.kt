package hu.gyuriczaadam.tddtestapp.presentation

sealed class Screen(val route:String) {
    object MainScreen:Screen("main_screen")
}
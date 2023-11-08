package com.ideabaker.kmp.translator.screen

sealed class Routes(val route: String) {
  data object Login: Routes("Login")
  data object Home: Routes("Home")
  data object Pin: Routes("Pin")
}
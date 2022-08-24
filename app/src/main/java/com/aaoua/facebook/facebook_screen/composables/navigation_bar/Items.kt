package com.aaoua.facebook.facebook_screen.composables.navigation_bar

import com.aaoua.facebook.R

sealed class Screen(
    val id:String,
    val icon:Int,
) {


    object Home : Screen("home", R.drawable.ic_baseline_home_24)
    object Videos : Screen("videos", R.drawable.ic_baseline_video_24)
    object Group : Screen("group", R.drawable.ic_baseline_groups_24)
    object Notification : Screen("notification", R.drawable.ic_baseline_notifications_24)
    object Menu : Screen("more", R.drawable.ic_baseline_menu_24)

    object Items {
        val list = listOf(
            Home, Videos, Group, Notification, Menu
        )
    }
}


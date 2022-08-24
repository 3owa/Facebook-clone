package com.aaoua.facebook.facebook_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.aaoua.facebook.facebook_screen.composables.AddPostRow
import com.aaoua.facebook.facebook_screen.composables.AppBar
import com.aaoua.facebook.facebook_screen.composables.Story
import com.aaoua.facebook.facebook_screen.composables.FacebookPost
import com.aaoua.facebook.facebook_screen.composables.navigation_bar.NavigationBar
import com.aaoua.facebook.facebook_screen.composables.navigation_bar.Screen
import com.aaoua.facebook.R



@Composable
fun FacebookScreen() {


    val currentScreen = remember {
        mutableStateOf<Screen>(Screen.Home)
    }

    Column(modifier = Modifier
        .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally) {

        AppBar()

        NavigationBar(currentScreenId = currentScreen.value.id) {
            currentScreen.value=it
        }

        ScreenContent()

    }

}

@Composable
fun ScreenContent(){
    Column(modifier = Modifier
        .background(Color.LightGray)
        .verticalScroll(rememberScrollState())
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Story()
        Spacer(modifier = Modifier.height(5.dp))
        AddPostRow(profile = R.drawable.story1)
        Spacer(modifier = Modifier.height(5.dp))
        FacebookPost(
            profile = R.drawable.story1,
            img = R.drawable.story1,
            name = "Ahmed Aaoua" ,
            txt = "",
            time = "Today at 8.30",
            likes = "840",
            comment = "300" ,
            share = "67"
        )

        FacebookPost(
            profile = R.drawable.story5,
            img = R.drawable.story5,
            name = "Īlÿäṩṩ ÞoúĶḑīr" ,
            txt = "",
            time = "18 avril",
            likes = "20k",
            comment = "12k" ,
            share = "8k"
        )
        FacebookPost(
            profile = R.drawable.profile4,
            img = R.drawable.story4,
            name = "Bill Gates" ,
            txt = "I’m at my happiest when I’m learning – no matter how gross the subject matter. Today, I experienced the Meguro Parasitological Museum in Tokyo, and saw what is believed to be the world’s longest tapeworm. 10/10 would visit again.",
            time = "Today at 19.30",
            likes = "750k",
            comment = "37k" ,
            share = "9,3k"
        )

        FacebookPost(
            profile = R.drawable.profile3,
            img = R.drawable.profile3,
            name = "Marouane Boukedir" ,
            txt = "",
            time = "12 avril",
            likes = "89k",
            comment = "20k" ,
            share = "18k"
        )


        FacebookPost(
            profile = R.drawable.profile2,
            img = R.drawable.post3,
            name = "Mark Zuckerberg" ,
            txt = "We're launching Horizon Worlds in France and Spain today! Looking forward to seeing people explore and build immersive worlds, and to bringing this to more countries soon.",
            time = "16 août,06:58",
            likes = "123k",
            comment = "20k" ,
            share = "9,1k"
        )


    }
}
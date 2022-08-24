package com.aaoua.facebook.facebook_screen.composables.navigation_bar


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aaoua.facebook.R
import com.aaoua.facebook.ui.theme.facebookColor

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavigationBar(
    currentScreenId:String,
    onItemSelected:(Screen)->Unit
) {

    val items= Screen.Items.list

    Row(
        modifier= Modifier
            .background(MaterialTheme.colors.background)
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

        items.forEach { item->

            CustomBottomNavigationItem(item = item, isSelected = item.id==currentScreenId) {
                onItemSelected(item)
            }

        }

    }

}

@ExperimentalAnimationApi
@Composable
fun CustomBottomNavigationItem(item: Screen, isSelected:Boolean, onClick:()->Unit) {

    val contentColor = if (isSelected) facebookColor else Color.Gray

    Box(
        modifier = Modifier
            .height(60.dp)
            .padding(10.dp)
    ) {


        IconButton(onClick = onClick) {

            Icon(
                painter = painterResource(id = item.icon),
                contentDescription = item.id,
                tint = contentColor,
                modifier = Modifier
                    .size(30.dp, 30.dp)
                    .align(Alignment.TopCenter)
            )
        }

        if (isSelected) {

            Spacer(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp))
                    .size(47.dp, 3.dp)
                    .padding(top = 1.dp)
                    .background(contentColor)
                    .align(Alignment.BottomCenter)
            )
        }


    }
}


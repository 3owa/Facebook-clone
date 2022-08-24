package com.aaoua.facebook.facebook_screen.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaoua.facebook.ui.theme.facebookColor
import com.aaoua.facebook.R


//Action Bar

@Composable
fun AppBar() {

    Row(modifier = Modifier
        .background(Color.White)
        .fillMaxWidth()
        .padding(10.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween) {
        
        Text(text = "facebook",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = facebookColor)

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                backgroundColor = Color.LightGray,
                shape = CircleShape,
                modifier = Modifier.padding(end = 5.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.shearch),
                    contentDescription = "icon1",
                    tint = Color.Black,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(30.dp, 30.dp)
                )
            }
            Card(
                backgroundColor = Color.LightGray,
                shape = CircleShape,
                modifier = Modifier.padding(end = 5.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.messenger),
                    contentDescription = "icon2",
                    tint = Color.Black,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(35.dp, 35.dp)
                )
            }
        }
        
    }

}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    AppBar()
}
package com.aaoua.facebook.facebook_screen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaoua.facebook.R

@Composable
fun AddPostRow(profile:Int) {
    
    
    Row(modifier = Modifier
        .background(Color.White)
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            shape = CircleShape,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp, start = 5.dp, end = 5.dp)
                .size(50.dp, 50.dp)
        ) {
            Image(
                painter = painterResource(id = profile),
                contentDescription = "profile",
                contentScale = ContentScale.Crop,
            )
        }
        
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray,
            contentColor = Color.Black),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .weight(20f)
                .padding(top = 10.dp, bottom = 10.dp, start = 5.dp, end = 5.dp)
        ) {
            
            Text(
                text = "Add a post",
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                letterSpacing = 0.sp
            )
            
        }

        Card(
            shape = CircleShape,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp, start = 5.dp, end = 5.dp)
                .size(50.dp, 50.dp),
            backgroundColor = Color.LightGray,
        ) {

            Icon(
                painter = painterResource(id = R.drawable.image_place_holder),
                contentDescription = "image_place_holder",
                tint = Color.Black.copy(0.9f),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(13.dp)
            )
        }
        
    }
    
}


@Preview(showBackground = true)
@Composable
fun AddPostRowPreview(){
    AddPostRow(profile = R.drawable.story1)
}
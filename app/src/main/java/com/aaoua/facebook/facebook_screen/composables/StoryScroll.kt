package com.aaoua.facebook.facebook_screen.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaoua.facebook.R

@Composable
fun Story() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .horizontalScroll(rememberScrollState())
        .padding(top = 10.dp, bottom = 10.dp)
        .background(Color.White)) {

        StoryContent(story = R.drawable.story1, profile = R.drawable.story1 , name = "Ahmed Aaoua",addStory = true)
        StoryContent(story = R.drawable.story1, profile = R.drawable.story1 , name = "Your Story" ,addStory = false)
        StoryContent(story = R.drawable.profile5, profile = R.drawable.story5 , name = "Īlÿäṩṩ ÞoúĶḑīr" ,addStory = false)
        StoryContent(story = R.drawable.story3, profile = R.drawable.profile3 , name = "Marouane Boukedir" ,addStory = false)
        StoryContent(story = R.drawable.story4, profile = R.drawable.profile4 , name = "Bill Gates" ,addStory = false)
        StoryContent(story = R.drawable.story2, profile = R.drawable.profile2 , name = "Mark Zuckerberg" ,addStory = false)

    }
}

@Composable
fun StoryContent(story:Int,profile:Int,name:String,addStory:Boolean){

    Card(modifier = Modifier
        .padding(5.dp)
        .size(120.dp, 200.dp),
    shape = RoundedCornerShape(10.dp)) {
        Image(
            painter = painterResource(id = story ),
            contentDescription = name,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .fillMaxSize()
        )

        Box(
            modifier = Modifier
                .padding(7.dp)
                .fillMaxSize()
        ) {


            if (addStory){
                Card(
                    shape = CircleShape,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .size(50.dp, 50.dp)
                        .border(2.5.dp,Color.White, CircleShape),
                    backgroundColor = Color.Transparent
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.add_icon),
                        contentDescription = name + "add_new_story",
                        tint = Color.White,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(4.dp)
                    )
                }
                    Text(
                        text = "Add to Story",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 36.dp)
                            .align(Alignment.BottomStart)
                    )


            }
            else {
                Card(
                    shape = CircleShape,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .size(50.dp, 50.dp)
                        .border(2.5.dp, Color.White, CircleShape)
                ) {
                    Image(
                        painter = painterResource(id = profile),
                        contentDescription = name + "profile",
                        contentScale = ContentScale.Crop,
                    )



                }

                Text(
                    text = name,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 36.dp)
                        .align(Alignment.BottomStart)
                )



            }

        }




    }

}

@Preview(showBackground = true)
@Composable
fun StoryPreview(){
    Story()
}
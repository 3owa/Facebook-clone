package com.aaoua.facebook.facebook_screen.composables

import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaoua.facebook.R

@Composable
fun FacebookPost(
    profile: Int,
    img: Int,
    name: String,
    txt: String,
    time: String,
    likes: String,
    comment: String,
    share: String
) {

    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally) {

        TopRow(profile = profile, name = name,time= time)
        TextContent(txt = txt)
        ImageContent(img=img)
        ReactBar(likes = likes , comment = comment, share = share )

    }

}



@Composable
fun TopRow(profile:Int,name:String,time:String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {


            Card(
                shape = CircleShape,
                modifier = Modifier
                    .size(50.dp, 50.dp),
                backgroundColor = Color.LightGray,
            ) {

                Image(
                    painter = painterResource(id = profile),
                    contentDescription = "profile",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }

            Column{


                //name
                Text(
                    text = name,
                    color = Color.Black,
                    maxLines = 1,
                    fontSize = 18.sp,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )

                Row(verticalAlignment = Alignment.CenterVertically) {

                    Text(
                        text = time,
                        color = Color.Gray,
                        maxLines = 1,
                        fontSize = 14.sp,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.W400,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.public_ic),
                        contentDescription = "public",
                        tint = Color.Gray,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .size(16.dp, 16.dp)
                    )

                }
            }
        }

        //icon
        Icon(
            painter = painterResource(id = R.drawable.more_hor_ic),
            contentDescription = "more",
            tint = Color.Black.copy(0.9f),
            modifier = Modifier
                .size(30.dp, 30.dp)
                .fillMaxSize()
        )

    }

}


@Composable
fun TextContent(txt:String) {

    if (txt.isNotEmpty()) {
        Text(
            text = txt,
            color = Color.Black,
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.W400,
            fontSize = 17.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
        )
    }

}

@Composable
fun ImageContent(img: Int) {



        Image(painter = painterResource(id = img),
            contentDescription = "img",
        contentScale = ContentScale.Fit,
            modifier = Modifier
                .background(Color.LightGray.copy(0.09f))
                .fillMaxWidth()
                .height(400.dp))



}

@Composable
fun ReactBar(likes:String,comment:String,share:String) {

    Column(modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Row1
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            //Love-likes
            Row(modifier = Modifier
                .padding(8.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.love),
                    contentDescription = "love",
                    modifier = Modifier
                        .size(16.dp, 16.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.like),
                    contentDescription = "like",
                    modifier = Modifier
                        .padding(start = 1.dp)
                        .size(16.dp, 16.dp)
                )
                
                Text(
                    text = likes,
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(start = 5.dp)
                )



            }

            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "$comment Comments",
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp,
                    modifier = Modifier
                )
                Text(
                    text = "$share Shares",
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )

            }


        }

        Spacer(modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp)
            .height(0.8.dp)
            .background(Color.DarkGray))

        //Row2
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            LikeCommentShare(text = "Like", icon = R.drawable.like_reacting)
            LikeCommentShare(text = "Comment", icon = R.drawable.comment)
            LikeCommentShare(text = "Share", icon = R.drawable.share)


        }


    }
    
}


@Composable
fun LikeCommentShare(text:String,icon:Int) {

    Row(modifier = Modifier
        .padding(10.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Start) {

        Icon(
            painter = painterResource(id = icon),
            contentDescription = "like",
            tint = Color.DarkGray,
            modifier = Modifier
                .size(20.dp, 20.dp)
        )

        Text(
            text = text,
            color = Color.DarkGray,
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(start = 5.dp)
        )


    }

}


@Preview(showBackground = true)
@Composable
fun FacebookPostPreview() {

    FacebookPost(
        profile = R.drawable.story1,
        img = R.drawable.story1,
        name = "Ahmed Aaoua",
        txt = "Hello",
        time = "Today at 19:30",
        likes = "500",
        comment = "700",
        share = "24"
    )
}
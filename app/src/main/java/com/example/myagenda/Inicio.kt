package com.example.myagenda

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun myFirstScreen(modifier:Modifier=Modifier){

                Text ("ttttts")
    Spacer(modifier = Modifier
        .width(500.dp)
        .border(width = 10.dp,color=Color.Red))
    Box(modifier= modifier
        .padding(20.dp)
        .background(Color.LightGray)
            ){
        Image(
            painterResource(id = R.drawable.free_logo),
            contentDescription = "MyLogo",
            modifier= Modifier
                .padding(25.dp)
                .border(5.dp, Color.Red, CircleShape)
                .fillMaxWidth()
        )

}}

@Composable
fun identificacion(){
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(text,
        onValueChange = { text = it },
        label = "Email", placeholder = "mail@gmail.com"
    )
}
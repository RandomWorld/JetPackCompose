package com.example.myagenda

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MyFirstScreen(modifier:Modifier=Modifier){
    Column() {
        Text(getCurrentDateTime(), modifier=Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

        Spacer(modifier = Modifier
            .height(200.dp)
            .size(300.dp)
            .border(width = 10.dp, color = Color.Red))

        Box(modifier= modifier
            .padding(20.dp)
            .background(Color.LightGray)
            ) {
            Column(){
                Image(
                    painterResource(id = R.drawable.free_logo),
                    contentDescription = "MyLogo",
                    modifier = Modifier
                        .padding(25.dp)
                        .border(5.dp, Color.Red, CircleShape)
                        .fillMaxWidth()
                )
            Identificacion()
            }
        }
    }
}


@Composable
fun Identificacion(){
    var text by remember { mutableStateOf(TextFieldValue("user@gmail.com")) }
    TextField(
        value = text,
        onValueChange = { text=it },
        label = {Text("Email")},
        singleLine=true,maxLines=1,
        placeholder={Text("placeholder")},
        leadingIcon = { Icon(Icons.Filled.Favorite, contentDescription = "Localized description") },
        trailingIcon = { Icon(Icons.Filled.Info, contentDescription = "Localized description") }
        //shape=Shapes(extraLarge = ShapeDefaults.ExtraLarge)
    )
}
package com.example.myapplication.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun BodyText (body:String){
    Text(text = body, style = MaterialTheme.typography.body2,
    textAlign = TextAlign.Justify)
}

@Preview(
    showBackground = true
)
@Composable
fun BodyTextPreview(){
    MyApplicationTheme{
        BodyText("Lorem")
    }
}
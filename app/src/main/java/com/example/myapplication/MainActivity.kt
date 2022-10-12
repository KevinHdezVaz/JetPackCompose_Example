package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCompose()
        }
    }
}

@Composable
fun HelloCompose() {
    Card(
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(painterResource(id = R.drawable.imagen), contentDescription = null
                ,Modifier.size(40.dp,40.dp))
            Text("HOLASDFASD", style = MaterialTheme.typography.h4)
            Text("Esta es una copia de flutter krnal")

            Button(onClick = { }, modifier = Modifier.padding(top = 16.dp)) {
                Text("saca")

            }
        }
    }

 }
@Preview(
    showBackground = true
)
 @Composable
fun HelloComposePreview() {
     HelloCompose()
}
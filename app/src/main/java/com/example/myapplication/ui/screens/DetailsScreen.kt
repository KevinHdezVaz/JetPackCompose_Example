package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.components.*
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun DetailScreen(navController: NavController, countryIso: CountryIso){
    Scaffold(
        topBar = {
            CustomAppBar(navigationIcon = Icons.Filled.ArrowBack)
            {
navController.navigate("feed"){
    popUpTo("feed")
}
            }
        }, content = {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp))
                {
                    Image(painter = painterResource(id = countryIso.getBackgroundImage()), contentDescription = null,
                    contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())

                }
                Column(modifier = Modifier.padding(16.dp)) {
                    TitleText(title = "Cafe de Colombia")
                    Text(text = "Loremsdjfkalsjdfaklsjfdklas")
                    Spacer(modifier = Modifier.height(24.dp))
                    BodyText(body = "SADfASDFAsdfassdfsa")
                    
                }
            }

        }
    )

}
@Preview(showBackground = true)

@Composable
fun DetailScreenPreview(){
    val navController = rememberNavController()
    MyApplicationTheme{

        DetailScreen(  navController, CountryIso.Bra)

    }
 }
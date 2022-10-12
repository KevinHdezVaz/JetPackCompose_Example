package com.example.myapplication.ui.screens

 import androidx.compose.foundation.layout.Arrangement
 import androidx.compose.foundation.layout.Column
 import androidx.compose.foundation.layout.padding
 import androidx.compose.foundation.lazy.LazyColumn
 import androidx.compose.foundation.lazy.items
 import androidx.compose.material.MaterialTheme
 import androidx.compose.material.Scaffold
 import androidx.compose.material.Surface
 import androidx.compose.material.Text
 import androidx.compose.material.icons.Icons
 import androidx.compose.material.icons.filled.ArrowBack
 import androidx.compose.runtime.Composable
 import androidx.compose.ui.Modifier
 import androidx.compose.ui.tooling.preview.Preview
 import androidx.compose.ui.unit.dp
 import androidx.navigation.NavController
 import androidx.navigation.compose.rememberNavController
 import com.example.myapplication.ui.components.*
 import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun FeedScreen (navController: NavController){
val list = listOf<CountryIso>(
    CountryIso.Col, CountryIso.Cri,CountryIso.Bra,CountryIso.Nic
)


    MyApplicationTheme{

        Surface(color = MaterialTheme.colors.background){

            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)){

                item{
                    Column(modifier = Modifier.padding(8.dp)) {
                        TitleText(title = "Bienvenido")
                        BodyText(body = "sdfjsalkgjaskldfjlsakjfljasdlfjasldkfsa")
                    }
                }
                items(list){
                    country -> ProductCard(
                    name = "Cafe de colombia",
                    summary = "Sacaste" ,
                    price = 34.0,
                    currency = "USD",
                    country = country,

                ){
                    navController.navigate("detail/${country.iso}"){
                            launchSingleTop=true
                        }
                }
                }
            }
         }
    }

}


@Preview
    (showBackground = true)


@Composable
fun FeedScreenPreview(){
    val navController = rememberNavController()
    FeedScreen(navController)
}
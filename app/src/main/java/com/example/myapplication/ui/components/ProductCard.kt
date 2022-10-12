package com.example.myapplication.ui.components

 import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
 import androidx.compose.foundation.layout.*
 import androidx.compose.material.Card
 import androidx.compose.material.MaterialTheme
 import androidx.compose.material.Surface
 import androidx.compose.material.Text
import androidx.compose.runtime.Composable
 import androidx.compose.ui.Alignment
 import androidx.compose.ui.Modifier
  import androidx.compose.ui.res.painterResource
  import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
 import com.example.myapplication.ui.theme.MyApplicationTheme
 import com.example.myapplication.ui.theme.PlatziBlue
 import com.example.myapplication.ui.theme.PlatziGreen



enum class CountryIso(val iso: String){
    Col("Col"),
    Bra("Bra"),
    Cri("Cri"),
    Nic("Nic");

    fun getBackgroundImage(): Int {
        when(this){
            Col -> return R.drawable.co
            Bra -> return R.drawable.br
            Cri -> return R.drawable.ri
            Nic -> return R.drawable.ni
        }
    }

    fun getCountryFlag(): Int {
        when(this){
            Col -> return R.drawable.flagco
            Bra -> return R.drawable.flagbr
            Cri -> return R.drawable.flagri
            Nic -> return R.drawable.flagni
        }
    }

    fun getSurfaceColor(): androidx.compose.ui.graphics.Color {
        when(this){
            Col, Nic -> return PlatziBlue
            Bra, Cri -> return PlatziGreen

        }
    }

}
@Composable
fun ProductCard(name:String, summary:String,
                price: Double, currency: String, country:CountryIso, selected : ()->Unit){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {

selected()
            }
            .size(480.dp)

    , elevation = 10.dp
    ,shape = MaterialTheme.shapes.small
    
    ) {
        Image(painter = painterResource(country.getBackgroundImage()), contentDescription = null)
        Surface(
            modifier = Modifier.fillMaxWidth()
           // ,color = PlatziBlue.copy(alpha = 0.2f)
             ,color =country.getSurfaceColor().copy(alpha = 0.2f)

        ){

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = name, style = MaterialTheme.typography.h4)
                Text(text = summary, style = MaterialTheme.typography.body1 )
                Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                         horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image (

                            painter = painterResource(country.getCountryFlag()),

                            contentDescription = null
                        )
                        Text ("$ $price $currency", style = MaterialTheme.typography.h4)
                    }
                 }

            }
        }
    }
 }

@Preview(
    showBackground = true
)
@Composable
fun ProductCardPreview(){
    MyApplicationTheme{

        ProductCard("Cafe de colombia",
            "El mejor cafe de latam",35.0,"USD",
        country = CountryIso.Col
        ) {}
    }
}
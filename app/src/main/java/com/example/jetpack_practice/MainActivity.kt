package com.example.jetpack_practice

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_practice.ui.theme.JetPack_PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Calling the function here The number of times we'll call it will affect our UI
//            Column {
//                callText()
//                callText()
//            }

            layout()

//            Row {
//                Text(text = "Hello kya haal chal", color = Color.Cyan)
//                Text(text = "Sab changa??", color = Color.Green)
//            }
//            var arr = arrayOf("Anubhav","huihui","pomp_pomp","dudu","io","poi")
//            Column {
//                for (name in arr){
////                    Text(text = name, Modifier.padding(11.dp))
////                    if don't want to give padding to whole screen then use
//                    Text(text = name, modifier =  Modifier.padding(11.dp,0.dp,0.dp,0.dp))
//                }
//            }
            
//            You can repeat a text multiple times in jetpack very easily
//            Column {
//                Text(text = "HI I am Anubhav Rajput....\n".repeat(20), modifier = Modifier.padding(11.dp,0.dp,0.dp,0.dp))
//            }

        }
    }

//    We where having different different Layout in Xml here we have only two the Column and Row layout
    @Composable
    fun layout() {
//        For further modification we have to make constructor of Column and then we'll perform works
//        Row (
////            If you'll use row here you have to change two thing one verticalAlignment and one verticalArrangement
//            modifier = Modifier
////                Will set the color for 50% of the layout
////                .fillMaxHeight()
////                .fillMaxWidth(.5f)
//                .fillMaxSize()
//                .background(Color.Blue)
////            Here you'll see when we have increased the size of the font whole data will not be covered now
////            For that we'll use scroll
////                .verticalScroll(rememberScrollState()),
////
//////            For spacing
//////            verticalArrangement = Arrangement.SpaceBetween
//////            verticalArrangement = Arrangement.SpaceAround,
//////            This we set the text in the middle
////
////            verticalArrangement = Arrangement.Center,
////            horizontalAlignment = Alignment.CenterHorizontally
////
////            For Row
//                .horizontalScroll(rememberScrollState()),
//            horizontalArrangement = Arrangement.Center,
//            verticalAlignment = Alignment.Bottom
//
//
//
//        ){
//
////            It will print Anubhav 5 times
//            for (i in 1..80) {
//                Text(text = "Anubhav", fontSize = 28.sp)
//            }
//        }



//        If we want to get the scrollable property we can get it simply using LazyRow or LazyColumn
        LazyColumn(content =
        {item { 
            for (i in 1..22){
                Text(text = "Hehehe Hello bro", fontSize = 29.sp)
            }
        }})
}





    //        We can call things by using functions also use @Composable to implement
//    @Composable
//    fun callText(){
//        Column {
//            Text(text = "Hello kya haal chal", color = Color.Cyan, fontSize = 18.sp)
//            Text(text = "Sab changa??", color = Color.Green, fontSize = 23.sp, fontFamily= FontFamily.Monospace,
//                fontStyle = FontStyle.Italic,
//                modifier = Modifier
//                    .background(Color.Magenta)
//                    //                Defining width  and height
//                    .width(200.dp)
//                    .height(300.dp)
////                You can fill it to whole screen also
////                    .fillMaxSize()
//                ,
//                textAlign = TextAlign.Center
//
//            )
//
//        }
    }
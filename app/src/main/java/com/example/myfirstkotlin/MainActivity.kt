package com.example.myfirstkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstkotlin.ui.theme.MyFirstKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  // onCreate : 해당 액티비티를 먼저 실행함
        setContent {
            MyFirstKotlinTheme {
                // A surface container using the 'background' color from the theme
                // surface 배경을 위해 사용
                Surface(
                    modifier = Modifier.fillMaxSize(), // 전체 화면을 채우라고 말해줌
                    color = MaterialTheme.colorScheme.background // 이 색상으로
                ) {
                    Greeting("doun")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstKotlinTheme {
        Greeting("doun")
    }
}
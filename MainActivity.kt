package com.example.taskcomplete

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskcomplete.ui.theme.TaskCompleteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompleteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        stringResource(R.string.all_tasks_completed),
                        stringResource(R.string.nice_work)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(line1: String, line2: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(contentDescription = "Check",
            alignment = Alignment.Center,

            painter = painterResource(
                id = R.drawable.ic_task_completed
            )

        )
        Text(
            text = line1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(bottom = 8.dp)
                .align(Alignment.CenterHorizontally)
            )
        Text(
            text = line2,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskCompleteTheme {
        Greeting(
            stringResource(R.string.all_tasks_completed),
            stringResource(R.string.nice_work)
        )
    }
}
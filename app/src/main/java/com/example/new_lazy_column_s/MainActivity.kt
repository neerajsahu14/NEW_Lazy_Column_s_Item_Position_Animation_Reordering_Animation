package com.example.new_lazy_column_s

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.new_lazy_column_s.ui.theme.NEW_Lazy_Column_s_Item_Position_Animation_Reordering_AnimationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NEW_Lazy_Column_s_Item_Position_Animation_Reordering_AnimationTheme {
                var items by remember {
                    mutableStateOf(
                        listOf(
                            "kotlin",
                            "c++",
                            "java",
                            "python",
                            "Go"
                        )
                    )
                }
                Scaffold { paddingValues ->
                    Column(modifier = Modifier.padding(paddingValues)
                        .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        LoadingAnimation(modifier = Modifier)
                    }
//                    LazyColumn(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(paddingValues),
//                        verticalArrangement = Arrangement.spacedBy(12.dp)
//                    ) {
//                          items(items = items , key = {it}) {
//                              Text(text = "I Love $it",
//                                  modifier = Modifier
//                                      .fillMaxWidth()
//                                      .background(Color.LightGray.copy(alpha = 0.2f))
//                                      .padding(16.dp)
//                                      .animateItemPlacement(
//                                          animationSpec = tween(durationMillis = 600)
//                                      ),
//                                  fontSize = MaterialTheme.typography.bodyLarge.fontSize,
//                                  fontWeight = MaterialTheme.typography.bodyLarge.fontWeight
//
//                              )
//                          }
//                        item {
//                            Button(
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .padding(horizontal = 24.dp),
//                                onClick = {
//                                    items = items.shuffled()
//                                }
//                            ) {
//                                Text(text = "Shuffle")
//                            }
//                        }
//                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NEW_Lazy_Column_s_Item_Position_Animation_Reordering_AnimationTheme {
        Greeting("Android")
    }
}
package com.martinezdputra.materialthree

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.martinezdputra.materialthree.composables.ImageCard
import com.martinezdputra.materialthree.ui.theme.SunwellTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunwellTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        floatingActionButton = {
                            FloatingActionButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.onPrimaryContainer,
                                )
                            }
                        },
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(text = "Sunwell")
                                },
                                colors = TopAppBarDefaults.smallTopAppBarColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                                    titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                )
                            )
                        }
                    ) { scaffoldPadding ->
                        LazyColumn(Modifier.padding(scaffoldPadding)) {
                            items(20) {
                                ImageCard(
                                    title = "Halo",
                                    description = "Bacon ipsum dolor amet pork shankle beef andouille ball",
                                    modifier = Modifier.padding(16.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

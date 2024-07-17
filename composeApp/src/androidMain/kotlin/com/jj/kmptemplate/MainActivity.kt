package com.jj.kmptemplate

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import domain.CustomBatteryManager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(remember { CustomBatteryManager(applicationContext) })
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(CustomBatteryManager(LocalContext.current))
}
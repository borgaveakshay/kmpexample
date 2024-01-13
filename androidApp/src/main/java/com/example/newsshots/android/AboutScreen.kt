package com.example.newsshots.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsshots.Platform

@Composable
fun AboutScreen() {

    Column {
        ToolAppBar()
        AboutContentView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolAppBar() {
    TopAppBar(title = {
        Text(text = "About")
    })
}

@Composable
fun AboutContentView() {
    val platform = Platform()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
    ) {
        RowView(title = "Manufacturer", subtitle = platform.deviceManufacturer)
        RowView(title = "Model", subtitle = platform.deviceModel)
        RowView(title = "Os version", subtitle = platform.osVersion)
    }

}

@Composable
fun RowView(title: String, subtitle: String) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {

        Text(text = title, style = TextStyle(color = Color.Gray, fontSize = 14.sp))
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = subtitle, style = TextStyle(fontSize = 20.sp))
        Spacer(modifier = Modifier.height(2.dp))
        Divider()

    }
}
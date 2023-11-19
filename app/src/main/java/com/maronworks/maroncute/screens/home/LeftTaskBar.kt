package com.maronworks.maroncute.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavHostController
import com.maronworks.maroncute.R
import com.maronworks.maroncute.features.vscode.VsCode
import com.maronworks.maroncute.navigation.Screens

@Composable
fun LeftTaskBar(
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .width(55.dp)
            .background(MaterialTheme.colorScheme.secondaryContainer),
        verticalArrangement = Arrangement.Bottom
    ) {
        // gallery
        IconButton(
            onClick = {
                      navController.navigate(Screens.Gallery.Route)
            },
            modifier = Modifier
                .size(width = 55.dp, height = 55.dp)
                .padding(all = 4.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.gallery),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
                    .background(MaterialTheme.colorScheme.onPrimary),
                contentScale = ContentScale.Crop
            )
        }
        // vs code
        IconButton(
            onClick = {
                navController.navigate(Screens.VsCode.Route)
            },
            modifier = Modifier
                .size(width = 55.dp, height = 55.dp)
                .padding(all = 4.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.vscode),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
                    .background(MaterialTheme.colorScheme.onPrimary),
                contentScale = ContentScale.Crop
            )
        }
        // home
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(width = 55.dp, height = 55.dp)
                .padding(all = 4.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_button),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
                    .background(MaterialTheme.colorScheme.onPrimary),
                contentScale = ContentScale.Crop
            )
        }
    }
}

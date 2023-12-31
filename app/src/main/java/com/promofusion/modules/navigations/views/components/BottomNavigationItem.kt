package com.promofusion.modules.navigations.views.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun BottomNavigationItemContainer(
    modifier: Modifier,
    content: @Composable (RowScope.() -> Unit)
) {
    Row(
        modifier = modifier
            .wrapContentSize(align = Alignment.Center),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        content()
    }

}
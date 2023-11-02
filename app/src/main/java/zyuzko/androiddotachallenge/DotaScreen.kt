package zyuzko.androiddotachallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun DotaScreen() {

    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    Column() {
        DotaScreenHeader()

        LazyColumn(
            state = lazyListState,
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp))
                .background(AppTheme.BgColors.primaryBlue)
                .zIndex(0.5f)
        ) {
            item {
                MainContent()
            }
        }
    }

}

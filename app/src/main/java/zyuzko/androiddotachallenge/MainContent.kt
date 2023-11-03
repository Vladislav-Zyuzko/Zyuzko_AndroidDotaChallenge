package zyuzko.androiddotachallenge

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.zIndex
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp))
            .background(AppTheme.BgColors.primaryBlue)
            .zIndex(0.5f)
            .padding(start = 24.dp, end = 24.dp),

    ) {
        Text(
            text = stringResource(id = R.string.game_description),
            style = AppTheme.TextStyle.Regular_12_19,
            color = AppTheme.TextColors.dimLightGrey,
            modifier = Modifier.padding(top = 135.dp)
        )
        VideoPreviewRow(
            previewResList = listOf(
                R.drawable.video_preview1,
                R.drawable.video_preview2,
            )
        )
    }

}

@Composable
fun VideoPreviewRow(
    previewResList: List<Int>,
) {
    LazyRow(
        modifier = Modifier.padding(top = 43.dp)
    ) {
        itemsIndexed(previewResList) { index, item ->
            val contentPadding = when (index) {
                0 -> PaddingValues()
                else -> PaddingValues(start = 12.dp)
            }
            Image(
                painter = painterResource(id = item),
                contentDescription = "video_preview$index",
                modifier = Modifier
                    .padding(contentPadding)
                    .height(130.dp)
                    .clip(RoundedCornerShape(20.dp))

            )
        }
    }
}
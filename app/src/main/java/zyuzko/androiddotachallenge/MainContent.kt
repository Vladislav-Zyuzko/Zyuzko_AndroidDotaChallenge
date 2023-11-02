package zyuzko.androiddotachallenge

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
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun MainContent() {
    Column(
        modifier = Modifier.padding(start = 24.dp, end = 24.dp),

    ) {
        Text(
            text = stringResource(id = R.string.game_description),
            style = AppTheme.TextStyle.Regular_12_20,
            color = AppTheme.TextColors.dimLightGrey,
            modifier = Modifier.padding(top = 113.dp)
        )
        VideoPreviewRow(
            previewResList = listOf(
                R.drawable.video_preview1,
                R.drawable.video_preview2,
            )
        )
        PrimaryButton(

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

@Composable
fun PrimaryButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 47.dp)
            .height(64.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppTheme.ButtonColors.primaryYellow,
            contentColor = AppTheme.TextColors.primaryBlack
        )
    ) {
        Text(
            text = stringResource(id = R.string.install) ,
            style = AppTheme.TextStyle.Bold_20,
        )
    }
}
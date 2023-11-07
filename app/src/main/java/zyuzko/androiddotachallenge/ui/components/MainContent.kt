package zyuzko.androiddotachallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.zIndex
import zyuzko.androiddotachallenge.R
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
        ScrollableChipsRow()
        Text(
            text = stringResource(id = R.string.game_description),
            style = AppTheme.TextStyle.Regular_12_19,
            color = AppTheme.TextColors.dimLightGrey,
            modifier = Modifier.padding(top = 30.dp)
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
            Box(
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = item),
                    contentDescription = "${R.string.video_image_description}$index",
                    modifier = Modifier
                        .padding(contentPadding)
                        .height(130.dp)
                        .clip(RoundedCornerShape(20.dp))

                )
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    TransparentCircularBox(size = 48.dp)
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        modifier = Modifier
                            .height(12.dp)
                            .width(10.dp),
                        contentDescription = stringResource(id = R.string.play_icon_description),
                    )
                }
            }
        }
    }
}

@Composable
fun TransparentCircularBox(
    size: Dp,
) {
    Box(
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .background(AppTheme.BgColors.dimWhite)
    )
}

@Composable
@Preview(showBackground = true)
fun MainContentPreview() {
    MainContent()
}

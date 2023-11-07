package zyuzko.androiddotachallenge.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import zyuzko.androiddotachallenge.R
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun ScrollableChipsRow() {
    val items = listOf(
        stringResource(id = R.string.chip_content1),
        stringResource(id = R.string.chip_content2),
        stringResource(id = R.string.chip_content3),
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(top = 91.dp)
    ) {
        itemsIndexed(items) { index, item ->
            Surface(
                shape = CircleShape,
                color = AppTheme.BgColors.bluePrimary,
            ) {
                SurfaceContent(chipName = item)
            }
        }

    }
}

@Composable
fun SurfaceContent(chipName: String) {
    Text(
        text = chipName,
        style = AppTheme.TextStyle.Medium_10,
        color = AppTheme.TextColors.primaryBlue,
        modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp)
    )
}

@Preview
@Composable
fun ScrollableChipsRowPreview() {
    ScrollableChipsRow()
}

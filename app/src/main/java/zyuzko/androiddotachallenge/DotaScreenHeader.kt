package zyuzko.androiddotachallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun DotaScreenHeader() {
    HeaderBackground(
        painter = painterResource(id = R.drawable.bg_header),
        modifier = Modifier
            .fillMaxWidth()
            .height(296.dp)
            .zIndex(1f)
    )
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = stringResource(id = R.string.header_image_description),
            contentScale = ContentScale.FillWidth,
        )
        Row(
            modifier = Modifier.offset(x=21.dp, y=280.dp)
        ) {
            DotaLogo(shape = RoundedCornerShape(20.dp))
            Column(
                modifier = Modifier.padding(start = 12.dp, top = 30.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.game_name),
                    style = AppTheme.TextStyle.Bold_20_26,
                    color = AppTheme.TextColors.primaryWhite
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 7.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.game_stars),
                        contentDescription = stringResource(id = R.string.game_stars_image_description),
                        modifier = Modifier.height(12.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.game_downloads),
                        style = AppTheme.TextStyle.Regular_12_0_5,
                        color = AppTheme.TextColors.darkGrey,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun DotaLogo(shape: RoundedCornerShape) {
    Box(
        modifier = Modifier
            .width(88.dp)
            .height(88.dp)
            .clip(shape)
            .background(AppTheme.BgColors.primaryBlack)
            .border(3.dp, AppTheme.BgColors.blueGrey, shape)
            .padding(17.dp)
    ) {
        Image(
            modifier = Modifier
                .height(55.dp)
                .width(55.dp),
            painter = painterResource(id = R.drawable.dota_logo),
            contentDescription = stringResource(id = R.string.logo_description)
        )
    }
}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    DotaScreenHeader()
}

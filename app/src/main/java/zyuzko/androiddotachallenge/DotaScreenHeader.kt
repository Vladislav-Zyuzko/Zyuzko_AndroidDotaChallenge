package zyuzko.androiddotachallenge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun DotaScreenHeader() {
    HeaderBackground(
        painter = painterResource(id = R.drawable.bg_header),
        modifier = Modifier
            .fillMaxWidth()
            .height(296.dp)
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
            contentDescription = "Header",
            contentScale = ContentScale.FillWidth,
        )
        DotaLogo(shape = RoundedCornerShape(20.dp))
    }
}

@Composable
private fun DotaLogo(shape: RoundedCornerShape) {
    Box(
        modifier = Modifier
            .offset(x=21.dp, y=265.dp)
            .width(88.dp)
            .height(88.dp)
            .clip(shape)
            .background(AppTheme.BgColors.primaryBlack)
            .border(3.dp, AppTheme.BgColors.blueGrey, shape)
            .padding(17.dp),
    ) {
        Image(
            modifier = Modifier
                .height(55.dp)
                .width(55.dp),
            painter = painterResource(id = R.drawable.dota_logo),
            contentDescription = "logo"
        )
    }
}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    DotaScreenHeader()
}
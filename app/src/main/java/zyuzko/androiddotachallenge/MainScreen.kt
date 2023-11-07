package zyuzko.androiddotachallenge

import android.view.RoundedCorner
import androidx.compose.foundation.background
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun MainScreen() {

    ApplySystemBarColors()

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = AppTheme.BgColors.primaryBlack,
    ) {
        DotaScreen()
    }
}


@Composable
private fun ApplySystemBarColors() {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setStatusBarColor(color = Color.Transparent)
        systemUiController.setNavigationBarColor(color = Color.Transparent)
    }
}

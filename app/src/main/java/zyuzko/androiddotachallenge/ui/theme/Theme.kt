package zyuzko.androiddotachallenge.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color


object AppTheme {

    object BgColors {
        val primaryBlue = Color(red=5/255f, green=11/255f, blue=24/255f, alpha=1f)
        val primaryBlack = Color(red=0f, green=0f, blue=0f, alpha=1f)
        val bluePrimary = Color(red=68/255f, green=169/255f, blue=244/255f, alpha=0.24f)
        val blueGrey = Color(31/255f, 36/255f, 48/255f, 1f)
        val darkGrey = Color(26/255f, 31/255f, 41/255f, 1f)
    }

    object ButtonColors {
        val primaryYellow = Color(red=244/255f, green=209/255f, blue=68/255f, alpha=1f)
    }

    object TextColors {
        val lightGrey = Color(red=238/255f, green=242/255f, blue=251/255f, alpha=1f)
        val dimLightGrey = Color(red=238/255f, green=242/255f, blue=251/255f, alpha=0.70f)
        val primaryGrey = Color(red=168/255f, green=173/255f, blue=183/255f, alpha=1f)
        val darkGrey = Color(red=69/255f, green=69/255f, blue=77/255f, alpha=1f)
        val dimWhite = Color(red=1f, green=1f, blue=1f, alpha=0.40f)
        val primaryWhite = Color(red=1f, green=1f, blue=1f, alpha=1f)
        val primaryBlack = Color(red=5/255f, green=11/255f, blue=24/255f, alpha=1f)
        val primaryBlue = Color(red=68/255f, green=169/255f, blue=244/255f, alpha=1f)
    }

    object TextStyle {
        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Bold_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Bold_16
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    ),
                    letterSpacing = 0.6.sp
                )
        val Regular_12_19
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Regular_12_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 20.sp,
                    letterSpacing = 0.5.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Regular_12_0_5
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    letterSpacing = 0.5.sp,
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Regular_16_0_5
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    letterSpacing = 0.5.sp,
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
    }
}
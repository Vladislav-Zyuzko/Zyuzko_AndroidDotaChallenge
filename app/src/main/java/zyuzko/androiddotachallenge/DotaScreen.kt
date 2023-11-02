package zyuzko.androiddotachallenge

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun DotaScreen() {

    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            DotaScreenHeader()
        }
        item {
            MainContent()
        }
        item {
            PrimaryButton(context = context)
        }
    }
}

@Composable
fun PrimaryButton(
    context: Context,
) {
    Button(
        onClick = { Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show() },
        modifier = Modifier
            .background(AppTheme.BgColors.primaryBlue)
            .fillMaxWidth()
            .padding(vertical = 47.dp, horizontal = 24.dp)
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

package zyuzko.androiddotachallenge

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import zyuzko.androiddotachallenge.ui.theme.AppTheme

@Composable
fun DotaScreen() {

    val context = LocalContext.current
    val lazyListState = rememberLazyListState()
    val comments = listOf(
        CommentUi(
            user = UserUi(
                avatar = R.drawable.avatar_1,
                name = stringResource(id = R.string.username1),
            ),
            commentBody = stringResource(id = R.string.comment_body1),
            commentDate = stringResource(id = R.string.comment_date1)
        ),
        CommentUi(
            user = UserUi(
                avatar = R.drawable.avatar_2,
                name = stringResource(id = R.string.username2),
            ),
            commentBody = stringResource(id = R.string.comment_body2),
            commentDate = stringResource(id = R.string.comment_date2)
        ),
    )

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
            RatingsHeader()
        }
        itemsIndexed(comments) { index, item ->
            CommentBlock(
                commentUi = item,
                modifier = Modifier
                    .background(AppTheme.BgColors.primaryBlue)
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 30.dp,
                    )
            )
            if (index < comments.lastIndex) {
                Divider(
                    color = AppTheme.BgColors.darkGrey,
                    thickness = 1.dp,
                    modifier = Modifier
                        .background(AppTheme.BgColors.primaryBlue)
                        .padding(top = 24.dp)
                )
            }
        }
        item {
            PrimaryButton(context = context)
        }
    }
}

@Composable
fun RatingsHeader() {
    Column(
        modifier = Modifier
            .background(AppTheme.BgColors.primaryBlue)
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 0.dp, start = 24.dp, end = 24.dp)
    ) {
        Text(
            text = stringResource(id = R.string.ratings_header),
            style = AppTheme.TextStyle.Bold_16,
            color = AppTheme.TextColors.lightGrey
        )
        Row(
            modifier = Modifier.padding(top = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.game_rating),
                style = AppTheme.TextStyle.Bold_48,
                color = AppTheme.TextColors.primaryWhite
            )
            Column(
                modifier = Modifier.padding(start = 17.19.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rating_stars),
                    contentDescription = stringResource(id = R.string.rating_stars_image_description),
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .height(12.dp)
                )
                Text(
                    text = stringResource(id = R.string.game_reviews),
                    style = AppTheme.TextStyle.Regular_12_0_5,
                    color = AppTheme.TextColors.primaryGrey,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Composable
fun CommentBlock(
    commentUi: CommentUi,
    modifier: Modifier = Modifier
) {
    Column(modifier=modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ) {
                Image (
                    painter = painterResource(commentUi.user.avatar),
                    contentDescription =  commentUi.user.name + stringResource(id = R.string.avatar_description),
                    contentScale = ContentScale.Crop,
                )
            }
            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(
                    text = commentUi.user.name,
                    style = AppTheme.TextStyle.Regular_16_0_5,
                    color = AppTheme.TextColors.primaryWhite,
                )
                Text(
                    text = commentUi.commentDate,
                    style = AppTheme.TextStyle.Regular_12_0_5,
                    color = AppTheme.TextColors.dimWhite,
                    modifier = Modifier.padding(top = 6.dp)
                )
            }
        }
        Text(
            text = commentUi.commentBody,
            style = AppTheme.TextStyle.Regular_12_20,
            color = AppTheme.TextColors.primaryGrey,
            modifier = Modifier.padding(top = 16.dp)
        )
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
            .padding(vertical = 40.dp, horizontal = 24.dp)
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

data class CommentUi(
    val user: UserUi,
    val commentBody: String,
    val commentDate: String
)

data class UserUi(
    val avatar: Int,
    val name: String
)

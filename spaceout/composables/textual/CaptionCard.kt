package maksim.spaceout.composables.textual

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CaptionCard(modifier: Modifier, contentDescription: String) {

    val contentAlignment =
        Alignment.Center//if (side == Side.Start) Alignment.CenterStart else Alignment.CenterEnd
    val textAlignment =
        Alignment.CenterHorizontally//if (side == Side.Start) Alignment.Start else Alignment.End

    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = contentAlignment) {
        Card(
            modifier = modifier.wrapContentWidth(),
            shape = CircleShape,
            colors = CardDefaults.cardColors(Color(0xFF38343D)),
            elevation = CardDefaults.cardElevation(9.dp),
        ) {

            Column(
                horizontalAlignment = textAlignment
            ) {
                BaseText(
                    text = contentDescription,
                    modifier = Modifier.padding(15.dp),
                    color = Color(0xFFA796B3)
                )
            }
        }
    }
}
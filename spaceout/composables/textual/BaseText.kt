package maksim.spaceout.composables.textual

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import maksim.spaceout.R


@Composable
fun BaseText(
    text: String,
    modifier: Modifier = Modifier,
    letterSpacing: TextUnit = 0.sp,
    fontFamily: FontFamily = FontFamily(Font(R.font.unbounded_medium)),
    color: Color = Color(0xFFA488B6),
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: TextUnit = 15.sp
) {
    Text(
        text = text,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        color = color,
        fontWeight = fontWeight,
        fontSize = fontSize,
        modifier = modifier,
    )
}
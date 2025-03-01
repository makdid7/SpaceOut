package maksim.spaceout.composables.textual

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import maksim.spaceout.R

@Composable
fun Subheading(text: String) {
    BaseText(
        text = text,
        fontFamily = FontFamily(Font(R.font.unbounded_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
    )
}

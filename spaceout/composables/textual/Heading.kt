package maksim.spaceout.composables.textual

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import maksim.spaceout.R

@Composable
fun Heading() {
    BaseText(
        text = "Space out.",
        fontFamily = FontFamily(Font(R.font.bright_melody)),
        letterSpacing = 2.sp,
        color = Color(0xFFB58FCE),
        fontWeight = FontWeight.Bold,
        fontSize = 50.sp
    )
}
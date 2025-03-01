package maksim.spaceout.composables.textual

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import maksim.spaceout.R

@Composable
fun Subheading() {
    BaseText(
        text = "Welcome to Hubble's illustrious vision of the uncharted void...",
        fontFamily = FontFamily(Font(R.font.unbounded_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
    )
}
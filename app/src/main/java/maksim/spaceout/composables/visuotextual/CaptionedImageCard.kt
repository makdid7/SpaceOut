package maksim.spaceout.composables.visuotextual

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import maksim.spaceout.composables.textual.CaptionCard
import maksim.spaceout.composables.visual.ImageCard

@Composable
fun CaptionedImageCard(
    modifier: Modifier = Modifier, painter: Painter, contentDescription: String
) {
    ImageCard(modifier = modifier, painter = painter, contentDescription = contentDescription)
    CaptionCard(modifier = Modifier.offset(y = (-30).dp), contentDescription)
}
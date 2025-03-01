package maksim.spaceout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import maksim.spaceout.composables.textual.CaptionCard
import maksim.spaceout.composables.textual.Heading
import maksim.spaceout.composables.textual.Subheading
import maksim.spaceout.composables.visual.ImageCard
import maksim.spaceout.composables.visuotextual.CaptionedImageCard


val bgColor = Color(0xFF2e293a)


@Composable
fun GreetingSection() {
    Column {
        Spacer(modifier = Modifier.height(100.dp))
        Heading()
        Spacer(modifier = Modifier.height(40.dp))
        Subheading()
        Spacer(modifier = Modifier.height(80.dp))
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column(
                modifier = Modifier
                    .background(bgColor)
                    .padding(horizontal = 18.dp)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {

                GreetingSection()

                CaptionedImageCard(
                    // https://fineartamerica.com/featured/hydrus-globular-cluster-incredible-outerspace-stars-credit-original-image-by-esa-hubble-nasa-astronaut-blak.html
                    // "Hydrus Globular Cluster Incredible Outerspace Stars Credit, Original Image by ESA/Hubble, NASA is a photograph by Astronaut Blak which was uploaded on December 31st, 2021."
                    painter = painterResource(id = R.drawable.stars),
                    contentDescription = "A cluster of stars"
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    ImageCard(
                        modifier = Modifier.weight(2/3f).height(140.dp),
                        // https://esahubble.org/images/heic1608a/
                        painter = painterResource(id = R.drawable.nebula),
                        contentDescription = ""
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    ImageCard(
                        modifier = Modifier.weight(1/3f).height(140.dp),
                        // https://esahubble.org/images/opo1801a/
                        painter = painterResource(id = R.drawable.bulge),
                        contentDescription = "Crowded Hub of our Milky Way Galaxy"
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    ImageCard(
                        modifier = Modifier.weight(1/3f).height(120.dp),
                        // https://esahubble.org/images/heic2011c/
                        painter = painterResource(id = R.drawable.ngc7027),
                        contentDescription = ""
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    ImageCard(
                        modifier = Modifier.weight(1/3f).height(120.dp),
                        // "Tapestry of Blazing Starbirth" What a title. https://esahubble.org/images/heic2007a/
                        painter = painterResource(id = R.drawable.cosmic_reef),
                        contentDescription = ""
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    ImageCard(
                        modifier = Modifier.weight(1/3f).height(120.dp),
                        // https://hubblesite.org/contents/media/images/2020/31/4680-Image
                        painter = painterResource(id = R.drawable.butterfly),
                        contentDescription = ""
                    )

                }

                Spacer(modifier = Modifier.height(20.dp))

                CaptionedImageCard(
                    // https://hubblesite.org/contents/media/images/2022/027/01G4NKZ1KWEZVM08XA1T67RN7X
                    painter = painterResource(id = R.drawable.cloud),
                    contentDescription = "The Small Magellanic Cloud"
                )

            }
        }
    }
}
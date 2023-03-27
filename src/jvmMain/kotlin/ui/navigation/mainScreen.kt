package ui.navigation
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp

val dark_one = Color(0x191b1c)
@Composable
fun chatSidebard()
{
    Box(
        modifier = Modifier
            .width(292.dp)
            .height(832.dp)
            .clip(RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 0.dp, bottomEnd = 0.dp))
            .background(Color(red = 0.13750000298023224f, green = 0.13750000298023224f, blue = 0.13750000298023224f, alpha = 1f))
    ){
        Column(
            modifier =
            Modifier
                .background(Color(212023))
                .fillMaxHeight() //column doesn't reach all the way to the bottom
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
        )
        {
            Row(modifier = Modifier.padding(bottom = 13.dp).fillMaxWidth()) //new chat button
            {
                OutlinedButton(
                    onClick = {/*Dark and Light theme goes here*/},
                    border = BorderStroke(1.dp, Color.White),
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Transparent))
                {
                    Icon(Icons.Rounded.Add,"", tint = Color.White)
                    Text("New chat", color = Color.White)
                }
            }

            Row(modifier = Modifier.padding(bottom = 13.dp)) //new chat button
            {
                TextButton(onClick = {/*Dark and Light theme goes here*/},)
                {
                    Icon(Icons.Outlined.ChatBubble,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("New chat", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row(modifier = Modifier.padding(bottom = 13.dp)) //new chat button
            {
                TextButton(onClick = {/*Dark and Light theme goes here*/},)
                {
                    Icon(Icons.Outlined.ChatBubble,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("New chat", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row(modifier = Modifier.padding(bottom = 13.dp)) //new chat button
            {
                TextButton(onClick = {/*Dark and Light theme goes here*/},)
                {
                    Icon(Icons.Outlined.ChatBubble,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("New chat", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row(modifier = Modifier.padding(bottom = 13.dp)) //new chat button
            {
                TextButton(onClick = {/*Dark and Light theme goes here*/},)
                {
                    Icon(Icons.Outlined.ChatBubble,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("New chat", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row(modifier = Modifier.padding(bottom = 13.dp))//chats
            {
                TextButton(onClick = {/*Dark and Light theme goes here*/},)
                {
                    Icon(Icons.Outlined.ChatBubble,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("New chat", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }
//---------------------------------------------------------------------------------------------------------------------------------------
            Divider(Modifier.padding(bottom = 33.dp).width(273.dp), color = Color.White, thickness = 1.dp)
//---------------------------------------------------------------------------------------------------------------------------------------
            Row()//additional options
            {
                TextButton(onClick = {/*Dark and Light theme goes here*/ },)
                {
                    Icon(Icons.Rounded.Delete, "", tint = Color.White)
                    Text("Clear Conversations", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row()//additional options
            {
                TextButton(onClick = {/*Dark and Light theme goes here*/ },)
                {
                    Icon(Icons.Outlined.LightMode,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("Light mode", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row()
            {
                TextButton(onClick =  {})
                {
                    Icon(Icons.Outlined.Gamepad,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("OpenAI Discord", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row()
            {

                TextButton(onClick = {/*Dark and Light theme goes here*/ },)
                {
                    Icon(Icons.Outlined.OpenInNew,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("Updates & FAQ", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }

            Row()
            {

                TextButton(onClick = {/*Dark and Light theme goes here*/},)
                {
                    Icon(Icons.Outlined.Logout,"", Modifier.padding(start = 2.dp), tint = Color.White)
                    Text("Log out", Modifier.padding(start = 7.dp), color = Color.White)
                }
            }
        }
    }
}

val examples = listOf("Explain quantum computing in simple terms", "Got any creative ideas for a 10 year old’s birthday?", "How do I make an HTTP request in Javascript?")
val capabilities = listOf("Remembers what user said earlier in the conversation", "Allows user to provide follow-up corrections", "Trained to decline inappropriate requests")
val limitations = listOf("May occasionally generate incorrect information", "May occasionally produce harmful instructions or biased content", "Limited knowledge of world and events after 2021")

@Composable
fun home()
{
    Text("ChatGPT")
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
    {
       Icon(Icons.Outlined.LightMode,"")
        Text("Examples")

        Row(){

        }
        Row(){}
        Row(){}
    }

    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Icon(Icons.Outlined.Bolt,"")
        Text("Capabilities")

        Row(){}
        Row(){}
        Row(){}
    }

    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Icon(Icons.Rounded.Warning,"")
        Text("Limitations")

        Row(){}
        Row(){}
        Row(){}
    }

}

////@Composable
////fun mainScreen()
////{
////    ConstraintLayout()
////    {
////        val (sections, text) = createRefs()
////    }
//}

@Composable
@Preview
fun preview()
{
    chatSidebard()
}
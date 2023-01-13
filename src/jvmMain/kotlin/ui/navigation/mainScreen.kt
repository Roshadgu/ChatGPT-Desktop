package ui.navigation
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val dark_one = Color(0x191b1c)
@Composable
fun chatSidebard()
{
    Column(modifier = Modifier.background(Color(212023))){
        Row() //new chat button
        {
            OutlinedButton(
                onClick = {/*Dark and Light theme goes here*/},
                border = BorderStroke(1.dp, Color.White),
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Transparent))
            {
                Text("New chat\n", color = Color.White)
            }
        }
        Row()//chats
        {

        }
        Row()//additional options
        {
            Button(onClick = {/*Dark and Light theme goes here*/ },)
            {
                Text("Light mode\n")
            }
        }

        Row()
        {

            Button(onClick = {/*Dark and Light theme goes here*/ },)
            {
                Text("OpenAI Discord\n")
            }
        }

        Row()
        {

            Button(onClick = {/*Dark and Light theme goes here*/ },)
            {
                Text("Updates & FAQ\n")
            }
        }

        Row()
        {

            Button(onClick = {/*Dark and Light theme goes here*/},)
            {
                Text("Log out")
            }
        }
    }
}

@Composable
@Preview
fun preview()
{
    chatSidebard()
}
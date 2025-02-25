package br.senai.sp.jandira.mytrips.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun TelaLogin (modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .align(alignment = Alignment.TopEnd),
            shape = RoundedCornerShape(
                bottomStart = 15.dp
            ),
            colors = CardDefaults.cardColors(
                Color(color = 0xFFFD0548)
            )
        ) {}
        Card(
            modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .align(alignment = Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 15.dp
            ),
            colors = CardDefaults.cardColors(
                Color(color = 0xFFFD0548)
            )
        ){
        }
        Column(
            modifier = Modifier
                .padding(32.dp),
            verticalArrangement = Arrangement.SpaceAround,

        ){
            Column (
                modifier = Modifier
                    .padding(bottom = 50.dp)
            ){
                Text(
                text = stringResource(R.string.login),
                fontSize = 45.sp,
                color = Color(0xFFF33567)
            )
                Text(
                    text = stringResource(R.string.please_sign_in_to_continue),
                    fontSize = 13.sp,
                    color = Color(0xFFB5B9B9),
                    fontWeight = FontWeight.Bold

                )
            }
            Column(
                horizontalAlignment = Alignment.End
            ) {

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(12.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xFFF33567)
                            )
                    },
                    label = {
                        Text(text = stringResource(R.string.your_email))
                    }

                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .padding(bottom = 50.dp),
                    shape = RoundedCornerShape(12.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xFFF33567)
                        )
                    },
                    label = {
                        Text(text = stringResource(R.string.your_password))
                    }
                )
                    Button(
                        modifier = Modifier
                            .padding(bottom = 50.dp),
                        colors = ButtonDefaults.buttonColors(
                          Color(color = 0xFFF33567)
                        ),
                        onClick = {},

                     ) {
                        Text(
                        text = stringResource((R.string.sing_in))
                    )
                        Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )

                }
                Row (){
                    Text(
                        text = stringResource(R.string.account),
                        fontSize = 13.sp,
                        color = Color(0xFFB5B9B9),
                        fontWeight = FontWeight.Bold

                    )
                    Text(
                        text = stringResource(R.string.sign_up),
                        fontSize = 13.sp,
                        color = Color(0xFFF33567),
                        fontWeight = FontWeight.Bold

                    )
                }

            }
        }

    }

}

@Preview(showSystemUi = true)
@Composable
private fun TelaLoginPreview() {
    TelaLogin()
}
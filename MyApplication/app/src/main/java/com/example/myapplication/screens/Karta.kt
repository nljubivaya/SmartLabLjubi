package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Karta() {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
            modifier = Modifier.padding(top = 50.dp, start = 265.dp)
        )
        Text(
            text = "Создание карты \nпациента",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(top = 0.dp, bottom = 50.dp, start = 25.dp)
        )
        Text(
            text = "Без карты пациента вы не сможете заказать анализы.", fontSize = 14.sp,  color = Color(0xFF939396),
            modifier = Modifier.padding(top = 0.dp, bottom = 10.dp, start = 25.dp)
        )
        Text(
            text = "В картах пациентов будут храниться результаты \nанализов вас и ваших близких.", fontSize = 14.sp,  color = Color(0xFF939396),
            modifier = Modifier.padding(top = 0.dp, bottom = 50.dp, start = 25.dp)
        )
        val name = remember{ mutableStateOf("") }
        TextField(
            value = name.value,
            onValueChange = { name.value = it },
            modifier = Modifier.fillMaxWidth(1f).padding(top = 0.dp, bottom = 20.dp, start = 25.dp, end = 35.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            textStyle = TextStyle(color = Color.Black),
            shape = RoundedCornerShape(30),

            /* colors = TextFieldDefaults.textFieldColors(
                  //backgroundColor = Color(0xFFF5F5F9),
                  focusedIndicatorColor = Color(0xFFEBEBEB),
                  unfocusedIndicatorColor = Color(0xFFEBEBEB)
              ),*/
            placeholder = { Text("Имя") }// Color(0xFF#939396)
        )


        val otchestvo = remember{ mutableStateOf("") }
        TextField(
            otchestvo.value,
            {otchestvo.value = it},
            // value = "example@mail.ru", onValueChange = {},
            modifier = Modifier.fillMaxWidth(1f).padding(top = 0.dp, bottom = 20.dp, start = 25.dp, end = 35.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            textStyle = TextStyle(color = Color.Black),
            shape = RoundedCornerShape(30),
            placeholder = { Text("Отчество") }// Color(0xFF#939396)
        )
        val familia = remember{ mutableStateOf("") }
        TextField(
            familia.value,
            {familia.value = it},
            // value = "example@mail.ru", onValueChange = {},
            modifier = Modifier.fillMaxWidth(1f).padding(top = 0.dp, bottom = 20.dp, start = 25.dp, end = 35.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            textStyle = TextStyle(color = Color.Black),
            shape = RoundedCornerShape(30),
            placeholder = { Text("Фамилия") }// Color(0xFF#939396)
        )
        val datarozhdenia = remember{ mutableStateOf("") }
        TextField(
            datarozhdenia.value,
            {datarozhdenia.value = it},
            // value = "example@mail.ru", onValueChange = {},
            modifier = Modifier.fillMaxWidth(1f).padding(top = 0.dp, bottom = 20.dp, start = 25.dp, end = 35.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            textStyle = TextStyle(color = Color.Black),
            shape = RoundedCornerShape(30),
            placeholder = { Text("Дата рождения") }// Color(0xFF#939396)
        )

        val pol = remember{ mutableStateOf("") }
        TextField(
            pol.value,
            {pol.value = it},
            // value = "example@mail.ru", onValueChange = {},
            modifier = Modifier.fillMaxWidth(1f).padding(top = 0.dp, bottom = 30.dp, start = 25.dp, end = 35.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            textStyle = TextStyle(color = Color.Black),
            shape = RoundedCornerShape(30),
            placeholder = { Text("Пол") }// Color(0xFF#939396)
        )
        //val button: Button = findViewById(R.id.button)
        Button(
            onClick = { }, //button.setBackgroundColor(Color(0xFF1A6FEE))
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(top = 15.dp, start = 15.dp, end = 10.dp),
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC9D4FB),
                contentColor = Color.White

            )
        )
        {
            Text("Создать", fontSize = 17.sp)
        }
    }

}

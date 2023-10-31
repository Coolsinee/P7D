package com.example.p7d

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@Composable
//fun MutableStateInsideComposableWithoutRemember() {
//    val checkedState = remember { mutableStateOf(false) }
//    val checkedValue = checkedState.value
//    Column {
//        Row(verticalAlignment = Alignment.Top) {
//            Checkbox(checked = checkedValue, onCheckedChange = { value -> checkedState.value = value })
//            Text("Текст...", fontSize = 18.sp)
//        }
//        if (checkedValue) {
//            Text(text = "КАКОЙ-ТА ТЕКСТИК НА МЕСТЕ ОДА ...")
//        }
//    }
//}

@Composable
fun MutableStateInsideComposableWithoutRemember(checkedValue: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Checkbox(
            checked = checkedValue,
            onCheckedChange = { value -> onCheckedChange(value) },
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = if (checkedValue) "Текст после чекбокса был выбран!" else "Выберите чекбокс",
            fontSize = 18.sp,
            color = if (checkedValue) Color.Green else Color.Red
        )
    }
}


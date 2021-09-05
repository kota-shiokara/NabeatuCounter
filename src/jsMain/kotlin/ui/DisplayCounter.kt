package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import core.Counter
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.MainStyle

@Composable
fun DisplayCounter(component: Counter) {
    // TODO: ここにカウンターのコンポーネント
    val model by component.countFrame
    Div(
        attrs = {
            classes("count")
            classes(MainStyle.CounterStyle.Counter)
        }
    ) {
        Div(
            attrs = {
                classes(MainStyle.CounterStyle.CounterText)
                if (model.isAho) classes(MainStyle.CounterStyle.AhoCircle)
            }
        ) {
            Text(value = "${model.count}")
        }
//        if (model.isAho) AhoCircle()
//        if (model.isAho) Text(value = "Aho")
    }
}

@Composable
fun AhoCircle(){
    Div(
        attrs = {
            classes(MainStyle.CounterStyle.AhoCircle)
        }
    ) {

    }
}
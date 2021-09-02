package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import core.Counter
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun DisplayCounter(component: Counter) {
    // TODO: ここにカウンターのコンポーネント
    val model by component.countFrame
    Div(
        attrs = {
            classes("count")
        }
    ) {
        Text(value = "Count: ${model.count}")
        if (model.isAho) Text(value = "Aho")
    }
}
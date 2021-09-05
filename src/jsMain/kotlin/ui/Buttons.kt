package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import core.Counter
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.MainStyle

@Composable
fun Buttons(component: Counter) {
    // TODO: ここにボタンたちのコンポーネント
    val model by component.countFrame
    val isDebug = false
    Div(
        attrs = {
            classes("buttons")
            classes(MainStyle.ButtonsStyle.Buttons)
        }
    ) {
        Button(
            attrs = {
                classes(MainStyle.ButtonsStyle.Button)
                onClick {
                    if (!model.isStart) {
                        val id = window.setInterval(handler = { component.increment() }, timeout = 1000)
                        component.setInterval(id)
                    }
                }
            }
        ) {
            Text("Start")
        }

        Button(
            attrs = {
                classes(MainStyle.ButtonsStyle.Button)
                onClick {
                    if (model.isStart) window.clearTimeout(component.clearInterval())
                }
            }
        ) {
            Text("Stop")
        }

        Button(
            attrs = {
                classes(MainStyle.ButtonsStyle.Button)
                onClick {
                    if (model.isStart) window.clearTimeout(component.resetCount())
                    else component.resetCount()
                }
            }
        ) {
            Text("Reset")
        }

        if(isDebug){
            Button(
                attrs = {
                    classes(MainStyle.ButtonsStyle.Button)
                    onClick {
                        component.setCount(30)
                    }
                }
            ) {
                Text("Debug")
            }

            val debug2 = 30000
            Button(
                attrs = {
                    classes(MainStyle.ButtonsStyle.Button)
                    onClick {
                        component.setCount(debug2)
                    }
                }
            ) {
                Text("Debug $debug2")
            }
        }
    }
}
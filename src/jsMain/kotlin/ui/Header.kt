package ui

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text
import style.MainStyle

@Composable
fun Header() {
    Section(
        attrs = {
            classes(MainStyle.HeaderStyle.Header)
        }
    ) {
        Div(
            attrs = {
                classes(MainStyle.HeaderStyle.HeaderText)
            }
        ) {
            Text("NabeatuCounter")
        }
    }
}
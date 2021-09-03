
import core.Counter
import core.NabeatuCounter
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import style.AppStyleSheet
import style.Layout
import style.MainContentLayout
import ui.Buttons
import ui.DisplayCounter
import ui.Header

fun main() {
    val counter: Counter = NabeatuCounter()
    //val body = document.getElementsByTagName("body")[0] as HTMLElement
    //var count = window.setInterval()
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Layout {
            Header()
            MainContentLayout {
                DisplayCounter(counter)
                Buttons(counter)
            }
        }
    }
}
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
import androidx.compose.runtime.getValue
import core.Counter
import core.NabeatuCounter
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.HTMLElement
import org.w3c.dom.get
import style.AppStyleSheet
import ui.DisplayCounter
import ui.Header

fun main() {
    val counter: Counter = NabeatuCounter()
    //val body = document.getElementsByTagName("body")[0] as HTMLElement
    //var count = window.setInterval()
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Header()
        Div {
            DisplayCounter(counter)

            Div {
                Button(
                    attrs = {
                        onClick {
                            val id = window.setInterval(handler = { counter.increment() }, timeout = 1000)
                            counter.setInterval(id)
                        }
                    }
                ) {
                    Text("Start")
                }

                Button(
                    attrs = {
                        onClick {
//                            if(countFrame.isStart) window.clearTimeout(counter.clearInterval())
                        }
                    }
                ) {
                    Text("Stop")
                }

                Button(
                    attrs = {
                        onClick {
//                            if(countFrame.isStart) window.clearTimeout(counter.resetCount())
//                            else counter.resetCount()
                        }
                    }
                ) {
                    Text("Reset")
                }
            }

        }
    }
}
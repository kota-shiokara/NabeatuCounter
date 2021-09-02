import androidx.compose.runtime.getValue
import core.Counter
import core.NabeatuCounter
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.HTMLElement
import org.w3c.dom.get

fun main() {
    val counter: Counter = NabeatuCounter()
    //val body = document.getElementsByTagName("body")[0] as HTMLElement
    //var count = window.setInterval()
    renderComposable(rootElementId = "root") {
        Div {
            val countFrame by counter.countFrame

            Div(
                attrs = {
                    classes("count")
                }
            ) {
                Text(value = "Count: ${countFrame.count}")
                if(countFrame.isAho) Text(value = "Aho")
            }

            Div {
                Button(
                    attrs = {
                        onClick {
                            val id = window.setInterval(handler = { counter.increment() } , timeout = 1000)
                            counter.setInterval(id)
                        }
                    }
                ) {
                    Text("Start")
                }

                Button(
                    attrs = {
                        onClick {
                            if(countFrame.isStart) window.clearTimeout(counter.clearInterval())
                        }
                    }
                ) {
                    Text("Stop")
                }

                Button(
                    attrs = {
                        onClick {
                            if(countFrame.isStart) window.clearTimeout(counter.resetCount())
                            else counter.resetCount()
                        }
                    }
                ) {
                    Text("Reset")
                }
            }

        }
    }
}
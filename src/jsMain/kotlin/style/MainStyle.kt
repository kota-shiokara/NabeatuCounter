package style

import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.css.*

object MainStyle : StyleSheet(AppStyleSheet) {
    object HeaderStyle : StyleSheet(AppStyleSheet) {
        val Header by style {
            //property("box-sizing", "border-box")
            //position(Position.Fixed)
            display(DisplayStyle.Flex)
            width(100.percent)
            //property("transition", "all 300ms 0s ease")

            backgroundColor(Color.red)
        }

        val HeaderLight by style {
            color(rgb(0, 0, 0))
        }

        val HeaderDark by style {
            color(rgb(255, 255, 255))
        }

        val HeaderText by style {
            property("text-align", "center")
            width(100.percent)
        }
    }

    object CounterStyle : StyleSheet(AppStyleSheet) {

    }

    object ButtonStyle : StyleSheet(AppStyleSheet) {

    }
}
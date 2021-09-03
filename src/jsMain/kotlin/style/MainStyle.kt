package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.red
import org.jetbrains.compose.web.css.Color.white

object MainStyle : StyleSheet(AppStyleSheet) {
    object HeaderStyle : StyleSheet(AppStyleSheet) {
        val Header by style {
            //property("box-sizing", "border-box")
            //position(Position.Fixed)
            display(DisplayStyle.Flex)
            width(100.percent)
            //property("transition", "all 300ms 0s ease")

            backgroundColor(red)
        }

        val HeaderLight by style {
            color(rgb(0, 0, 0))
        }

        val HeaderDark by style {
            color(rgb(255, 255, 255))
        }

        val HeaderText by style {
            textAlign("center")
            width(100.percent)
            color(white)
        }
    }

    object CounterStyle : StyleSheet(AppStyleSheet) {
        val Counter by style {

            width(100.percent)
            height(50.percent)
            //debugBorder(darkblue)
        }

        val CounterText by style {
            textAlign("center")
            height(50.percent)
            top(50.percent)
        }
    }

    object ButtonsStyle : StyleSheet(AppStyleSheet) {
        val Buttons by style {
            margin("auto")
            display(DisplayStyle.Flex)
            //debugBorder(red)
        }

        val Button by style {
            display(DisplayStyle.InlineBlock)
            textAlign("center")
            padding(10.px, 30.px)
            color(white)
            border(1.px, LineStyle.Solid)
            margin(5.px)
            cursor("pointer")
            backgroundColor(red)
        }
    }
}

fun StyleBuilder.debugBorder(color: CSSColorValue){
    border(5.px, LineStyle.Solid, color)
}
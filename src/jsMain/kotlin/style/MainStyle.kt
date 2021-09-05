package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.red
import org.jetbrains.compose.web.css.Color.white

object MainStyle : StyleSheet(AppStyleSheet) {
    object HeaderStyle : StyleSheet(AppStyleSheet) {
        val Header by style {
            display(DisplayStyle.Flex)
            width(100.percent)
            padding(2.5.vh, 0.vw)
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
            fontSize(3.em)
        }
    }

    object CounterStyle : StyleSheet(AppStyleSheet) {
        val Counter by style {
            padding(30.vh, 30.vw)
            textAlign("center")
        }

        val CounterText by style {
            textAlign("center")
            fontSize(6.em)
            border(5.px, LineStyle.Solid, white)
        }

        val AhoCircle by style {
            borderRadius(50.percent)
            border(5.px, LineStyle.Solid, red)
        }
    }

    object ButtonsStyle : StyleSheet(AppStyleSheet) {
        val Buttons by style {
            margin("auto")
            display(DisplayStyle.Flex)
            //debugBorder(red)
            justifyContent(JustifyContent.SpaceEvenly)
        }

        val Button by style {
            display(DisplayStyle.InlineBlock)
            textAlign("center")
            fontSize(1.em)
            padding(10.px, 40.px)
            color(white)
            border(1.px, LineStyle.Solid)
            cursor("pointer")
            backgroundColor(red)
        }
    }
}

fun StyleBuilder.debugBorder(color: CSSColorValue){
    border(5.px, LineStyle.Solid, color)
}
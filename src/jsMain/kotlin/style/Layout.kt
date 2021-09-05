package style

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main

@Composable
fun Layout(content: @Composable () -> Unit){
    Div({
        style{
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            height(100.vh)
            property("box-sizing", "border-box")
            width(100.vw)
        }
    }){
        content()
    }
}

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({
        style {
            property("flex", "1 0 auto")
            property("box-sizing", "border-box")
        }
    }) {
        content()
    }
}
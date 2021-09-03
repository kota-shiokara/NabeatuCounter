package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.CSSSelector

object AppStyleSheet : StyleSheet() {
    init {
        CSSSelector.Universal style {
            margin(0.px)
        }
    }
}
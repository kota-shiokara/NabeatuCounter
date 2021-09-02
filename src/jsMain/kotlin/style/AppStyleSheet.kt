package style

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.selectors.CSSSelector

object AppStyleSheet : StyleSheet() {
    init {
        CSSSelector.Universal style {
            margin(0.px)
        }
    }
}
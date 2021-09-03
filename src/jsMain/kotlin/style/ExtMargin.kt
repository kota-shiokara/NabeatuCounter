package style

import org.jetbrains.compose.web.css.StyleBuilder

/*
* These are extension functions that can use the String.
* Because "auto" is not found in CSSNumeric.
*
* If you see this code and find "auto", please tell me in the issue!
* @auther kota-ikanoshiokara
*/

// https://developer.mozilla.org/en-US/docs/Web/CSS/margin
fun StyleBuilder.margin(vararg value: String) {
    // margin hasn't Typed OM yet
    property("margin", value.joinToString(" "))
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom
fun StyleBuilder.marginBottom(value: String) {
    property("margin-bottom", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left
fun StyleBuilder.marginLeft(value: String){
    property("margin-left", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/margin-right
fun StyleBuilder.marginRight(value: String) {
    property("margin-right", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top
fun StyleBuilder.marginTop(value: String) {
    property("margin-top", value)
}

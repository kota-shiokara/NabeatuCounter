package core

import androidx.compose.runtime.State
import data.CountFrame

interface Counter {
    val countFrame: State<CountFrame>
    fun increment()
    fun resetCount(): Int
    fun checkAho(num: Int): Boolean
    fun setInterval(intervalID: Int)
    fun clearInterval(): Int
    fun setCount(count: Int)
}
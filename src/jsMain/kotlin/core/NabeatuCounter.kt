package core

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import data.CountFrame

class NabeatuCounter : Counter {
    private val _countFrame: MutableState<CountFrame> by lazy {
        mutableStateOf(
            CountFrame(
                count = 0,
                isAho = false,
                isStart = false,
                intervalID = 0
            )
        )
    }

    override val countFrame: State<CountFrame> = _countFrame

    override fun increment() {
        val value = _countFrame.value.count
        _countFrame.value = CountFrame(value + 1, checkAho(value), _countFrame.value.isStart, _countFrame.value.intervalID)
    }

    override fun checkAho(num: Int): Boolean {
        val tmp = num + 1
        val regex = Regex("3")
        when{
            tmp % 3 == 0 -> {
                return true
            }
            regex.containsMatchIn(tmp.toString()) -> {
                return true
            }
        }
        return false
    }

    override fun setInterval(intervalID: Int) {
        _countFrame.value = CountFrame(_countFrame.value.count, _countFrame.value.isAho, true, intervalID)
    }

    override fun clearInterval(): Int {
        val tmp = _countFrame.value.intervalID
        _countFrame.value = CountFrame(_countFrame.value.count, _countFrame.value.isAho, false,0)
        return tmp
    }
}
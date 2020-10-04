package tech.briangardner.composekoans.iii_state

import androidx.compose.runtime.Composable
import androidx.lifecycle.liveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

object StreamToStateKoans {
    // Sample flow used to push data as state
    val sampleFlow = flow {
        emit("Initial")
        delay(1000)
        emit("Next")
        delay(1000)
        emit("Another")
        delay(1000)
        emit("Last")
    }

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Use sampleFlow in the composable as State.
        Tip: Look at the collectToState() function.
        Add the flow data to a Text.
        Run the task on an emulator to see the text change.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    // Sample flow used to push data as state
    val sampleLiveData = liveData {
        emit("Initial")
        delay(1000)
        emit("Next")
        delay(1000)
        emit("Another")
        delay(1000)
        emit("Last")
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Use sampleLiveData in the composable as State.
        Tip: Look at the observeAsState() function.
        Add the live data data to a Text.
        Run the task on an emulator to see the text change.
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }
}
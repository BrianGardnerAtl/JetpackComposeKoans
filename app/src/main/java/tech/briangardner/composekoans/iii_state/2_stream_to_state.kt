package tech.briangardner.composekoans.iii_state

import androidx.compose.runtime.Composable
import androidx.lifecycle.liveData
import androidx.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

object StreamToStateKoans {
    // Sample flow used to push data as state
    val sampleFlow = flow {
        delay(1000)
        emit("Initial")
        delay(1000)
        emit("Next")
        delay(1000)
        emit("Another")
        delay(1000)
        emit("Next")
        delay(1000)
        emit("Another")
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
        Tip: Look at the collectAsState() function.
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
        delay(1000)
        emit("Initial")
        delay(1000)
        emit("Next")
        delay(1000)
        emit("Another")
        delay(1000)
        emit("Next")
        delay(1000)
        emit("Another")
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

// Preview functions
@Preview
@Composable
fun previewStreamToStateKoansTask0() {
    StreamToStateKoans.task0()
}

@Preview
@Composable
fun previewStreamToStateKoansTask1() {
    StreamToStateKoans.task1()
}
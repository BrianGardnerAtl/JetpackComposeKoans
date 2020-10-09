package tech.briangardner.composekoans.ii_modifiers

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object ClickableKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a Text with "Hello Droidcon!" content.
        Add a clickable modifier that logs a message to logcat.
        Run previewClickableKoansTask0() in an emulator to see the log message
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }
}

// Preview functions
@Preview
@Composable
fun previewClickableTask0() {
    ClickableKoans.task0()
}
package tech.briangardner.composekoans.iv_platform_compat

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object AmbientKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Access the context using the ContextAmbient.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Access the current device configuration using ConfigurationAmbient.
        Decide what to display based on the device's current orientation
        In portrait, display some text that says "Portrait"
        In landscape, display some text that says "Landscape"
        Default to the portrait view.
        Run previewAmbientTask1() in an emulator and rotate it to see the different layouts.
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
fun previewAmbientTask1() {
    AmbientKoans.task1()
}
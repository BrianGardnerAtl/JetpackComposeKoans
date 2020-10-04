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
        Default to the portrait view
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create your own ambient that provides a ?
        """,
    )

    @Composable
    fun task2() {
        todoTask2()
    }
}

// Preview functions
@Preview
@Composable
fun previewAmbientTask0() {
    AmbientKoans.task0()
}

@Preview
@Composable
fun previewAmbientTask1() {
    AmbientKoans.task1()
}

@Preview
@Composable
fun previewAmbientTask2() {
    AmbientKoans.task2()
}
package tech.briangardner.composekoans.i_compose_views

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object ButtonKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Display a button that displays "Click me!"
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Display a button that displays "Click me!" with a click listener that logs a click message.
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Display a button that displays "Click me!" and is disabled
        """,
    )

    @Composable
    fun task2() {
        todoTask2()
    }

    fun todoTask3(): Nothing = TODO(
        """
        Task 3.
        Display a button that displays "Click me!" with an 8 dp elevation
        """,
    )

    @Composable
    fun task3() {
        todoTask3()
    }

    fun todoTask4(): Nothing = TODO(
        """
        Task 4.
        Display a button that displays "Click me!" with an 8 dp content padding
        """,
    )

    @Composable
    fun task4() {
        todoTask4()
    }
}

// Preview functions
@Preview
@Composable
fun previewButtonTask0() {
    ButtonKoans.task0()
}

@Preview
@Composable
fun previewButtonTask1() {
    ButtonKoans.task1()
}

@Preview
@Composable
fun previewButtonTask2() {
    ButtonKoans.task2()
}

@Preview
@Composable
fun previewButtonTask3() {
    ButtonKoans.task3()
}

@Preview
@Composable
fun previewButtonTask4() {
    ButtonKoans.task4()
}
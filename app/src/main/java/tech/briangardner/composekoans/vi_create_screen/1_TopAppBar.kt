package tech.briangardner.composekoans.vi_create_screen

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object TopAppBarKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a TopAppBar with a title "Compose Koans"
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a TopAppBar with a title "Compose Koans".
        Add a navigation icon with a click listener that logs a message when clicked.
        Tip: use the ic_nav vector asset for the icon.
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create a TopAppBar with a title "Compose Koans".
        Add an action to the app bar with a click listener that logs a message when clicked.
        Tip: use the ic_add vector asset for the icon.
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
fun previewTopAppBarTask0() {
    TopAppBarKoans.task0()
}

@Preview
@Composable
fun previewTopAppBarTask1() {
    TopAppBarKoans.task1()
}

@Preview
@Composable
fun previewTopAppBarTask2() {
    TopAppBarKoans.task2()
}
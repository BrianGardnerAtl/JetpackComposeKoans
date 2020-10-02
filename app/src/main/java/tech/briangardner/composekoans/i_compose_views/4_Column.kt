package tech.briangardner.composekoans.i_compose_views

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object ColumnKoans {

    // This is the list of 3 pieces of text to display in a column
    val textToDisplay = listOf(
        "Jetpack Compose",
        "is really cool",
        "but it is still alpha"
    )

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a column with 3 text children
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a column with 3 text children with a bottom vertical arrangement
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create a column with 3 text children with an end horizontal gravity
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
fun previewColumnTask0() {
    ColumnKoans.task0()
}

@Preview
@Composable
fun previewColumnTask1() {
    ColumnKoans.task1()
}

@Preview
@Composable
fun previewColumnTask2() {
    ColumnKoans.task2()
}
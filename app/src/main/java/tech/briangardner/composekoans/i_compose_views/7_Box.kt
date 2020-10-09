package tech.briangardner.composekoans.i_compose_views

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object BoxKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Add a box with an icon button child. The icon button should display the heart icon
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Make the box have a circle shape
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Set a blue background color on a round box
        """,
    )

    @Composable
    fun task2() {
        todoTask2()
    }

    fun todoTask3(): Nothing = TODO(
        """
        Task 4.
        Set an 8 dp padding
        """,
    )

    @Composable
    fun task3() {
        todoTask3()
    }

    fun todoTask4(): Nothing = TODO(
        """
        Task 5.
        Set the gravity of the box to bottom center
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
fun previewBoxTask0() {
    BoxKoans.task0()
}

@Preview
@Composable
fun previewBoxTask1() {
    BoxKoans.task1()
}

@Preview
@Composable
fun previewBoxTask2() {
    BoxKoans.task2()
}

@Preview
@Composable
fun previewBoxTask3() {
    BoxKoans.task3()
}

@Preview
@Composable
fun previewBoxTask4() {
    BoxKoans.task4()
}
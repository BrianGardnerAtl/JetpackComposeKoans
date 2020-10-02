package tech.briangardner.composekoans.i_compose_views

import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

object TextKoans {
    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a text element that displays "Hello Droidcon!"
        Check the preview to see how it looks.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a text element that displays "Hello Droidcon!" with a text size of 20 sp
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create a text element that displays "Hello Droidcon!" with a dark gray font color
        """,
    )

    @Composable
    fun task2() {
        todoTask2()
    }

    fun todoTask3(): Nothing = TODO(
        """
        Task 3.
        Create a text element that displays "Hello Droidcon!" with a bold font weight
        """,
    )

    @Composable
    fun task3() {
        todoTask3()
    }

    fun todoTask4(): Nothing = TODO(
        """
        Task 4.
        Create a text element that displays "Hello Droidcon!" with a right text align
        """,
    )

    @Composable
    fun task4() {
        todoTask4()
    }

    fun todoTask5(): Nothing = TODO(
        """
        Task 5.
        Create a text element that displays "Hello Droidcon!" with 3 max lines.
        Update the previewTask5() function at the bottom of the file to pass in 3 lines of
        test text.
        """,
    )

    @Composable
    fun task5() {
        todoTask5()
    }

    fun todoTask6(): Nothing = TODO(
        """
        Task 6.
        Create a text element that displays "Hello Droidcon!" with an ellipsis overflow.
        Update the previewTask5() function at the bottom of the file to pass in multiple lines
        of test text to see the overflow.
        """,
    )

    @Composable
    fun task6() {
        todoTask6()
    }

    fun todoTask7(): Nothing = TODO(
        """
        Task 7.
        Create a text element that displays "Hello Droidcon!" with a text style.
        This style should specify a dark gray text color, a 20 sp font size, and
        a right text align.
        """,
    )

    @Composable
    fun task7() {
        todoTask7()
    }
}

// Preview functions
@Preview
@Composable
fun previewTextTask0() {
    TextKoans.task0()
}

@Preview
@Composable
fun previewTextTask1() {
    TextKoans.task1()
}

@Preview
@Composable
fun previewTextTask2() {
    TextKoans.task2()
}

@Preview
@Composable
fun previewTextTask3() {
    TextKoans.task3()
}

@Preview
@Composable
fun previewTextTask4() {
    TextKoans.task4()
}

@Preview
@Composable
fun previewTextTask5() {
    TextKoans.task5()
}

@Preview
@Composable
fun previewTextTask6() {
    TextKoans.task6()
}

@Preview
@Composable
fun previewTextTask7() {
    TextKoans.task7()
}
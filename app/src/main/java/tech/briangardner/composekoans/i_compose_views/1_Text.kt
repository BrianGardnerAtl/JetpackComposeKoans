package tech.briangardner.composekoans.i_compose_views

import androidx.compose.runtime.Composable
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
        Create a text element that displays "Hello Droidcon!" with a font size of 20 sp
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
        Create a text element that displays "Hello Droidcon!" with an end text align.
        Tip: Add `modifier = Modifier.fillMaxWidth()` to the Text element so you can see the
        text alignment work in the preview and on an emulator
        """,
    )

    @Composable
    fun task4() {
        todoTask4()
    }

    fun todoTask5(): Nothing = TODO(
        """
        Task 5.
        Create a text element that displays text with 3 max lines.
        """,
    )

    @Composable
    fun task5() {
        todoTask5()
    }

    fun todoTask6(): Nothing = TODO(
        """
        Task 6.
        Create a text element that displays text with an ellipsis overflow an one line max.
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
        an end text alignment
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

// Setting the width of the preview here so the text alignment is visible
@Preview(widthDp = 400)
@Composable
fun previewTextTask4() {
    TextKoans.task4()
}

// Setting the width of the preview to test the max lines
@Preview(widthDp = 400)
@Composable
fun previewTextTask5() {
    TextKoans.task5()
}

// Setting the width of the preview here to test the ellipsis overflow
@Preview(widthDp = 400)
@Composable
fun previewTextTask6() {
    TextKoans.task6()
}

@Preview
@Composable
fun previewTextTask7() {
    TextKoans.task7()
}
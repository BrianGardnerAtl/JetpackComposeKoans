package tech.briangardner.composekoans.ii_modifiers

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object SizeKoans {
    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create an Icon with a preferred width of 24 dp and a preferred height of 24 dp
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create an Icon with a preferred size of 24 dp
        Tip: This should have the same functionality as task 0, just less code
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create a Text that fills the maximum width of the parent
        """,
    )

    @Composable
    fun task2() {
        todoTask2()
    }

    fun todoTask3(): Nothing = TODO(
        """
        Task 3.
        Create a Text that fills the maximum height of the parent
        """,
    )

    @Composable
    fun task3() {
        todoTask3()
    }

    fun todoTask4(): Nothing = TODO(
        """
        Task 4.
        Create a Text that fills the maximum size of the parent
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
fun previewSizeTask0() {
    SizeKoans.task0()
}

@Preview
@Composable
fun previewSizeTask1() {
    SizeKoans.task1()
}

@Preview
@Composable
fun previewSizeTask2() {
    SizeKoans.task2()
}

@Preview
@Composable
fun previewSizeTask3() {
    SizeKoans.task3()
}

@Preview
@Composable
fun previewSizeTask4() {
    SizeKoans.task4()
}
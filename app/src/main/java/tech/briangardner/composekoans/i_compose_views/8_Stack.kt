package tech.briangardner.composekoans.i_compose_views

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object StackKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a task with 3 box children.
        The first box should be red, the second should be green, the third should be blue
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Set the child gravity of the three boxes.
        The first should be top start
        The second should be center
        The third should be bottom end
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
fun previewStackTask0() {
    StackKoans.task0()
}

@Preview
@Composable
fun previewStackTask1() {
    StackKoans.task1()
}
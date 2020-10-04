package tech.briangardner.composekoans.vi_create_screen

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object BottomAppBarKoans {
    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a BottomAppBar with 3 icon buttons.
        Use the ic_person, ic_add, and ic_heart vector resources.
        Note: Pay attention to how the icons are laid out in the bar by default.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a BottomAppBar with 3 icons.
        Use the ic_person, ic_add, and ic_heart vector resources.
        Provide a modifier weight of 1 for each of the icons.
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
fun previewBottomAppBarTask0() {
    BottomAppBarKoans.task0()
}

@Preview
@Composable
fun previewBottomAppBarTask1() {
    BottomAppBarKoans.task1()
}
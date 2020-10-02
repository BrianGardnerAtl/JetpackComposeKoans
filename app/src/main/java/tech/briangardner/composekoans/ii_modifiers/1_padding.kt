package tech.briangardner.composekoans.ii_modifiers

import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview

object PaddingKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a Text with 8 dp of padding on all sides.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a Text with 16 dp of horizontal padding and 8 dp of vertical padding.
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create a Text with 8 dp of top padding, 16 dp of left padding, 8 dp of right padding,
        and 4 dp of bottom padding.
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
fun previewPaddingTask0() {
    PaddingKoans.task0()
}

@Preview
@Composable
fun previewPaddingTask1() {
    PaddingKoans.task1()
}

@Preview
@Composable
fun previewPaddingTask2() {
    PaddingKoans.task2()
}
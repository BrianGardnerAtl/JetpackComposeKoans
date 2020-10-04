package tech.briangardner.composekoans.v_theme

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object ColorsKoans {
    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a light color theme.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a dark color theme.
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
fun previewColorTask0() {
    ColorsKoans.task0()
}

@Preview
@Composable
fun previewColorTask1() {
    ColorsKoans.task1()
}
package tech.briangardner.composekoans.v_theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object TypographyKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a font family using the OpenSans files in res/font.
        There should be three different fonts added to the font family.
        The first should be the regular font.
        The second should be the semi-bold font.
        The third should be the bold font.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a Typography object.
        Copy over the font family from task 0 above.
        Setup h1 and h2 in the typography.
        Setup body1 and subtitle1.
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
fun previewTypographyTask0() {
    TypographyKoans.task0()
}

@Preview
@Composable
fun previewTypographyTask1() {
    TypographyKoans.task1()
}
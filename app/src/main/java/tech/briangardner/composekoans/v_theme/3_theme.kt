package tech.briangardner.composekoans.v_theme

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object ThemeKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a custom Theme.
        - Copy over the light and dark color palettes from ColorsKoans.
        - Copy over the font family and typography from TypographyKoans.
        Pass the dark theme if the system is in dark theme, else pass the light theme.
        Pass the typography.
        Pass the contents to display in the theme.
        Tip: The content to display is passed as the parameter to the task0 function.
        """,
    )

    @Composable
    fun task0(content: @Composable () -> Unit) {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Display Text using the theme created in task0.
        This text should be centered inside of a Box.
        The box should use the surface color from the theme.
        The text should use the onSurface color from the theme.
        The text should use the h1 text style from the theme.
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
fun previewThemeTask1() {
    ThemeKoans.task1()
}
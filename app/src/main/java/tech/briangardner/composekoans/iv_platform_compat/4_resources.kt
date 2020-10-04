package tech.briangardner.composekoans.iv_platform_compat

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object ResourcesKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a Text that displays the string resource R.string.welcome_message
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create an Icon with a preferred size of R.dimen.heart_size
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create an Icon tinted with R.color.heart_tint
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
fun previewResourceTask0() {
    ResourcesKoans.task0()
}

@Preview
@Composable
fun previewResourceTask1() {
    ResourcesKoans.task1()
}

@Preview
@Composable
fun previewResourceTask2() {
    ResourcesKoans.task2()
}
package tech.briangardner.composekoans.i_compose_views

import androidx.compose.runtime.Composable

object LazyColumnForKoans {

    val rowItems = listOf(
        "Jetpack Compose",
        "Navigation",
        "WorkManager",
        "ViewModel",
        "LiveData"
    )

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a lazy column for that displays a text item for each row
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a lazy column for that displays a text item for each row with
        8 dp of content padding for each row item
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create a lazy column for that displays a text item for each row with
        an end horizontal gravity
        """,
    )

    @Composable
    fun task2() {
        todoTask2()
    }
}
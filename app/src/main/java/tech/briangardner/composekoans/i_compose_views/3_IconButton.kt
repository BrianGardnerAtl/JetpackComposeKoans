package tech.briangardner.composekoans.i_compose_views

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object IconButtonKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Show an icon with the ic_person drawable resource
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Show an icon with the ic_heart vector resource
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Show an icon with the ic_heart vector resource with a dark gray tint
        """,
    )

    @Composable
    fun task2() {
        todoTask2()
    }

    fun todoTask3(): Nothing = TODO(
        """
        Task 3.
        Show an icon button with the heart icon
        """,
    )

    @Composable
    fun task3() {
        todoTask3()
    }

    fun todoTask4(): Nothing = TODO(
        """
        Task 4.
        Show an icon button with the heart icon and add a click listener to log a message
        """,
    )

    @Composable
    fun task4() {
        todoTask4()
    }

    fun todoTask5(): Nothing = TODO(
        """
        Task 5.
        Show an icon button with the heart icon that is disabled
        """,
    )

    @Composable
    fun task5() {
        todoTask5()
    }
}

// Preview functions
@Preview
@Composable
fun previewIconButtonTask0() {
    IconButtonKoans.task0()
}

@Preview
@Composable
fun previewIconButtonTask1() {
    IconButtonKoans.task1()
}

@Preview
@Composable
fun previewIconButtonTask2() {
    IconButtonKoans.task2()
}

@Preview
@Composable
fun previewIconButtonTask3() {
    IconButtonKoans.task3()
}

@Preview
@Composable
fun previewIconButtonTask4() {
    IconButtonKoans.task4()
}

@Preview
@Composable
fun previewIconButtonTask5() {
    IconButtonKoans.task5()
}
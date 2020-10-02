package tech.briangardner.composekoans.ii_modifiers

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object WeightKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a column with 3 box children.
        The first box should be red and have a weight of 2
        The second box should be blue and have a weight of 1
        The third box should be green and have a weight of 1
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a Row with 3 box children.
        The first box should be red and have a weight of 2
        The second box should be blue and have a weight of 1
        The third box should be green and have a weight of 1
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
fun previewWeightTask0() {
    WeightKoans.task0()
}

@Preview
@Composable
fun previewWeightTask1() {
    WeightKoans.task1()
}
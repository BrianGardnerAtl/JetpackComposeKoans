package tech.briangardner.composekoans.ii_modifiers

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object MultipleModifierKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a Column that takes up the full parent size and has three text children
        Each text child should take up the full width, have 8 dp of padding on all sides, 
        and have a weight of 1
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }
}

// Preview functions
@Preview
@Composable
fun previewMultipleModifierTask0() {
    MultipleModifierKoans.task0()
}
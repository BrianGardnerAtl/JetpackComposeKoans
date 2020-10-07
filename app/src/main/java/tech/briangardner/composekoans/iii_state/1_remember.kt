package tech.briangardner.composekoans.iii_state

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.ui.tooling.preview.Preview
import tech.briangardner.composekoans.iv_platform_compat.ViewModelKoans

object RememberKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a Column with Text as the first child and a TextField as the second.
        The goal is to have the Text update to match what the user enters in the TextField.
        For this, the 'state' that exists in the TextField needs to be 'hoisted' to a higher
        component in the hierarchy.
        Use mutableStateOf() to create a string state for the composable
        - set an empty string as the original state
        - This function can return the current value as well as an update function.
        Pass these to the Text and TextField.
        Run the previewRememberTask0 function at the bottom of the file on an emulator. You should
        see the contents of the Text composable update to match whatever you enter in the
        TextField.
        """,
    )

    @Composable
    fun task0() {
        val (state, setState) = mutableStateOf("")
        Column {
            Text(text = state)
            TextField(value = state, onValueChange = setState)
        }
        //todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Copy the implementation from task0 above.
        Use the remember {} function to have the composable remember the current state.
        - It's important to do this otherwise a new state object is created every time the component
          is recomposed.
        """,
    )

    @Composable
    fun task1() {
        val (state, setState) = remember { mutableStateOf("") }
        Column {
            Text(text = state)
            TextField(value = state, onValueChange = setState)
        }
        //todoTask1()
    }
}

// Preview functions
@Preview
@Composable
fun previewRememberTask0() {
    RememberKoans.task0()
}

@Preview
@Composable
fun previewRememberTask1() {
    RememberKoans.task1()
}
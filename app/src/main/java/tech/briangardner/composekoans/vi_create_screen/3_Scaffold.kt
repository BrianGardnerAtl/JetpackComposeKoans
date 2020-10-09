package tech.briangardner.composekoans.vi_create_screen

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

object ScaffoldKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a Scaffold.
        - Pull one of the TopAppBars from TopAppBarKoans
        - Pull the BottomAppBar from task1 in BottomAppBarKoans
        Pass in the TopAppBar and BottomAppBar to the Scaffold.
        Create a Text with content "Hello Compose!" as the bodyContent 
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a Scaffold.
        - Pull one of the TopAppBars from TopAppBarKoans
        - Pull the BottomAppBar from task1 in BottomAppBarKoans
        Pass in the TopAppBar and BottomAppBar to the Scaffold.
        Create a Text with content "Hello Compose!" as the bodyContent 
        Add drawerContent to the Scaffold
        - Create a Column with 3 Text items.
        - Use "Home", "Account", and "Settings" for the text
        Run this task on an emulator and drag from the side to see the drawer.
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }

    fun todoTask2(): Nothing = TODO(
        """
        Task 2.
        Create a Scaffold.
        - Pull one of the TopAppBars from TopAppBarKoans
        - Pull the BottomAppBar from task1 in BottomAppBarKoans
        Pass in the TopAppBar and BottomAppBar to the Scaffold.
        Create a Text with content "Hello Compose!" as the bodyContent
        Add a FloatingActionButton to the Scaffold
        - Create an Icon for the button contents with the ic_add vector asset
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
fun previewScaffoldTask0() {
    ScaffoldKoans.task0()
}

@Preview
@Composable
fun previewScaffoldTask1() {
    ScaffoldKoans.task1()
}

@Preview
@Composable
fun previewScaffoldTask2() {
    ScaffoldKoans.task2()
}
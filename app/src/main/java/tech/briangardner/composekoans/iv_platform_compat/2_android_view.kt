package tech.briangardner.composekoans.iv_platform_compat

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.viewinterop.AndroidView
import androidx.ui.tooling.preview.Preview
import tech.briangardner.composekoans.R

object AndroidViewKoans {
    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Access the context using ContextAmbient.
        Create a CustomView instance.
        - This class declaration is at the end of this file
        - Wrap the class creation in a remember {} block so it is not 
            created each time the function is called
        - Pass the custom view reference to the AndroidView.
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
fun previewAndroidVieAwTask0() {
    // Display the task0 composable in other composable views to show the interoperability
    Column {
        Text("First compose text")
        Text("Second compose text")
        AndroidViewKoans.task0()
    }
}

class CustomView(context: Context) : LinearLayout(context) {
    init {
        orientation = VERTICAL
        // setup text to display
        val textOne = TextView(context).apply {
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
            text = context.getString(R.string.first_android_text)
        }
        val textTwo = TextView(context).apply {
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
            text = context.getString(R.string.second_android_text)
        }
        // add children
        addView(textOne)
        addView(textTwo)
    }
}
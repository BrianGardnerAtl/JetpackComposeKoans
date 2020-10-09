package tech.briangardner.composekoans.v_theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

object ColorsKoans {
    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Create a light color theme.
        Primary color:      #283593
        Primary variant:    #001064
        on primary:         #FFFFFF
        Secondary:          #673ab7
        on secondary:       #FFFFFF
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Create a dark color theme.
        Primary color:      #1a237e
        Primary variant:    #000051
        on primary:         #FFFFFF
        Secondary:          #512da8
        on secondary:       #FFFFFF
        """,
    )

    @Composable
    fun task1() {
        todoTask1()
    }
}
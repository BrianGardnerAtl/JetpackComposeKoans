package tech.briangardner.composekoans.iv_platform_compat

object ComposeViewKoans {
    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Open the compose_view_sample.xml layout file.
        Add a ComposeView below the existing TextView.
        - Provide an id of compose_view
        - Provide a match_parent layout width
        - Provide a wrap_content layout height
        
        """,
    )

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Open ComposeViewActivity.
        Use findViewById to access the ComposeView from the layout.
        Call setContent and provide a Text composable with text "This text is from Compose"
        Right-click on ComposeViewActivity and run it in an emulator
        """,
    )
}
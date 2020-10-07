package tech.briangardner.composekoans.iv_platform_compat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.ui.platform.ComposeView
import tech.briangardner.composekoans.R

class ComposeViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compose_view_sample)
    }
}
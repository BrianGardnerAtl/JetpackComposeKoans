package tech.briangardner.composekoans.vii_navigation

import android.os.Parcelable
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.compose.runtime.savedinstancestate.listSaver
import androidx.compose.runtime.toMutableStateList
import kotlinx.android.parcel.Parcelize

class Navigator<T : Parcelable> private constructor(
    initialBackStack: List<T>,
    backDispatcher: OnBackPressedDispatcher
) {
    constructor(
        initial: T,
        backDispatcher: OnBackPressedDispatcher
    ) : this(listOf(initial), backDispatcher)

    private val backStack = initialBackStack.toMutableStateList()
    private val backCallback = object : OnBackPressedCallback(canGoBack()) {
        override fun handleOnBackPressed() {
            back()
        }
    }.also { callback ->
        backDispatcher.addCallback(callback)
    }
    val current: T get() = backStack.last()

    fun back() {
        backStack.removeAt(backStack.lastIndex)
        backCallback.isEnabled = canGoBack()
    }

    fun navigate(destination: T) {
        backStack += destination
        backCallback.isEnabled = canGoBack()
    }

    private fun canGoBack(): Boolean = backStack.size > 1

    companion object {
        /**
         * Serialize the back stack to save to instance state.
         */
        fun <T : Parcelable> saver(backDispatcher: OnBackPressedDispatcher) =
            listSaver<Navigator<T>, T>(
                save = { navigator -> navigator.backStack.toList() },
                restore = { backstack -> Navigator(backstack, backDispatcher) }
            )
    }
}

sealed class Screen : Parcelable {
    @Parcelize
    object List : Screen()

    @Parcelize
    class Detail(val itemId: Long) : Screen()
}

/**
 * Models the navigation actions in the app.
 */
class Actions(navigator: Navigator<Screen>) {
    val selectItem: (Long) -> Unit = { itemId: Long ->
        navigator.navigate(Screen.Detail(itemId))
    }
    val upPress: () -> Unit = {
        navigator.back()
    }
}
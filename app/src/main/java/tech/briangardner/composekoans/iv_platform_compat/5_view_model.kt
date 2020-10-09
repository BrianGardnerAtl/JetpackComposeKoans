package tech.briangardner.composekoans.iv_platform_compat

import androidx.compose.runtime.Composable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.ui.tooling.preview.Preview

object ViewModelKoans {

    fun todoTask0(): Nothing = TODO(
        """
        Task 0.
        Access SimpleViewModel within the composable function.
        Access the viewState LiveData as state and display it as Text.
        Pass a clickable modifier to the Text that calls updateState() on the view model.
        Run previewViewModelTask0() on an emulator to see the state update.
        """,
    )

    @Composable
    fun task0() {
        todoTask0()
    }

    fun todoTask1(): Nothing = TODO(
        """
        Task 1.
        Access ComplexViewModel within the composable function. Make sure you use the 
        ComplexViewModelFactory with an initial state of 10 when accessing the ViewModel.
        Access the viewState LiveData as state and display it as Text.
        Pass a clickable modifier to the Text that calls updateState() on the view model.
        Run previewViewModelTask1() on an emulator to see the state update.
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
fun previewViewModelTask0() {
    ViewModelKoans.task0()
}

@Preview
@Composable
fun previewViewModelTask1() {
    ViewModelKoans.task1()
}

// SimpleViewModel class used in the Koans in this file
class SimpleViewModel : ViewModel() {

    private val _viewState = MutableLiveData("Initial State")
    // Watch this LiveData within the @Composable function
    val viewState = _viewState as LiveData<String>

    private var currentState = 0

    // Call this function within the @Composable function to update the state
    fun updateState() {
        currentState += 1
        _viewState.value = "Current state: $currentState"
    }
}

// ComplexViewModel that requires an initial state parameter
class ComplexViewModel(initialState: Int) : ViewModel() {
    private val _viewState = MutableLiveData("Initial State")
    // Watch this LiveData within the @Composable function
    val viewState = _viewState as LiveData<String>

    // set the current state to the initial state passed from the Factory
    private var currentState = initialState

    // Call this function within the @Composable function to update the state
    fun updateState() {
        currentState += 1
        _viewState.value = "Current state: $currentState"
    }
}

class ComplexViewModelFactory(
    private val initialState: Int
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(viewModelClass: Class<T>): T {
        return viewModelClass.getConstructor(Int::class.java)
            .newInstance(initialState)
    }
}
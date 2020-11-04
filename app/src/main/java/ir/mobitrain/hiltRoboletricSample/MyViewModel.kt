package ir.mobitrain.hiltRoboletricSample

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MyViewModel @ViewModelInject constructor(private val listener: MyListener , @Assisted savedStateHandle: SavedStateHandle) : ViewModel() {


    fun callTest() {
        listener.update(10)
    }
}
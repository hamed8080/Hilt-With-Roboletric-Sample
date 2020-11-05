package ir.mobitrain.hiltRoboletricSample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import ir.mobitrain.hiltRoboletricSample.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() ,MyListener {

    var value: Int = 0
    val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        viewModel.callTest()
    }

    override fun update(value:Int) {
        this.value = value + 10
    }
}
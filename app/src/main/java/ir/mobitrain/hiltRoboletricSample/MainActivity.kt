package ir.mobitrain.hiltRoboletricSample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import ir.mobitrain.hiltRoboletricSample.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() ,MyListener {

    val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun update(value:Int) {

    }
}
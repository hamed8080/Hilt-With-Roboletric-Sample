package ir.mobitrain.hiltRoboletricSample

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext

@InstallIn(ActivityComponent::class)
@Module
object  MainActivityModule {

    @Provides
    fun provideListener(@ActivityContext context: Context):MyListener{
        return context as MainActivity
    }
}

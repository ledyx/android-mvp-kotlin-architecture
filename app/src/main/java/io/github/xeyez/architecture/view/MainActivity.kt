package io.github.xeyez.architecture.view

import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.github.xeyez.architecture.R
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity

@EActivity(R.layout.activity_main)
class MainActivity : AppCompatActivity() {

    @AfterViews
    fun onAfterViews() {
        Log.d("###DEBUG", "afterViews!")
    }
}

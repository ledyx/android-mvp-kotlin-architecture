package io.github.xeyez.architecture.view

import android.support.v7.app.AppCompatActivity
import android.view.View
import io.github.xeyez.architecture.R
import io.github.xeyez.architecture.presenter.MainPresenter
import io.github.xeyez.architecture.presenter.base.MainMVPContract
import kotlinx.android.synthetic.main.activity_main.*
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.Bean
import org.androidannotations.annotations.Click
import org.androidannotations.annotations.EActivity

@EActivity(R.layout.activity_main)
class MainActivity : AppCompatActivity(), MainMVPContract.View {

    @Bean
    lateinit var presenter: MainPresenter

    @AfterViews
    fun onAfterViews() {
        presenter.setView(this)
    }

    @Click(R.id.btn_count)
    fun onClick(v: View) {
        var tag = if (tv_hello.tag == null) {
            0
        } else {
            tv_hello.tag.toString().toInt()
        }

        presenter.onRequestOperation(tag)
    }

    override fun onResultOperation(result: Int) {
        tv_hello.tag = result
        tv_hello.text = tv_hello.tag.toString()
    }
}

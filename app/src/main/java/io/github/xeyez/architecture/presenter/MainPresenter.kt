package io.github.xeyez.architecture.presenter

import io.github.xeyez.architecture.presenter.base.MainMVPContract
import org.androidannotations.annotations.EBean

@EBean
class MainPresenter: MainMVPContract.Presenter {

    private lateinit var view: MainMVPContract.View

    override fun setView(view: MainMVPContract.View) {
        this.view = view
    }

    override fun onRequestOperation(oldValue: Int) {
        view.onResultOperation(oldValue + 1)
    }
}
package io.github.xeyez.architecture.presenter.base

interface BaseMVPContract {
    interface View
    interface Presenter<in V: BaseMVPContract.View> {
        fun setView(view: V)
    }
}
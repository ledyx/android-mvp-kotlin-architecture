package io.github.xeyez.architecture.presenter.base

interface MainMVPContract {
    interface View: BaseMVPContract.View {
        fun onResultOperation(result: Int)
    }

    interface Presenter: BaseMVPContract.Presenter<View> {
        fun onRequestOperation(oldValue: Int)
    }
}
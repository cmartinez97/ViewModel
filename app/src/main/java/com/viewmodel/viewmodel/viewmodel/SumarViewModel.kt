package com.viewmodel.viewmodel.viewmodel

import androidx.lifecycle.ViewModel

class SumarViewModel: ViewModel() {

    private var _resultado:Int = 0

    internal var resultado: Int
        get() {return _resultado}
        set(value) {_resultado = value}
}
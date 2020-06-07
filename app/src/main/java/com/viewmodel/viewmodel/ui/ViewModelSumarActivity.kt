package com.viewmodel.viewmodel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.viewmodel.viewmodel.R
import com.viewmodel.viewmodel.Sumar
import com.viewmodel.viewmodel.viewmodel.SumarViewModel
import kotlinx.android.synthetic.main.activity_view_model_sumar.*

class ViewModelSumarActivity : AppCompatActivity() {

    private var numero:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_sumar)

        configView()
    }

    private fun configView() {

        val sumarViewModel: SumarViewModel
        //Al modelo le proveemos la vista actual que sobrevivira a los cambios de actividad, consevando los datos
        //Y pondra a la nueva vista, los datos viejos que ya tiene guardados gracias a la clase ViewModel
        sumarViewModel = ViewModelProviders.of(this)[SumarViewModel::class.java]
        viewModelSumarActivityTvSumar.setText(" " + this.numero)
        viewModelSumarActivityTvSumarViewModel.setText(" " + sumarViewModel.resultado)

        viewModelSumarActivityBtSumar.setOnClickListener {
            this.numero = Sumar.sumar(this.numero)
            viewModelSumarActivityTvSumar.setText(" " + this.numero)
            sumarViewModel.resultado = Sumar.sumar(sumarViewModel.resultado)
            viewModelSumarActivityTvSumarViewModel.setText(" " + sumarViewModel.resultado)
        }
    }
}
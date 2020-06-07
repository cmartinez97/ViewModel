package com.viewmodel.viewmodel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.viewmodel.viewmodel.R
import com.viewmodel.viewmodel.User
import com.viewmodel.viewmodel.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_view_model_user.*

class ViewModelUserActivity : AppCompatActivity() {

    private var userList: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_user)
        configView()
    }

    private fun configView() {
        val userViewModel: UserViewModel
        //Al modelo le proveemos la vista actual que sobrevivira a los cambios de actividad, consevando los datos
        //Y pondra a la nueva vista, los datos viejos que ya tiene guardados gracias a la clase ViewModel
        userViewModel = ViewModelProviders.of(this)[UserViewModel::class.java]

        userActivityBtSalvar.setOnClickListener {
            val user = User(
                                    userActivityEtNombre.text.toString(),
                                    userActivityEtEdad.text.toString(),
                                    userActivityEtMail.text.toString(),
                                    userActivityEtDNI.text.toString())
            userList.add(user)
            userViewModel.userList.add(user)
        }

        userActivityBtVer.setOnClickListener {
            var texto = ""
            for (user in userList) {
                Log.d("usuario", "nombre: " + user.nombre)
                texto += "\n" + user.nombre + " " + user.edad + " " + user.email + " " + user.dni
            }
            userActivityTvUser.text = texto
            texto = ""
            for (user in userViewModel.userList) {
                texto += "\n" + user.nombre + " " + user.edad + " " + user.email + " " + user.dni
            }
            userActivityTvUserViewModel.text = texto
        }
    }
}
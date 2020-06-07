package com.viewmodel.viewmodel

class User() {

    private var _nombre:String = ""
    private var _edad:String = ""
    private var _email:String = ""
    private var _dni:String = ""

    constructor(nombre:String, edad:String, email:String, dni:String):this() {
        this._nombre = nombre
        this._edad = edad
        this._email = email
        this._dni = dni
    }

    internal var nombre: String
    get() {return _nombre}
    set(value) {_nombre = value}

    internal var edad: String
        get() {return _edad}
        set(value) {_edad = value}

    internal var email: String
        get() {return _email}
        set(value) {_email = value}

    internal var dni: String
        get() {return _dni}
        set(value) {_dni = value}

}
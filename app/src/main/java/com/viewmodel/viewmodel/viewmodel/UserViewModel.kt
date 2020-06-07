package com.viewmodel.viewmodel.viewmodel

import androidx.lifecycle.ViewModel
import com.viewmodel.viewmodel.User

class UserViewModel() : ViewModel() {

    private var _userList: MutableList<User> = mutableListOf()

    internal var userList: MutableList<User>
        get() {return _userList}
        set(value) {_userList = value}

    constructor (userList: MutableList<User>) : this() {
        this.userList = userList
    }

}
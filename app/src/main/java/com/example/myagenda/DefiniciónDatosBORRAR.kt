package com.example.myagenda

import kotlin.collections.mutableListOf

fun datos():MutableList<User>{
    var rst= mutableListOf<User>()

    rst.add(User(nombre="Ramon","Uno", telefono = 1))
    rst.add(User(nombre="Ramon","Dos", telefono = 2))
    rst.add(User(nombre="Ramon","Tres", telefono = 3))
    rst.add(User(nombre="A","Uno", telefono = 4))
    rst.add(User(nombre="A","Dos", telefono = 5))
    return rst
}

fun datos2() = mutableListOf<User> ().apply{
    add(User(nombre = "Ramon", apellidos = "Uno", telefono = 1))
    add(User(nombre = "Ramon", apellidos = "Dos", telefono = 2))
    add(User(nombre = "Ramon", apellidos = "Tres", telefono = 3))
    add(User(nombre = "A", apellidos = "Uno", telefono = 4))
    add(User(nombre = "A", apellidos = "Dos", telefono = 5))
}

package com.unab.guiadeejercicios

class Trabajador {

    var HorasTrabajadasExtras = 0
    var HorasTrabajadas = 1800
    var resultado = 0
    var salario = 0
        get() = field
        set(value) {
            if (value == 1000) {
                field = value
                println("Su salario es de $1000")

            } else
                println("Su salario es menor a $1000")

        }


    var nombre: String? = null
        get() = field?.toUpperCase()
        set(value) {
            if (value!!.isEmpty()) {
                println("El nombre necesita caracteres")
            } else
                field = value

        }

}
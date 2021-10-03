package com.unab.guiadeejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trabajador()
    } dj


      //Ejercicio 1
    fun trabajador(){

        var e1=Trabajador()

        e1.nombre="Kevin"
        println("El nombre del trabajador es: "+e1.nombre)
        e1.salario=1000
        println("El salario mensual del trabajador es de: "+e1.salario)


        e1.HorasTrabajadasExtras = 5
        println("Las horas trabajadas son de: "+e1.HorasTrabajadas +" Y las horas trabajas extras son de: "+e1.HorasTrabajadasExtras)
        e1.resultado = (e1.HorasTrabajadasExtras + e1.HorasTrabajadas)
        println("La horas total que el trabajador a trabajado es de: "+e1.resultado+"horas")




    }
             //Ejercicio 2
             fun tablaMul(numero:Int)
             {
                 val valor = 20

                 var operacion = 0
                 println("Tabla de multiplicar del $numero")
                 for (i in 1..valor)
                 {
                     operacion = numero * i
                     println("$numero x $i = $operacion")
                 }


             }
}
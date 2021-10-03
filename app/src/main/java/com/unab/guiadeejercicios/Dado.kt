class Dado(var numero:Int) {

    var numero1=0
    fun aleatorio()
    {
        if(numero>=1 && numero<=6)
        {
            numero1 = numero
        }else
        {
            numero1=1
        }
        println("Dado esta con el numero :$numero1")

        var numero2=(1..100).random()

        println("El numero aleatorio es: $numero2")
    }
    
}
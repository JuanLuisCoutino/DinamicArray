import java.util.ArrayList
import javax.swing.JOptionPane

fun main(args: Array<String>) {

    listaDinamica(  )
}

    fun listaNormal(){
        var numElemets = JOptionPane.showInputDialog("Enter the number of elemets you want on your array").toInt()
        var normalArray = arrayOfNulls<Int>(numElemets)
        for (i in 0 until numElemets){
            normalArray[i] = JOptionPane.showInputDialog("Enter the number").toInt()
        }

        normalArray.forEach {
            println(it)
        }
    }

    fun listaDinamica(){

        var dinamicArray = ArrayList<Int>()
        var respuesta : Char

        do {
            dinamicArray.add(JOptionPane.showInputDialog("Ingresa un numero").toInt())
            respuesta = JOptionPane.showInputDialog("Quieres continuar?\nEscribe S para continuar y N para detener")[0]

        }while (respuesta == 's' || respuesta== 'S')
        println("Tu lista es la siguiente:")

        dinamicArray.forEach {
            println(it)
        }


    }

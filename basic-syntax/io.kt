import java.util.Scanner

fun main(args : Array<String>) {
    println("Kotlin is COOL.")// Will output the string and add a new line delimeter at the end
    print("Kotlin is AWSOME")//Will just output the string

    //Basic String input
    println("Enter Somthing: ")
    var inputs = readLine()!!
    println("You have entered $inputs")

    //To get other data type input, you must use Scanner
    //You must import Scanner class from Java Standard Library
    //Integers?
    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var integer:Int = reader.nextInt()
    println("You entered: $integer")

}
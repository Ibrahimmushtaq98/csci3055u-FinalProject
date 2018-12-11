fun main(args: Array<String>) {
    val number1 = 12
    val number2 = 3
    val result: Int

    result = addNumbers(number1, number2) //Calling the function
    println("result = $result")
}
//As you can see, fun tells the compiler that it is a function, after its the function name
//after that, the arguement that will be passed in the function. 
//Optional, you can put the return type of the function
fun addNumbers(n1: Int, n2: Int): Int {
    return n1 + n2
}
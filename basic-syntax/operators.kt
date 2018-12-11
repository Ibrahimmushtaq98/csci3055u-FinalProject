fun main(args: Array<String>) {

    val number1 = 123
    val number2 = 234
    var result: Int

    //Adds the number
    result = number1 + number2
    println("number1 + number2 = $result")

    //Subtract the numbers
    result = number1 - number2
    println("number1 - number2 = $result")

    //Multiply the numbers
    result = number1 * number2
    println("number1 * number2 = $result")

    //Divide the numbers
    result = number1 / number2
    println("number1 / number2 = $result")

    //Takes the mod of the numbers
    result = number1 % number2
    println("number1 % number2 = $result")

    //Example use of assignment operators
    var numbers = 23
    numbers+=5
    println("Numbers+= $numbers")


    val a = 9
    val b = 10

    //Show case comparison operators
    var max = if(a > b) a else b

    //Show case logical operators And, Or
    max = if((a>b) && (a % 2 == 0) || (a > 0)) a else b

    //Show case statesment with brackets
    if(a> 0 && a %2 == 0){
        println("a is postive and even")
    }else if(a < 0){
        println("a is negative")
    }

}
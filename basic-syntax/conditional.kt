fun main(args: Array<String>) {

    val number = -6

    if (number > 0) {
        print("Positive number")
    } else {
        print("Negative number")
    }

    //You could also do nested if statesments
    val n1 = 3
    val n2 = 5
    val n3 = -2

    //You can also do assignments just by using Ifs statements
    val max = if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }

    //What about switch statements?
    //The keyword when achieves this
    val a = 9
    val b = 6

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    //Notice there is an else statement, this is optional
    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}
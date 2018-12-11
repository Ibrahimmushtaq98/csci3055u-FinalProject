fun main(args: Array<String>) {

    //Kotlin has the ability to loop
    var i = 1

    //This loop will print the number till 
    //It reaches the conditions
    while (i <= 3) {
        println("Line $i")
        ++i
    }

    //Kotlin has a do while loop (WHAT!!!)
    i = 0
    do {
        print("Blah")
        ++i
    } while (i <= 5)

    //Kotlin has the ability doto for loops

    for (i in 1..5) {
        println(i)
    }

    //It can iterate backwards (WOOOOOOOOOOO)
    for (i in 5..1) {
        println(i)
    }

    //It can iterate through arrays
    var language = arrayOf("Kotlin", "is", "da" "best")

    for (item in language)
        println(item)
}
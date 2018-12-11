fun main(args : Array<String>) { 
    //This example will show you Arrays!!

    // Array of integers of a size of 5
    val arr = IntArray(5)

    //Initializes an array with numbers
    val numbers: IntArray = intArrayOf(50, 20, 30, 40, 50)
    val sizes: Int = numbers.count()                        //Will grab the count of the array
    val whatsInIndex4: Int = numbers.get(4)                 //Grab the value at element 4
    numbers.set(3, 9)                                       //Set a number (9) at element (3)
    val lastIndex:Int = numbers.lastIndex                   //Gets the last valid indexs
    val containsSomthing:Boolean = numbers.any()            //Returns true if the array has atleast 1 element
    val map: Map<String, Int> = numbers.associate()         //WIll turn the list into a map
    val distinctNumbers = numbers.distinct()                //Returns the distinct value in the array
    val dropNumbers = numbers.drop(0)                       //Drops the (0) elements
    val filteredNumber = numbers.filter(s -> s % 2 ==0)     //Filters the array
}
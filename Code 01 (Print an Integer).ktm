// Kotlin Program to Print an Integer (Entered by the User)

// Method 1

import java.util.Scanner

fun main(args: Array<String>) {

    // Creates a reader instance which takes
    // input from standard input - keyboard
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    // println() prints the following line to the output screen
    println("You entered: $integer")
}

// In this example, an object of Scanner class is created, reader which takes input from the user from keyboard (standard input).

Then, nextInt() function reads the entered integer until it encounters a new line character \n (Enter). The integer is then saved in a variable, integer of type Int.

Finally, println() function prints integer to the standard output: computer screen using string templates.

// Method 2

fun main(args: Array<String>) {

    print("Enter a number: ")

    // reads line from standard input - keyboard
    // and !! operator ensures the input is not null
    val stringInput = readLine()!!

    // converts the string input to integer
    var integer:Int = stringInput.toInt()

    // println() prints the following line to the output screen
    println("You entered: $integer")
}

// In the above program, we use the function readLine() to read a line of string from the keyboard. Since readLine() can also accept null values, !! operator ensures not-null value of variable stringInput.

Then, the string stored in stringInput is converted to an integer value using the function toInt(), and stored in yet another variable integer.

Finally, integer is printed onto the output screen using println().
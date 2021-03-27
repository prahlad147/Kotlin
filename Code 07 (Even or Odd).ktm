// Kotlin Program to Check Whether a Number is Even or Odd

// Method 01

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Enter a number: ")
    val num = reader.nextInt()

    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}

// In the above program, a Scanner object, reader is created to read a number from the user's keyboard. The entered number is then stored in a variable num.

Now, to check whether num is even or odd, we calculate its remainder using % operator and check if it is divisible by 2 or not.

For this, we use if...else statement in Java. If num is divisible by 2, we print num is even. Else, we print num is odd.

We can also check if num is even or odd by using if...else as an expression.

// Method 02

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Enter a number: ")
    val num = reader.nextInt()

    val evenOdd = if (num % 2 == 0) "even" else "odd"

    println("$num is $evenOdd")
}

// Unlike Java, in Kotlin if...else statements are also expressions. So, you can store the return value from if...else statement to a variable. This is a substitute of Java's ternary operator (? :)  in Kotlin.

// In the above program, if num is divisible by 2, "even" is returned. Else, "odd" is returned. The returned value is stored in a string variable evenOdd.

Then, the result is printed on the screen using println().
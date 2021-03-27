// Kotlin Program to Check Whether a Number is Positive or Negative

// Method 01

fun main(args: Array<String>) {

    val number = 12.3

    if (number < 0.0)
        println("$number is a negative number.")
    else if (number > 0.0)
        println("$number is a positive number.")
    else
        println("$number is 0.")
}

// Method 02

fun main(args: Array<String>) {

    val number = -12.3

    when {
        number < 0.0 -> println("$number is a negative number.")
        number > 0.0 -> println("$number is a positive number.")
        else -> println("$number is 0.")
    }
}
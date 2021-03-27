// Kotlin Program to Find the Largest Among Three Numbers

// Method 01

un main(args: Array<String>) {

    val n1 = -4.5
    val n2 = 3.9
    val n3 = 2.5

    if (n1 >= n2 && n1 >= n3)
        println("$n1 is the largest number.")
    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")
    else
        println("$n3 is the largest number.")
}

// In the above program, three numbers -4.5, 3.9 and 2.5 are stored in variables n1, n2 and n3 respectively.

Then, to find the largest, the following conditions are checked using if else statements

    If n1 is greater or equals to both n2 and n3, n1 is the greatest.
    If n2 is greater or equals to both n1 and n3, n2 is the greatest.
    Else, n3 is the greatest.

The greatest number can also be found using a when statement.

// Method 02

fun main(args: Array<String>) {

    val n1 = -4.5
    val n2 = 3.9
    val n3 = 5.5

    when {
        n1 >= n2 && n1 >= n3 -> println("$n1 is the largest number.")
        n2 >= n1 && n2 >= n3 -> println("$n2 is the largest number.")
        else -> println("$n3 is the largest number.")
    }
}

In the above program, instead of using an if..else if..else block, we use when statement.

So, the above conditions in both the programs are the same.
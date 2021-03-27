// Kotlin Program to Calculate the Sum of Natural Numbers

// Method 01

fun main(args: Array<String>) {

    val num = 100
    var sum = 0

    for (i in 1..num) {
        // sum = sum+i;
        sum += i
    }

    println("Sum = $sum")
}

// The above program loops from 1 to the given num(100) and adds all numbers to the variable sum.

Unlike Java, in Kotlin, you can use ranges (1..num) and in operator to loop through numbers between 1 to num.

// Method 02

fun main(args: Array<String>) {

    val num = 50
    var i = 1
    var sum = 0

    while (i <= num) {
        sum += i
        i++
    }

    println("Sum = $sum")
}

// in the above program, unlike a for loop, we have to increment the value of i inside the body of the loop.

Though both programs are technically correct, it is better to use for loop in this case. It's because the number of iteration (upto num) is known.
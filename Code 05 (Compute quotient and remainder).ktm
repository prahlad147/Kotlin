// Kotlin Program to Compute Quotient and Remainder

// Method 01

fun main(args: Array<String>) {

    val dividend = 25
    val divisor = 4

    val quotient = dividend / divisor
    val remainder = dividend % divisor

    println("Quotient = $quotient")
    println("Remainder = $remainder")
}

// In the above program, two numbers 25 (dividend) and 4 (divisor) are stored in two variables dividend and divisor respectively. Unlike Java, these are automatically assigned Int type in Kotlin.

Now, to find the quotient we divide dividend by divisor using / operator. Since, both dividend and divisor are Int, the result will also be computed as an Int.

So, mathematically even if 25/4 results 6.25, since both operands are Int, quotient variable only stores 6 (integer part).

Likewise, to find the remainder we use the % operator. So, the remainder of 25/4, i.e. 1 is stored in an Int variable remainder.

Finally, quotient and remainder are printed on the screen using println() function.
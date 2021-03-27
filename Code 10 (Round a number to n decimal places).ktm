// Kotlin Program to Round a Number to n Decimal Places

// Method 01

fun main(args: Array<String>) {
    val num = 1.34567

    println("%.4f".format(num))
}

// In the above program, we've used format() method to print the given floating point number num to 4 decimal places.  The 4 decimal places is given by the format .4f.

This means, print only upto 4 places after the dot (decimal places), and f means to print the floating point number.

// Method 02

import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    val num = 1.34567
    val df = DecimalFormat("#.###")
    df.roundingMode = RoundingMode.CEILING

    println(df.format(num))
}

// In the above program, we've used DecimalFormat class to round a given number num.

We declare the format using the # patterns #.###. This means, we want num upto 3 decimal places. We also set the rounding mode to Ceiling, this causes the last given place to be rounded to its next number.

So, 1.34567 rounded to 3 decimal places prints 1.346, 6 is the next number for 3rd place decimal 5.


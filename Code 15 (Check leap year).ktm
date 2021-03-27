// Kotlin Program to Check Leap Year

// Methhod 01

un main(args: Array<String>) {

    val year = 1900
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}

// In the above program, given year 1900 is stored in the variable year.

    Since 1900 is divisble by 4 and is also a century year (ending with 00), it has be divisble by 400 for a leap year. Since it's not divisible by 400, 1900 is not a leap year.
    But, if we change the year to 2000, it is divisible by 4, is a century year and is also divisible by 400. So, 2000 is a leap year.
    Likewise, If we change the year to 2012, it is divisible by 4 and is not a century year, so 2012 a leap year. We don't need to check if 2012 is divisible by 400 or not.


// Method 02

fun main(args: Array<String>) {

    val year = 2012
    var leap = false

    leap = when {
        year % 4 == 0 -> {
            when {
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}

// In the above program, instead of using an if else statement, we have used a when expression.

The when expression works as:

    When year is divisible by 4
        Another when expression is entered which checks if year is divisible by 100
            If yes, it again checks if year is divisble by 400 or not, and returns true or false
        If not divisble by 100, year is not a century year (ending with 00) and returns true
    If year is not divisible by 4, it returns false

Based on the value of leap, it prints the output using an inline if else.
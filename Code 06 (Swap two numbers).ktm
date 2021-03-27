// Kotlin Program to Swap Two Numbers

// Method 01

fun main(args: Array<String>) {

    var first = 1.20f
    var second = 2.45f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    // Value of first is assigned to temporary
    val temporary = first

    // Value of second is assigned to first
    first = second

    // Value of temporary (which contains the initial value of first) is assigned to second
    second = temporary

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}

// In the above program, two numbers 1.20f and 2.45f which are to be swapped are stored in variables: first and second respectively.

The variables are printed before swapping using println() to see the results clearly after swapping is done.

    First, the value of first is stored in variable temporary (temporary = 1.20f).
    Then, value of second is stored in first (first = 2.45f).
    And, finally value of temporary is stored in second (second = 1.20f).

This completes the swapping process and the variables are printed on the screen.

Remember, the only use of temporary is to hold the value of first before swapping. You can also swap the numbers without using temporary.

// Method 2

fun main(args: Array<String>) {

    var first = 12.0f
    var second = 24.5f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    first = first - second
    second = first + second
    first = second - first

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}

// In the above program, instead of using temporary variable, we use simple mathematics to swap the numbers.

For the operation, storing (first - second) is important. This is stored in variable first.

first = first - second;
first = 12.0f - 24.5f

Then, we just add second (24.5f) to this number - calculated first (12.0f - 24.5f) to swap the number.

second = first + second;
second = (12.0f - 24.5f) + 24.5f = 12.0f

Now, second holds 12.0f (which was initially value of first). So, we subtract calculated first (12.0f - 24.5f) from swapped second (12.0f) to get the other swapped number.

first = second - first;
first = 12.0f - (12.0f - 24.5f) = 24.5f

The swapped numbers are printed on the screen using println().
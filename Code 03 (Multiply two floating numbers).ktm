// Kotlin Program to Multiply two Floating Point Numbers

// Method 1

fun main(args: Array<String>) {

    val first = 1.5f
    val second = 2.0f

    val product = first * second

    println("The product is: $product")
}

// In the above program, we have two floating point numbers 1.5f and 2.0f stored in variables first and second respectively.

Notice, we have used f after the numbers. This ensures the numbers are Float, otherwise they will be assigned - type Double.

You can also add :Float after variable name (val first: Float) during declaration, but, unlike Java, Kotlin automatically does that for you so it is not mandatory.

first and second are then multiplied using the * operator and the result is stored in a new float variable product.

Finally, the result product is printed on the screen using println() function.
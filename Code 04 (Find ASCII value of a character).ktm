// Kotlin Program to Find ASCII value of a character

// Method 01

fun main(args: Array) {

    val c = 'a'
    val ascii = c.toInt()

    println("The ASCII value of $c is: $ascii")
}

// In the above program, character a is stored in a char variable, ch. Similar to Java, double quotes (" ") are used to declare strings, we use single quotes (' ') to declare characters.

Now, to find the ASCII value of ch, we use a Kotlin's built-in function called toInt(). This converts a Char value into an Int value.

This converted value is then stored in a variable ascii.

Finally, we print the ascii value using the println() function.
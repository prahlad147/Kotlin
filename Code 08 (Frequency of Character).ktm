// Kotlin Program to Find the Frequency of Character in a String

// Method 01

fun main(args: Array<String>) {
    val str = "This website is awesome."
    val ch = 'e'
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++frequency
        }
    }

    println("Frequency of $ch = $frequency")
}

// In the above program, the length of the given string, str, is found using the string method length().

We loop through each character in the string using charAt() function which takes the index (i) and returns the character in the given index.

We compare each character to the given character ch. If it's a match, we increase the value of frequency by 1.

In the end, we get the total occurence of a character stored in frequency and print it.
// Kotlin Program to Check Whether a Character is Alphabet or Not

// Method 01

fun main(args: Array<String>) {

    val c = '*'

    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")
}

// Like Java, in Kotlin, char variable stores the ASCII value of a character (number between 0 and 127) rather than the character itself.

The ASCII value of lowercase alphabets are from 97 to 122. And, the ASCII value of uppercase alphabets are from 65 to 90.

This is the reason, we compare variable c between 'a' (97) to 'z' (122). Likewise, we do the same to check for uppercase alphabets between 'A' (65) to 'Z' (90).

// Method 02

fun main(args: Array<String>) {

    val c = 'a'

    if (c in 'a'..'z' || c in 'A'..'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")
}

// Method 03

fun main(args: Array<String>) {

    val c = 'C'

    when {
        (c in 'a'..'z' || c in 'A'..'Z') -> println("$c is an alphabet.")
        else -> println("$c is not an alphabet.")
    }
}
// Kotlin Program to Remove All Whitespaces from a String

// Method 01

fun main(args: Array<String>) {
    var sentence = "T    his is b  ett     er."
    println("Original sentence: $sentence")

    sentence = sentence.replace("\\s".toRegex(), "")
    println("After replacement: $sentence")
}

// In the aboe program, we use String's replaceAll() method to remove and replace all whitespaces in the string sentence.

We've used regular expression \\s that finds all white space characters (tabs, spaces, new line character, etc.) in the string. Then, we replace it with "" (empty string literal).
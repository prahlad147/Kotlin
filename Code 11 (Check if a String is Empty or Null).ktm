// Kotlin Program to Check if a String is Empty or Null

// Method 01

fun main(args: Array<String>) {

    val str1: String? = null
    val str2 = ""

    if (isNullOrEmpty(str1))
        println("str1 is null or empty.")
    else
        println("str1 is not null or empty.")

    if (isNullOrEmpty(str2))
        println("str2 is null or empty.")
    else
        println("str2 is not null or empty.")
}

fun isNullOrEmpty(str: String?): Boolean {
    if (str != null && !str.isEmpty())
        return false
    return true
}

// In the above program, we've two strings str1 and str2. str1 contains null value and str2 is an empty string.

We've also created a function isNullOrEmpty() which checks, as the name suggests, whether the string is null or empty. It checks it using a null check using != null and isEmpty() method of string.

In plain terms, if a string isn't a null and isEmpty() returns false, it's not either null or empty. Else, it is.

However, the above program doesn't return empty if a string contains only whitespace characters (spaces). Technically, isEmpty() sees it contains spaces and returns false. For string with spaces, we use string method trim() to trim out all the leading and trailing whitespace characters.

// Method 02

fun main(args: Array<String>) {

    val str1: String? = null
    val str2 = "   "

    if (isNullOrEmpty(str1))
        println("str1 is null or empty.")
    else
        println("str1 is not null or empty.")

    if (isNullOrEmpty(str2))
        println("str2 is null or empty.")
    else
        println("str2 is not null or empty.")
}

fun isNullOrEmpty(str: String?): Boolean {
    if (str != null && !str.trim().isEmpty())
        return false
    return true
}

// Here in the isNullorEmpty(), we've added an extra method trim() which removes all leading and trailing whitespace characters in the given string.

So, now if a string contains spaces only, the function returns true.
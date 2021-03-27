// Kotlin Program to Check Whether an Alphabet is Vowel or Consonant

// Method 01

fun main(args: Array<String>) {

    val ch = 'i'

    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"

    println("$ch is $vowelConsonant")
}


// In the above program, 'i' is stored in a char variable ch. In Java, you use double quotes (" ") for strings and single quotes (' ') for characters.

Now, to check whether ch is vowel or not, we check if ch is any of: ('a', 'e', 'i', 'o', 'u'). Unlike Java, this is done using if..else expression as opposed to if..else statement.

If the alphabet is any of the vowels, "vowel" string is returned. Else, "consonant" string is returned.

We can also check for vowel or consonant using a when statement in Kotlin.

// Method 02

fun main(args: Array<String>) {

    val ch = 'z'

    when(ch) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}

// In the above program, instead of using a long if condition, we replace it with a when statement. when is similar to switch case in Java.

But, instead of just a statement, when is also an expression, i.e. we can return and store value from when statement.

So, in the program, when ch is either of cases: ('a', 'e', 'i', 'o', 'u'), vowel is printed. Else, else part is executed and consonant is printed on the screen.
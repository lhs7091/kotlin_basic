/**
 * A simple function that takes a parameter of type String
 * and returns Unit (i.e., no return value).
 */
fun printMessage(message: String): Unit {
    println(message)
}

/**
 * A function that takes a second optional parameter with default value Info.
 * The return type is omitted, meaning that it's actually Unit.
 */
fun printMessageWithPrifix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

/**
 * A function that returns an integer.
 */

fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * A single-expression function that returns an integer (inferred, 추론).
 */
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("first message")

    printMessageWithPrifix("second message")
    printMessageWithPrifix("second message", "Warn")
    printMessageWithPrifix(prefix = "Error", message = "second message")

    println(sum(1, 2))

    println(multiply(2,4))
}

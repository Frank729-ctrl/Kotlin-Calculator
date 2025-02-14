import java.util.Scanner

fun main () {
    print (".........MY CALCULATOR........\n")

    val scanner = Scanner(System.`in`)

    println ("Input first number: ")
    val num1 = scanner.nextInt()

    println ("Input symbol +, -, *, /")
    val sym = scanner.next()[0]

    println ("Input seconed number: ")
    val num2 = scanner.nextInt()

    if (sym == '+') {
        println("Result: ${num1 + num2}")
    } else if (sym == '-') {
        println("Result: ${num1 - num2}")
    } else if (sym == '*') {
        println("Result: ${num1 * num2}")
    } else if (sym == '/') {
        if (num2 != 0) {
            println("Result: ${num1 / num2}")
        } else {
            println("Error: Cannot divide by zero")
        }
    } else {
        println("Error: Invalid operator")
    }
         println("Result: $Result")
    
}
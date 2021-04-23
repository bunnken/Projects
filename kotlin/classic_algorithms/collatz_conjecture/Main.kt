var count = 0

fun findSteps(num: Int?) {
    if (num == null || num < 1) {
        println("Invalid input!")
    } else {
        var n: Int = num
        while (n > 1) {
            count += 1
            if (n % 2 == 0) {
                n = n / 2
            } else {
                n = n * 3 + 1
            }
        }
    }

    println("Number of steps: ${count}")
}

fun main() {
    print("Enter a number: ")
    val num = readLine()
    findSteps(num?.toIntOrNull())
}

import kotlin.random.Random

fun bubbleSort(values: MutableList<Int>) {
    for (i in 0 until (values.size - 1)) {
        for (j in 0 until (values.size - 1 - i)) {
            if (values[j] > values[j + 1]) {
                val temp = values[j]
                values[j] = values[j + 1]
                values[j + 1] = temp
            }
        }
    }
}

fun main() {
    val values = MutableList(10) { Random.nextInt(0, 1000) }
    println("Random unsorted list: ${values}")
    bubbleSort(values)
    println("Sorted: ${values}")
}
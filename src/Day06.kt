/* Day6
 */
fun main() {
    fun part1(input: List<String>): Int {
        val fishTimers = input.first().split(",").map { it.toInt() }.toMutableList()

        for (i in 1..80) {
            val zeros = fishTimers.count { it == 0 }
            for (j in fishTimers.indices) {
                if (fishTimers[j] == 0) fishTimers[j] = 6 else fishTimers[j] -= 1
            }
            for (k in 0 until zeros) {
                fishTimers.add(8)
            }
        }
        return fishTimers.size
    }


    val testInput = readInput("Day06_test")
    val input = readInput("Day06")
    println("P1 Test: " + part1(testInput))
    check(part1(testInput) == 5934)
    println("P1 Result: " + part1(input))

}

/* Day6
 */
fun main() {
    fun part1(input: List<String>): Int {
        val fishTimers = input.first().split(",").map { it.toInt() }.toMutableList()

        repeat(80) {
            val zeros = fishTimers.count { it == 0 }
            for (j in fishTimers.indices) {
                if (fishTimers[j] == 0) fishTimers[j] = 6 else fishTimers[j]--
            }
            repeat(zeros) {
                fishTimers.add(8)
            }
        }
        return fishTimers.size
    }

    fun part2(input: List<String>): Long {
        val fishTimers = input.first().split(",").map { it.toInt() }
        val numByTimer = MutableList<Long>(9) { 0 }
        fishTimers.forEach {
            numByTimer[it]++
        }

        repeat(256) {
            val zeros = numByTimer[0]
            for (j in 0..7) {
                numByTimer[j] = numByTimer[j + 1]
            }
            numByTimer[6] += zeros
            numByTimer[8] = zeros
        }
        return numByTimer.sum()
    }

    val testInput = readInput("Day06_test")
    val input = readInput("Day06")
    println("P1 Test: " + part1(testInput))
    check(part1(testInput) == 5934)
    println("P1 Result: " + part1(input))

    println("P2 Test: " + part2(testInput))
    check(part2(testInput) == 26984457539)
    println("P2 Result: " + part2(input))
}

import kotlin.math.abs

/* Day7
 */
fun main() {
    fun part1(input: List<String>): Int {
        val positions = input.first().split(",").map { it.toInt() }
        require(positions.isNotEmpty())
        val min = positions.minOrNull()!!
        val max = positions.maxOrNull()!!

        val totalCosts = buildList<Int> {
            for (i in min..max) {
                var cost = 0
                positions.forEach { cost += abs(i - it) }
                add(cost)
            }
        }

        return totalCosts.minOrNull() ?: 0
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("Day07_test")
    val input = readInput("Day07")
    println("P1 Test: " + part1(testInput))
    check(part1(testInput) == 37)
    println("P1 Result: " + part1(input))

    println("P2 Test: " + part2(testInput))
    check(part2(testInput) == 1)
    println("P2 Result: " + part2(input))
}
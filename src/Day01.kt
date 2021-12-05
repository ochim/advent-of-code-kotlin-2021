/* Day1
 * https://blog.jetbrains.com/kotlin/2021/12/advent-of-code-2021-in-kotlin-day-1/
 */
fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count { (a, b) -> a < b }
    }

    fun part2(input: List<Int>): Int {
        return input.windowed(4).count { it[0] < it[3] }
    }

    val testInput = readInputAsInts("Day01_test")
    check(part1(testInput) == 7)

    val input = readInputAsInts("Day01")
    println(part1(input))

    check(part2(testInput) == 5)
    println(part2(input))
}

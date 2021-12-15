fun main() {
    fun part1(input: List<String>): Int {
        var horizontal = 0
        var depth = 0

        val operations = input.map { it.split(' ') }
        for ((direction, amountString) in operations) {
            val amount = amountString.toInt()
            when (direction) {
                "forward" -> horizontal += amount
                "down" -> depth += amount
                "up" -> depth -= amount
            }
        }

        return horizontal * depth
    }

    fun part2(input: List<String>): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0

        val operations = input.map { it.split(' ') }
        for ((direction, amountString) in operations) {
            val amount = amountString.toInt()
            when (direction) {
                "forward" -> {
                    horizontal += amount
                    depth += amount * aim
                }
                "down" -> aim += amount
                "up" -> aim -= amount
            }
        }

        return horizontal * depth
    }

    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}

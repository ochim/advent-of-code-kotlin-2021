fun main() {
    fun part1(input: List<String>): Int {
        var H = 0
        var D = 0

        input.forEach {
            val list = it.split(" ")
            val way = list[0]
            val n = list[1].toInt()
            when (way) {
                "forward" -> H += n
                "down" -> D += n
                "up" -> D -= n
                else -> {}
            }
        }
        return H * D
    }

    fun part2(input: List<String>): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0

        input.forEach {
            val list = it.split(" ")
            val way = list[0]
            val n = list[1].toInt()
            when (way) {
                "forward" -> {
                    horizontal += n
                    depth += n * aim
                }
                "down" -> aim += n
                "up" -> aim -= n
                else -> {}
            }
        }
        return horizontal * depth
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}

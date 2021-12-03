fun main() {
    fun part1(input: List<String>): Int {
        val size = input.size

        var count = 0
        for (i in 0 until size-1) {
            if (input[i+1].toInt() > input[i].toInt()) count += 1
        }
        return count
    }

    fun part2(input: List<String>): Int {
        val size = input.size

        var count = 0
        for (i in 0 until size-3) {
            if (input[i+3].toInt() > input[i].toInt()) count += 1
        }
        return count
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

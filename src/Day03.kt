fun main() {
    fun part1(input: List<String>): Int {
        var gamma = ""
        var epsilon = ""
        val size = input.size
        val l = input[0].length
        val array = IntArray(l) {0}

        input.forEach {
            for (i in 0 until l) {
                if (it[i] == '1') array[i] += 1
            }
        }

        array.forEach {
            if (it > size/2) {
                gamma += "1"
                epsilon += "0"
            } else {
                gamma += "0"
                epsilon += "1"
            }
        }
        return gamma.toInt(2) * epsilon.toInt(2)
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}

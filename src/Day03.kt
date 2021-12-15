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
            if (it.toFloat() > size.toFloat() / 2) {
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
        val l = input[0].length
        var temp = input.toMutableList()

        for (i in 0 until l) {
            var count = 0
            temp.forEach{
                if (it[i] == '1') count += 1
            }
            if (count.toFloat() >= temp.size.toFloat() / 2) temp = temp.filter { it[i] == '1' }.toMutableList() else temp = temp.filter { it[i] == '0' }.toMutableList()
            if (temp.size == 1) break
        }
        val oxgen = temp.joinToString()

        temp = input.toMutableList()
        for (i in 0 until l) {
            var count = 0
            temp.forEach{
                if (it[i] == '1') count += 1
            }
            if (count.toFloat() >= temp.size.toFloat() / 2) temp = temp.filter { it[i] == '0' }.toMutableList() else temp = temp.filter { it[i] == '1' }.toMutableList()
            if (temp.size == 1) break
        }
        val co2 = temp.joinToString()

        return oxgen.toInt(2) * co2.toInt(2)
    }

    val testInput = readInput("Day03_test")
    val input = readInput("Day03")
    check(part1(testInput) == 198)
    check(part2(testInput) == 230)

    println(part1(input))
    println(part2(input))
}

fun main() {

    fun parseInput(input: String){
        val data = input.split("\n\n"). map {elf ->
            elf.lines().map {it.toInt()}
        }
    }
    fun List<List<Int>>.topNElves(n: Int): Int{
        return map { it .sum() }
                .sortedDescending()
                .take(n)
                .sum()
    }

    fun part1(input: String): Int {
        val data = parseInput(input)
        return data.topNSelves
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Part 2 you can use a Sorted set to be more algorithmically efficient instead of using libs
}

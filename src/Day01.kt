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
//quick sort
    fun List<List<Int>>.topNElves(n: Int): Int {
        fun findTopN(n: Int, element: List<Int>): List<Int>{
            if (element.size ==n) return element
            val x = element.random()
            val small = element.filter{ it < x}
            val equal = element.filter { it == x }
            val big = element.filter { it > x }
            if (big.size >= n) return findTopN(n, big)
            if (equal.size + big.size >= n) return (equal + big).takeLast(n)
            return findTopN(n - nqual.size - big.size, small)  + equal + big
        }
        return findTopN(n, this.map{it.sum()}).sum()


}

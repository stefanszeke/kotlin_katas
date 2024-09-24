package katas_6


fun main() {
    var input1 = arrayOf(2, 4, 0, 100, 4, 11, 2602, 36)
    var input2 = arrayOf(160, 3, 1719, 19, 11, 13, -21)
    val exampleTest1 = arrayOf(2,6,8,-10,3)
    val exampleTest2 = arrayOf(206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781)
    val exampleTest3 = arrayOf(Integer.MAX_VALUE, 0, 1)
    println(find(input1))
    println(find(input2))
    println()
    println(-10 % 2)
    println(find(exampleTest1))
    println(find(exampleTest2))
    println(find(exampleTest3))
}

fun find(integers: Array<Int>): Int {
    var lastEven: Int = 0
    var lastOdd: Int = 0
    var lastEvensCount: Int = 0
    var lastOddsCount: Int = 0

    for (num in integers) {
        var absNum = if (num < 0) -num else num

        if (absNum % 2 == 0) {
            lastEven = num
            lastEvensCount++
        } else {
            lastOdd = num
            lastOddsCount++
        }

        if (lastEvensCount > 1 && lastOddsCount > 0) {
            return lastOdd
        } else if (lastOddsCount > 1 && lastEvensCount > 0) {
            return lastEven
        }
    }

    return -1
}


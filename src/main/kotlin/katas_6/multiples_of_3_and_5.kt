package org.stefanszeke.katas_6

import testPerformance


fun main() {

    val test_value = 90000000L

    testPerformance("solution1", ::solution1, test_value)
    testPerformance("solution2", ::solution2, test_value)
    testPerformance("solution3", ::solution3, test_value)

}

fun solution1(num: Long): Long {
    return (1L ..< num)
        .filter {it % 3 == 0L || it % 5 == 0L }
        .sum()
}

fun solution2(num: Long): Long {
    return (3..<num step 3)
        .union((5..<num) step 5)
        .sum()
}

fun solution3(num: Long): Long {
    return sumOfMultiples(3, num) +
            sumOfMultiples(5, num) -
            sumOfMultiples(15, num)
}

fun sumOfMultiples(x: Long, limit: Long): Long {
    val n = (limit - 1) / x
    return x * n * (n + 1) / 2
}


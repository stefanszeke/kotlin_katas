import kotlin.system.measureTimeMillis

fun testPerformance(name: String, solution: (Long) -> Long, testValue: Long) {
    var result: Long
    val timeTaken = measureTimeMillis {
        result = solution(testValue)
    }

    println("fun $name | Result: $result | time: $timeTaken")
}
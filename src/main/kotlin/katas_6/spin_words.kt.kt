package katas_6

fun main() {
    println(spinWords("Hey fellow warriors"))
    println(spinWords2("Hey fellow warriors"))
    println(spinWords3("Hey fellow warriors"))
    println(spinWords4("Hey fellow warriors"))

    val list = listOf("apple", "banana", "cherry", "date")
    var my_new_str: String = join_to_string_2000(list, separator = "*", "start ", " stop") { word -> word.uppercase() }
    println(my_new_str)

    val list2 = listOf("car", "bike", "plane", "boat")
    val my_new_list2 = list2.join_to_string_4000("|", "* ", " *" ) { it.uppercase() }
    println(my_new_list2)


}

fun spinWords(sentence: String): String {
    return sentence.split("\\s".toRegex())
        .map { word ->
            if (word.length > 4) {
                word.reversed()
            } else {
                word
            }
        }
        .joinToString(" ")
}

fun spinWords2(sentence: String): String {
    return sentence
        .split("\\s".toRegex())
        .map { if (it.length > 4) it.reversed() else it }
        .joinToString(" ")
}

fun spinWords3(sentence: String): String {
    return sentence
        .split(" ")
        .joinToString(" ") { if (it.length > 4) it.reversed() else it }
}

fun spinWords4(sentence: String): String {
    return sentence
        .split(" ")
        .joinToString(" ") { it.reverseIfLongerThan(4) }
}

fun String.reverseIfLongerThan(num: Int): String {
    return when {
        (this.length > num) -> this.reversed()
        else -> this
    }
}

fun String.reverseIfLongerThan2(num: Int): String = when {
    (this.length > num) -> this.reversed()
    else -> this
}

fun <T> join_to_string_2000(
    arr: Iterable<T>,
    separator: CharSequence = ", ",
    prefix: CharSequence = "",
    postfix: CharSequence = "",
    transform: ((T) -> CharSequence)? = null
): String {
    var result = StringBuilder()
    result.append(prefix)

    var count = 0;
    for (item  in arr) {
        if (count > 0) {
            result.append(separator)
        }

        val itemTransformed = transform?.invoke(item) ?: item.toString()
        result.append(itemTransformed)

        count++
    }

    result.append(postfix)
    return result.toString()
}

fun <T> Iterable<T>.join_to_string_4000(
    separator: CharSequence = ", ",
    prefix: CharSequence = "",
    postfix: CharSequence = "",
    transform: ((T) -> CharSequence)? = null
): String {
    var result = StringBuilder()
    result.append(prefix)

    var count = 0;
    for (item in this) {
        if (count > 0) {
            result.append(separator)
        }

        val itemTransformed = transform?.invoke(item) ?: item.toString()
        result.append(itemTransformed)

        count++
    }

    result.append(postfix)
    return result.toString()
}



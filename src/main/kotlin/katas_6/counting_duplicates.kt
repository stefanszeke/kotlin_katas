package katas_6

fun main() {
    println(duplicateCount("abcdeaB"))
}

fun duplicateCount(text: String): Int {
    var duplicates: MutableList<String> = mutableListOf()

    var text_lower: String = text.lowercase()

    text_lower.toCharArray().forEach {
        if (text_lower.lastIndexOf(it) != text_lower.indexOf(it)) {
            if(!duplicates.contains(it.toString())) {
                duplicates.add(it.toString())
            }
        }
    }

    return  duplicates.size
}
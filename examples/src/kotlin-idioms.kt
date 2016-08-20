fun iterateListByIndex() {
    val list = listOf("a", "b", "c")
    for (index in list.indices) {
        println("$index -> ${list[index]}")
    }
}

fun main(args: Array<String>) {
    iterateListByIndex()
}
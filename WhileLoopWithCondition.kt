fun main() {
    var i = 0
    while (i < 10) {
        if (i == 5) {
            i++
            continue
        } else {
            println(i)
            i++
        }
    }
}

```kotlin
fun calculate(a: Int, b: Int): Int? {
    return if (b == 0) null else a / b
}

fun main() {
    val result = calculate(10, 0)
    println(result) // Output: null
    val result2 = calculate(10, 2)
    println(result2) // Output: 5
}
```
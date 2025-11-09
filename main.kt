enum class Color {
  Red,
  Green;

  fun getColorName(): String {
    return when(this) {
      Color.Red -> "This is Red"
      Color.Green -> "This is Green"
    }
}

fun main() {
  val color = Color.Red
  println("Hello, World!")
  println(color.getColorName())
}

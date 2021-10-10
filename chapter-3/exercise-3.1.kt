fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun compose(a: (Int) -> Int, b: (Int) -> Int): (Int) -> Int = { a(b(it)) }

fun main() {
  val squareTriple = compose(::square, ::triple)
  println(squareTriple(2))
}

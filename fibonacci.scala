object Fibonacci {
  def fib(n: Int): Int = {
    if(n<=1) n
    else n+fib(n-1)
  }
  def main(args: Array[String]): Unit = {
    println(fib(10)) 
  }
}

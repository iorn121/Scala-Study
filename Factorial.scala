import scala.math.BigInt
object Factorial extends App {
    def factorial(x: BigInt): BigInt = if (x==0) 1 else x*factorial(x-1)

    val x=1000
    println(s"${x}'s factorial is ${factorial(x)}")
}
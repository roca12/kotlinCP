import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    var casos=sc.nextInt().toInt()
    sc.nextLine()
    for (i in 0 until casos) {
        val entrada=sc.nextLine()
        val num1 = BigInteger(entrada)
        val num2 = BigInteger.valueOf(2)
        val res=(num1/num2)+num2
        print(res)
    }
}

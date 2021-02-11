import java.util.Scanner

fun sumar(a: Int, b: Int): Int {
    return a + b
}
fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    var a=sc.nextInt().toInt()
    for(num in 1..a){
        var b=sc.nextInt().toInt()
        var c=sc.nextInt().toInt()
        var resultado = sumar(b,c)
        println("$resultado")
    }
}


fun zad1(){
    val dish1 = 100
    val dish2 = 150
    val dish3 = 170
    val sotryd = 3
    val totalprice = dish1 + dish2 + dish3
    val fin = totalprice * sotryd
    println(fin)
}
fun zad2()
{
    val countpc = 100000
    val countme = 110000
    if  (countpc > countme) {
        println("Вам не хватает: ")
        val sum = countpc - countme
        println(sum)
    }
    else
    {
        if (countme > countpc)
        {
            val sum = countme - countpc
            println("Ваша сдача :")
            println(sum)
        }
        println("Спасибо за покупку")
    }
}

fun zad3(){
    val arr = arrayOf(0,0,1,5,2,0,0,2,3,0)
    var range = 9
    var x: Int = 0
    for (i in 0..range)
    {
        if (arr[i] == 0)
        {
            x++
        }
    }
    println(x)
}



fun main() {
    zad1()
    zad2()
    zad3()
}
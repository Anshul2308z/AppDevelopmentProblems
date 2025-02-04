fun main(){
    val a = 450 // today's screentime
    val b = 370 // yesterday's screentime
    val info = screentime(a,b)
    println("Your screentime today is more compared to yesterday: $info")
}

fun screentime(a: Int, b: Int):String{
    val c: Boolean = a > b ;
    return "$c" 
}


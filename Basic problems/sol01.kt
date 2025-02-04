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
/* original solution 
fun main() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
*/

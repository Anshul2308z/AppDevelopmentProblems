fun main() {
    val city1 = sorter("narsinghpur",20,35,40)
    val city2 = sorter("ahemdabad",30,56,20)
    val city3 = sorter("raipur",20,34,80)
    val city4 = sorter("agra",20,37,100)
    
    println(city1)
    println()
    
    println(city2)
    println()
    
    println(city3)
    println()
    
    println(city4)
    println()
}
fun sorter(city: String, lowTemp: Int, highTemp: Int, probabilityOfRain: Int) :String {
    return ("City: $city\n Low temperature: $lowTemp, High temperature: $highTemp\n Chance of rain: $probabilityOfRain%")
    
}

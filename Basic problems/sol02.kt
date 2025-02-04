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
/* original solution
fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
*/

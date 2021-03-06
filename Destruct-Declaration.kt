//Kotlin Data classes

data class Event(var name:String, var year:Int){
    
    //No code
}

fun main(args: Array<String>) {
    val event = Event("DeveloperFest",2020)
    
    //Destructuring the Data Class
    val(name, year) = event
    println("Event Name:"+name)
    println("Year:"+year)
}
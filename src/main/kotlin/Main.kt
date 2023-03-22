fun greetPerson(greeting:String="Hello", persontogreet:String="Kotlin")=println("$greeting $persontogreet")

fun main()
{
    val Names= arrayOf("Vedant", "Swar", "Nishanth", "Yash")
    greetPerson(greeting="Kasa ahes")
    sayHello(greeting="Hey", itemsToGreet = Names )
    var person=Person()
    person.firstName
    person.lastName
    person.nickName="Vaibhav"
    person.nickName="Subrat"
    println(person.nickName)
}

//----------------------------------------------------------------------
fun sayHello(greeting:String,vararg itemsToGreet:String)
{
    itemsToGreet.forEach{item->println("$greeting ,$item")}
}
//
//fun main()
//{
//    val Names= arrayOf("Vedant", "Swar", "Nishanth", "Yash")
//    sayHello("Kasa ahes",*Names)
//}
//
//----------------------------------------------------------------------
//fun main() {
//    val Names = arrayOf("Vedant", "Swar", "Nishanth", "Yash")
//    println(Names.size)
//    println(Names[2])
//    println("-----")
//    Names.forEach {
//        println(it)
//    }
//    println("-----")
//    Names.forEach { i ->
//        println(i)
//    }
//    Names.forEachIndexed { i, EachName ->
//        println("$EachName is at index $i")
// }
//    val Names= mutableListOf("Vedant", "Swar", "Nishanth", "Yash")
//    Names.forEach{
//            Name->println("$Name")
//    }
//    Names.add("Vaibhav")
//    println("---------")
//    Names.forEach { Name->println("$Name") }
//      val map1= mutableMapOf(1 to "a",2 to "b",3 to "c")
//      map1.put(5,"d")
//    map1.forEach{
//        i,str->
//        println("$i->$str")
//    }
//}



fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean?)?){

    list.forEach{
        if(predicate?.invoke(it)==true){
            println(it)
        }
    }
}
val predicate: (String)->Boolean={
    it.startsWith("C")
}
fun getPrintPredicate():(String)->Boolean{
    return {it.startsWith("C")}
}
fun main(){
    val list= listOf("Kotlin","Java","C","C++")
    printFilteredStrings(list){
        it.startsWith("K")
    }
    printFilteredStrings(list,predicate)
    println("Break")
    printFilteredStrings(list,getPrintPredicate())
}
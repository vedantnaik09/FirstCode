class Person (val firstName: String="Hari",val lastName: String="Puttar")
{
    var nickName:String? = null
        set(value) {
            field=value
            println("The new nickname is $nickName")
        }
        get() {
            println("The returned value is $field")
            return field
        }
    fun printInfo(){
        val nickNameToPrint= nickName?:"choco"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}

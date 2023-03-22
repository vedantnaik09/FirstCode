class Person (val firstName: String="Hari",val lastName: String="Puttar")
{
    var nickName:String? = null
        set(value) {
            field=value
            println("The new nickname is $nickName")
        }
        get() {
            println("The returned value is $field")
            println("The klk")
            return field
        }
}

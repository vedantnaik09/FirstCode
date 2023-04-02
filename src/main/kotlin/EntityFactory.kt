import java.util.*

object EntityFactory{
    fun create():Entity{
        val id= UUID.randomUUID().toString()
        return Entity(id, "name")
    }
}
class Entity(val id:String, val name:String){
    override fun toString(): String {
        return "id:$id, Name:$name "
    }

}
fun main(){
    val entity=EntityFactory.create()
    println(entity)
}
//object EntityFactory{
//    fun create()=Entity("id")
//}
//class Entity (val id: String)
//
//
//fun main(){
//    val entity= Entity.Factory.create()
//}
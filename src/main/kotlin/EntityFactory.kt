import java.util.*
import kotlin.math.E

enum class EntityType{
    EASY,MEDIUM,HARD;
    fun getFormattedName()= name.lowercase().capitalize()
}
object EntityFactory{
    fun create(type: EntityType):Entity{
        val id= UUID.randomUUID().toString()
        val name=when(type){
        EntityType.EASY-> type.name
        EntityType.MEDIUM-> type.getFormattedName()
        EntityType.HARD-> "Hard"
        }
        return Entity(id, name)
    }
}
class Entity(val id:String, val  name:String){
    override fun toString(): String {
        return "id:$id, Name:$name "
    }

}
fun main(){
    val entity=EntityFactory.create(EntityType.EASY)
    println(entity)
    val mediumEntity=EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
    val hardEntity=EntityFactory.create(EntityType.HARD)
    println(hardEntity)
    println(EntityType.EASY.name)
}

//----------------------------------------------
//object EntityFactory{
//    fun create():Entity{
//        val id= UUID.randomUUID().toString()
//        return Entity(id, "name")
//    }
//}
//class Entity(val id:String, val name:String){
//    override fun toString(): String {
//        return "id:$id, Name:$name "
//    }
//
//}
//fun main(){
//    val entity=EntityFactory.create()
//    println(entity)
//}
//--------------------------------------
//object EntityFactory{
//    fun create()=Entity("id")
//}
//class Entity (val id: String)
//
//
//fun main(){
//    val entity= Entity.Factory.create()
//}
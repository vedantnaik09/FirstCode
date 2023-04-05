import java.util.*
import kotlin.math.E

enum class EntityType{
    HELP,EASY,MEDIUM,HARD;
    fun getFormattedName()= name.lowercase().capitalize()
}
object EntityFactory{
    fun create(type: EntityType):Entity{
        val id= UUID.randomUUID().toString()
        val name=when(type){
            EntityType.EASY-> type.name
            EntityType.MEDIUM-> type.getFormattedName()
            EntityType.HARD-> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type){
            EntityType.EASY-> Entity.Easy(id,name)
            EntityType.MEDIUM-> Entity.Medium(id,name)
            EntityType.HARD-> Entity.Hard(id,name, 2f)
            EntityType.HELP -> Entity.Help
        }

    }
}
sealed class Entity(){
    object Help:Entity(){
        val name="Help"
    }
    data class Easy(val id:String,val name:String):Entity()
    data class Medium(val id:String,val name:String):Entity()
    data class Hard(val id:String,val name:String, val multiplier: Float):Entity()

}
fun Entity.Medium.printInfo(){
    println("Medium class: $id")
}
val Entity.Medium.info: String
    get() = "some info"

fun main() {
    Entity.Medium("Id","Name").printInfo()
    val entity1= Entity.Easy("id","name")
    val entity2= EntityFactory.create(EntityType.MEDIUM)
    if(entity2 is Entity.Medium){
        entity2.printInfo()
        entity2.info
    }
//    val entity1= Entity.Easy("id","name")
//    val entity2= entity1.copy(name="new name")
//    if(entity1===entity1)
//    {
//        println("They are equal")
//    }else{
//        println("They are not equal")
//    }

}
//import java.util.*
//import kotlin.math.E
//
//enum class EntityType{
//    HELP,EASY,MEDIUM,HARD;
//    fun getFormattedName()= name.lowercase().capitalize()
//}
//object EntityFactory{
//    fun create(type: EntityType):Entity{
//        val id= UUID.randomUUID().toString()
//        val name=when(type){
//        EntityType.EASY-> type.name
//        EntityType.MEDIUM-> type.getFormattedName()
//        EntityType.HARD-> "Hard"
//        EntityType.HELP -> type.getFormattedName()
//        }
//        return when(type){
//            EntityType.EASY-> Entity.Easy(id,name)
//            EntityType.MEDIUM-> Entity.Medium(id,name)
//            EntityType.HARD-> Entity.Hard(id,name, 2f)
//            EntityType.HELP -> Entity.Help
//        }
//
//    }
//}
//sealed class Entity(){
//    object Help:Entity(){
//        val name="Help"
//    }
//    data class Easy(val id:String,val name:String):Entity()
//    data class Medium(val id:String,val name:String):Entity()
//    data class Hard(val id:String,val name:String, val multiplier: Float):Entity()
//
//}
//fun main() {
//    val entity:Entity = EntityFactory.create(EntityType.HELP)
//    val msg= when(entity){
//        is Entity.Easy -> "Easy Class"
//        is Entity.Hard -> "Medium Class"
//        is Entity.Medium -> "Medium Class"
//        is Entity.Help -> "Help Class"
//    }
//    println(msg)
//
//}
//}import java.util.*
//import kotlin.math.E
//
//enum class EntityType{
//    EASY,MEDIUM,HARD;
//    fun getFormattedName()= name.lowercase().capitalize()
//}
//object EntityFactory{
//    fun create(type: EntityType):Entity{
//        val id= UUID.randomUUID().toString()
//        val name=when(type){
//            EntityType.EASY-> type.name
//            EntityType.MEDIUM-> type.getFormattedName()
//            EntityType.HARD-> "Hard"
//        }
//        return Entity(id, name)
//    }
//}
//class Entity(val id:String, val  name:String){
//    override fun toString(): String {
//        return "id:$id, Name:$name "
//    }
//
//}
//fun main(){
//    val entity=EntityFactory.create(EntityType.EASY)
//    println(entity)
//    val mediumEntity=EntityFactory.create(EntityType.MEDIUM)
//    println(mediumEntity)
//    val hardEntity=EntityFactory.create(EntityType.HARD)
//    println(hardEntity)
//    println(EntityType.EASY.name)
//}

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
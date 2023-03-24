interface PersonInfoProvider{
    val providerInfo: String
    fun printInfo(person: Person)
    {
        println(providerInfo)
        person.printInfo()
    }

}
interface SessionInfoProvider{
    fun getSessionId(): String
}
class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider{
    override fun getSessionId(): String {
        return "Session"
    }
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional Info")
    }

}

fun main()
{
    val provider=BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}
fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider){
        println("not a sessionInfoProvider")
    }
    else
        println("is a sessionInfoProvider")
    (infoProvider as SessionInfoProvider).getSessionId()
}

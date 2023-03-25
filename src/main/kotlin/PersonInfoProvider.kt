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
open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider{
    protected open val sessionIdPrefix= "Session"
    override fun getSessionId(): String {
        return sessionIdPrefix
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
    val provider=FancyInfoProvider()
    provider.printInfo(Person())
    println("break")
    println(provider.getSessionId())
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

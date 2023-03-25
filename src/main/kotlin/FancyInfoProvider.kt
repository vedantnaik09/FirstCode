class FancyInfoProvider : BasicInfoProvider(){
    override val sessionIdPrefix: String
        get() = "FancySession"
    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }
}
package org.example

class RequestImpl : Request() {
    override val publicAccessBool2: Boolean = false

    override fun doSomething(): Boolean {
        this.publicAccessBool
        println("This classes's publicAccessBool2 is: ${this.publicAccessBool2} whilst it's super's is ${super.publicAccessBool2}")
        println(this.publicAccessBool2) // Accesses this one
        super.publicAccessBool2 // Accesses the super classes one.
        this.internalVal
        this.protectedServiceVal
        this.getClientId()
//        this.publicAccessBool2 = false // val cannot be overwritten ofc
        return this.publicAccessBool
    }
}

class RequestImplAbstract: AbstractRequest() {
    override val service: String = "MyNewService"
    override val internalVal: Int = 123
    override val somethingElse: Boolean = false
    override val doSomething: Boolean = true
    override fun log(): String {
        println("This classes's doSomething is: ${this.doSomething} whilst it's super's is ${super.doSomething}")
        internalVar = "2" // Can overwrite vars that are exposed
        return "...Beep Boop Beep logging..."
    }

}
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

// Class is final, without open operator, so cannot be inherited.
class IRequestImpl : IRequest {
    override val clientId: Long = 123
    override val protectedServiceVal: String = "as"
    override val publicAccessBool: Boolean = false
    override fun getInternalVal(): Int {
        return -1
    }


    val publicVariable = "Hey look at this new stuff"
    private val privateVariable = "Hey look at this new stuff"
    open val openVariable = "Hey look at this new stuff" // It's actually final, given class is final
}



// Can create a new open class based on interface, to allow it to be inherited and subclases can override anything
// even with new open modifier they can override
open class OpenRequestImpl: IRequest {
    override val clientId: Long
        get() = TODO("Not yet implemented")
    override val protectedServiceVal: String
        get() = TODO("Not yet implemented")
    override val publicAccessBool: Boolean
        get() = TODO("Not yet implemented")

    override fun getInternalVal(): Int {
        TODO("Not yet implemented")
    }

    open val openVariable = "I'm overwritten"
    val publicVariable = "sd" // final, but public access

}


// Able to override open variable if the openRequestIMpl is an open class, but not sure on the reqs to build it like so.
class NewRequestImpl: OpenRequestImpl() {
    override val publicAccessBool: Boolean
        get() = super.publicAccessBool
    override val openVariable = "sdsd"
}
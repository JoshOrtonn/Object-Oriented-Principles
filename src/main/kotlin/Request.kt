package org.example

// Open class means subclasses can override and extend this, and all variables / functions are initalized
open class Request {
    private val privateClientId: Long = 123L // Only superclass can touch
    protected val protectedServiceVal: String = "Josh" // Protected means only superclass and sub class can reach.
    internal val internalVal: Int = 123 // Consumers can access if within the same module!!
    val publicAccessBool: Boolean = true // public access so consumers can access.
    open val publicAccessBool2: Boolean = true // public access so consumers can access.
    protected fun getClientId(): Long = privateClientId // Can expose private variables, with functions scoped to protected
    open fun doSomething(): Boolean { // Open function means functions can be overrwritten
        return false
    }
}

// Abstract means some fields and functions are uninitialized and requires to be overriden
// Alongside fields and functions that are initialized, and can be directly used given the correct scoping.
// So abstract kinda is open with added abstract functions
abstract class AbstractRequest {
//    private abstract val clientId: Long // unable to have a private abstract varaible, given we need to override
    private val clientId: Long = 123
    protected abstract val service: String// Protected means only superclass and sub class can reach.
    internal abstract val internalVal: Int // Consumers can access if within the same package
    abstract val somethingElse: Boolean // public access so consumers can access.
    protected fun getClientId() = clientId
    abstract fun log(): String // Subclasses have to implement these functions
    open fun doSomethingOpen(): Boolean { // Abstract classes can contain open functions that can be overwritten or just used
        return false
    }
    protected open val doSomething: Boolean = false
    internal var internalVar: String = "sd"

}

// For interfaces variables all are basically public abstract access.
interface IRequest {
    // all have to be defined as public abstract
    val clientId: Long
    val privateClientId: Long
    val protectedServiceVal: String
    val internalVal: Int
    val publicAccessBool: Boolean

    // But functions can be private
    fun getClientId(): Long = privateClientId
    fun getInternalVal(): Int
    private fun doSomething(): Long {
        println("This function is allowed to be defined")
        return 123
    }
}
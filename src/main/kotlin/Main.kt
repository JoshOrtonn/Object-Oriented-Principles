package org.example

fun main() {
    println("Hello World!")
    val request = RequestImpl()
    request.internalVal
    request.publicAccessBool
//    request.service  // Cannot access service which is protected, so only subClass and superclass can have access.


    val abstractRequest = RequestImplAbstract()
    abstractRequest.log() // can acess it's public function
    abstractRequest.internalVal // can access its declared as an internal variable in the abstract class
    abstractRequest.somethingElse // can access it's public variable
    abstractRequest.doSomethingOpen() // can access given its' public declared
//    abstractRequest.doSomething // Cannot access given it's protected
//    abstractRequest.service // Cannot access given it's protected
//    abstractRequest.service // Cannot access service which is protected, so only subClass and superclass can have access.




    val irequestImpl = IRequestImpl()
    irequestImpl.clientId // Can access interfaces public variables
    irequestImpl.publicAccessBool // Can access interfaces public variables
    irequestImpl.protectedServiceVal // Can access interfaces public variables
    irequestImpl.doSomething() // can access the Interfaces public functions
    irequestImpl.getInternalVal() // and obviously it's overiden function
//    irequestImpl.getClientId() // but can't access private functions within the Interface
    irequestImpl.publicVariable
//    irequestImpl.privateVariable // Obviously can't access private variables
    irequestImpl.openVariable // Not actually open tho.
}
package org.example

fun main() {
    val request = RequestImpl()
//    request.internalVal //Cannot access 'internalVal': it is internal in 'RequestImpl'
    request.publicAccessBool
//    request.service  // Cannot access service which is protected, so only subClass and superclass can have access.


    val abstractRequest = RequestImplAbstract()
    abstractRequest.log() // can acess it's public function
//    abstractRequest.internalVal // cannot access its declared as an internal variable in the abstract class, hence only within the same module
    abstractRequest.somethingElse // can access it's public variable
    abstractRequest.doSomethingOpen() // can access given its' public declared

//    abstractRequest.doSomething // Cannot access given it's protected
//    abstractRequest.service // Cannot access given it's protected
//    abstractRequest.service // Cannot access service which is protected, so only subClass and superclass can have access.
}
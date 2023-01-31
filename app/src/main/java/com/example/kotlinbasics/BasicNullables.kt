package com.example.kotlinbasics

fun main() {

    var name : String = "Papon"
    // name = null -> Complication ERROR
    var nullableName : String? = null
//    nullableName = "Boy"

    var len = name.length
    var len2 = nullableName?.length

    nullableName?.let { println(it.length) }

    /*
    if (nullableName != null) {
        var len2 = nullableName.length
    } else {
        null
    }
    */

    sampleNullalbes_ElvisOperator_NotNullAssertion()
}

//TODO: Nullalbes - Elvis Operator - Not Null Assertion

fun sampleNullalbes_ElvisOperator_NotNullAssertion() {
    var nullableName : String? = null

    //?: Elvis Operator
    val name = nullableName ?: "Guest"
    println("result name $name")

    nullableName = "Boy"
    println(nullableName!!.lowercase())
}
package com.example.kotlinbasics


fun main() {
    myFunction()

    //argument
//    var result = addUp(5,2)
    var avg = avg(5.3,13.37)
    print("result is $avg")
}

//TODO: Functions - Parameters - Arguments and Return - Exercise Include
fun myFunction() {
    println("Called from myFunction")
}

fun avg(a: Double,b: Double) : Double {
    return  (a+b)/2
}

// Method - a Method is a Function within a class
// Parameter (input)
fun addUp(a: Int,b: Int) : Int {
    // output
    return  a + b
}
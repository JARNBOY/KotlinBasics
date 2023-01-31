package com.example.kotlinbasics

fun main() {
    breakAndContinue()
}
//TODO: different Val,Var
fun differentValVar() {
    //val can't overwrite value , var can overwrite value
    var myName = "JARNBOY"
    myName = "T"
    print("Hello World " + myName)
}
//TODO: dataType
fun dataTypeOfNumber() {
    // immutable variable
    // TODO: Add new functionality

    // type string
    val myName = "JARNBOY"

    // type int
    var myAge = 27

    //Interger Types: Byte (8 bit) , Short (16 bit)
    // type int 32 bit , Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    //Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.3744F
    val myDouble: Double = 3.14159265358979323846
}

fun dataTypeOfBoolCharString() {
    //Boolean he type Boolean is used to represent logical values
    //It can have two possible values true and false
    var isSunny: Boolean = true

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val myStr = "Hello"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("First Char " + firstCharInStr)
}

fun exerciseVariableAndDataType() {
    var courseName :String = "Android Masterclass"
    val leet : Float = 13.37F
    val pi : Double = 3.14159265358979
    var age : Byte = 25
    var year : Short = 2020
    var phoneNumber: Long = 18881234567
    var isGood : Boolean = true
    var firstCharacter : Char = 'a'
}
//TODO: String Interpolation
fun stringInterpolation() {
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("String Interpolation $myStr and the length of myStr is ${myStr.length}")
}
//TODO: Arithmetic Operators
fun arithmeticOperators() {
    //Arithmetic Operators (+ ,- ,* , /, %)
    var result = 5+3
    val a = 5.0
    val b = 3
    result = (a / b).toInt()
    println("$result")

    var resultDouble: Double
    resultDouble = a / b
    print(resultDouble)
}
//TODO: Comparison Operators
fun comparisonOperators() {
    //Comparison Operators (==, !=, <, >, <=, >=)
    val isEqual = 5==5
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    println("is-5Greater3 is ${-5>3}")
    println("is-5Less3 is ${5<3}")
    println("is5LowerQual3 is ${5<=3}")
    println("is5Greater3 is ${5>=3}")

}
//TODO: Incriment and Decrement
fun incrimentAndDecrement() {
    //Increment & Decrement operator (++, --)
    var myNum = 0
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

}
//TODO: if Statments
fun ifStatments() {

    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    }else {
        println("use technique")
    }

    //create a variable for testing all condition
    val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
//return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    print("current age is $currentAge")
}
//TODO: when
fun whenExercise() {
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
        else -> println("Invalid Season")
    }

    val age = 16
    when(age) {
        !in 0..20 -> println("now you may drink in the US") // same mean this in 21..150 -> println("now you may drink in the US")
        in 18..20 -> println("You may vote now")
        16,17 -> println("You are too young")
        else -> println("Invalid Season")
    }

    var x : Any = "13.37f"
    when(x) {
        is Int -> println("$x is Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is String")
        else -> println("$x is none of above")
    }

    when(x) {
        is Int -> println("$x is Int")
        is String -> println("$x is String")
        !is Double -> println("$x is not Double")
        else -> println("$x is none of above")
    }

    //When Statements as Expressions
    val y : Any = 13.37
    //assign when to a variable
    val result =  when(y) {
    //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    print("$x $result")
}
//TODO: while and do while Loop
fun whileLoop() {
    //While loop executes a block of code repeatedly as long  as given condition
    var x = 1
    while(x <= 10) {
        println("$x")
        x++
    }
    println("While loop is done")
}

fun doWhileLoop() {
    //Do While loop executes a block of code repeatedly as long  as given condition
    var x = 15
    do {
        println("$x")
        x++
    } while(x <= 10)
    println("While loop is done")
}

fun moreOnWhileLoops() {
    //Do While loop executes a block of code repeatedly as long  as given condition
    var feltTemp = "cold"
    var roomTemp = 10

    while(feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 10) {
            feltTemp = "comfy"
            println("it's $feltTemp now")
        }
    }
    println("While loop is done")
}
//TODO: for Loop
fun forLoop() {
    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lecture).
    for (num in 1..10) {
        print(num)
    }
    print("\n")
    for (i in 1 until 10) { //Same as = for(i in 1.unitil(10))
        print(" $i")
    }
    print("\n")
    for (i in 10 downTo  1) {
        print(" $i")
    }
    print("\n")
    for (i in 10 downTo  1 step 2) { //Same as = for(i in 10.downTo(1).step(2))
        print(" $i")
    }
}

fun exerciseLoops() {

    for (num in 0..10000) {
        if (num == 9001) {
            println("IT'S OVER 9000!!!")
        }
    }

    var humidityLevel = 80
    var humidity = "humid"
    while(humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            humidity = "comfy"
            println("it's $humidity now")
        }
    }
}
//TODO: break and continue
fun breakAndContinue() {

    //Break and Continue
    for (i in 1 until 20) {
        if (i/2 == 5) {
            break
        }
        print("$i ")
    }
    println("Done with loop break")

    for (i in 1 until 20) {
        /*
        10/2 = 5
        11/2 = 5.5 which is 5 in term of an int
         */
        if (i/2 == 5) {
            continue
        }
        print("$i ")
    }
    println("Done with loop continue")
}



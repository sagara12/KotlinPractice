
package com.example.kotlinpractice

//코틀린 실행 함수
fun main () {
    helloWorld()

    //3. String Template
    val name = "KBS"
    val lastName = "Suk"
    println("my name is ${name+lastName}I'm 23")
    println("This is 2\$")
    checkNumber(80)

}

//1. 함수 (리턴형이 없을때는 Unit 기입 안써줘되 됨)
fun helloWorld() : Unit {
    println("Hello World")



    println( add(a = 4, b =5))

}

fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value
fun hi(){

    // 값이 불변 (상수)
    val a : Int = 10

    // 값이 변하는게 가능 (변수)
    var b : Int = 9

    b = 100

    // 변수 타입을 따로 적지 않아도 상관 없음
    val c = 100
    var d = 100
    var name = "KBS"

    // 선언할때는 타입 써줘야됨

    var e : String
}

// 조건식 1
fun cal (a : Int , b: Int) : Int {
    if (a>b){
        return a
    }else {
        return b
    }

}

//조건식 2
fun cal2 (a: Int, b: Int) : Int  = if (a>b) a else b

fun checkNumber(score : Int) {
    when(score) {
         0 -> println("this is 0")
         1 -> println("this is 1")
         2,3 -> println("this is 2 or 3")
         else -> println("I don't know")
    }

    // 이럴 경우는 반드시 else를 써줘야 됨됨
   var b : Int = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println( "b : ${b}")
    when(score){
        in 90..100 -> println("You are Good")
        in 10..80 -> println("not bad")
        else -> println("OK")
    }
}

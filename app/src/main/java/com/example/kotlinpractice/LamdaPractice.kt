package com.example.kotlinpractice

class LamdaPractice {
}

//1.Lamda
//람다는 우리가 value 처럼 다룰 수 있는 익명 함수?(자바)이다
//1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a : Int)
//2) return 값으로 사용 할 수가 있다.

//람다의 기본정의
//val lamdaName : Type = {argumentList} -> codeBody}

val square : (Int) -> (Int) = {number : Int -> number*number}

val nameAge : (String, Int) -> (String) = { name : String, age:Int ->
    "내이름은 ${name}이고 나이는 ${age} 입니다"
}

fun main(){
    println(square(12))
    println(nameAge("철수", 15))
    val a = "친구가 말하기를"
    val b = "지인이 말하기를"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("애플", 30))
    println(calculateGrade(97))

    val lamda  = {number : Double ->
        number == 3.14
    }

    println(invokeLamda(lamda))
    println(invokeLamda{it>1.1})
}

//확장함수
val pizzaIsGreat : String.() -> String = {
    this + "피자 맛있다"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String   = {"나는 ${this} 그리고 ${it}살이야"}
    return name.introduceMyself(age)
}

//람다의 return
val calculateGrade : (Int) -> String = {
    when (it) {
        in 0.. 40 -> "F"
        in 41..70 -> "B"
        in 71..100 -> "A"
        else -> "Error"
    }

}

//람다를 표현하는 여러가지 방법
//람다 리터럴
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.3432)
}

//pojo
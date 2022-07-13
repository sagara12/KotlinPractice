
package com.example.kotlinpractice

import org.jetbrains.annotations.NotNull

//코틀린 실행 함수
fun main () {
    helloWorld()

    //3. String Template
    val name = "KBS"
    val lastName = "Suk"
    println("my name is ${name+lastName}I'm 23")
    println("This is 2\$")
    checkNumber(80)

    forAndWhile()
    nullcheck()
    ignoreNuils("abbbb")
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

// Expression vs Statement 코틀린의 모든 함수는 Expression

// Array and List

// Array 처음에 크기 할당

// List -> 1. reatable List (읽기 전용) 2.Mutable List (읽기, 쓰기 가능)

fun array() {
    val array : Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2 : Array<Any> = arrayOf(1,"b", 3.4f)
    val list2 : List<Any> = listOf(1,"d", 11L)

    array[0] = 3
    val result : Int = list.get(0)

    val arrayList : ArrayList<Int> = ArrayList<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

// for , while

fun forAndWhile () {

    val students : Array<String> = arrayOf("James", "Cris", "Jack", "Jenny")

    for ( name : String in students) {
        println("${name}")
    }

    for ((index : Int, name : String) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for ( i : Int in 1..10 step 2) {
        sum += i
    }



//    for ( i : Int in 1..10 downTo 1) {
//        sum += i
//    }

//    for ( i : Int in 1..10 util 1) {
//        sum += i
//    }
    println(sum)
    var index : Int = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }

}

// Nullable / NonNull
fun nullcheck() {
    //NPE : Null pointer Exception

    //NonNull
    var name  = "cris"

    //Nullable ->  ?를 붙여주면 됨
    var nullName : String? = null

    var nameInUpperCase : String = name.uppercase()

    var nullnameInUpperCase : String? = nullName?.uppercase()

    //?:

    val lastName : String? = null

    val fullName : String = name + " " +(lastName?: "No last Name")

    println(fullName)
}

//!! -> 컴파일러 한테 이 변수는 NULL이 아니다라고 알려줄때 씀
fun ignoreNuils(str : String){
    val NotNull : String = str!!
    val upper: String = NotNull.uppercase()

    val email : String = "sagara12@naver.com"
    email?.let{
        println("my email is ${email}")
    }
}


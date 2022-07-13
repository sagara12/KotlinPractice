package com.example.kotlinpractice

import javax.crypto.KeyAgreement


open class Human constructor(name : String = "익명"){

    //constructor
    constructor(name: String, age: Int) : this(name) {
        println("내 이름은 ${name}, ${age}살이야 ")
    }

    init {
        println("새로운 사람이 들어왔습니다")
    }

    val name = name
    fun eatingCake(){

        println("너무 달아")
    }

    open fun singASoung() {
        println("lalala")
    }
}

class Korean : Human(){

    override fun singASoung(){
        super.singASoung()
        println("라라라")
        println("내이름은 ${name}")
    }

}


fun main(){

   /* val human = Human("민수" )

    val staranger  = Human()
    human.eatingCake()*/

    //val human2 = Human("리안", 20)

    //println("this human name is ${staranger.name}")

    val korean = Korean()
    korean.singASoung()

}


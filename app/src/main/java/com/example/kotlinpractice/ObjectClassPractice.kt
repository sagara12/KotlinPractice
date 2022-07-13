package com.example.kotlinpractice

// 오브젝트 만들어진 객체는 실행할때 딱 한번만 실행됨 (싱글톤 패턴)
object CarFactory {
    val cars : MutableList<Car> = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car: Car = CarFactory.makeCar(10)
    val car2 : Car = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.toString())
}
package com.example.kotlinpractice

data class Ticket (val commpanyName : String, val name : String, var data: String, var seatNumber: Int)

// 컴파일 하면서 자동으로 만들어 지는것
// 1.toString()
// 2.hashCode()
// 3.equals()
// 4.copy()

class TicketNomal (val commpanyName : String, val name : String, var data: String, var seatNumber: Int)


fun main() {
    val ticket = Ticket ("KoreanAir", "KBS", "2020-02-16", 14)
    val ticketB = TicketNomal("KoreanAir", "KBS", "2020-02-16", 14)

    println(ticket)
    println(ticketB)
}


package com.example.kotlinpractice

class Book private constructor(val id : Int, val name: String) {

    companion object BookFactory : IdProvider{
        val myBook = "new book"

        fun create() = Book(0,myBook)
        override fun getId(): Int {
            return 444
        }
    }
}

interface IdProvider {
    fun getId() : Int
}


fun main (){
    val book :Book  = Book.BookFactory.create()

    val bookId = Book.BookFactory.getId()

    println("${book.id}와 ${book.name}")
}
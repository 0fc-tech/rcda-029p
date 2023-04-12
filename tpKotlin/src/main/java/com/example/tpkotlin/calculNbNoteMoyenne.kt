package com.example.tpkotlin

fun main() {
    println("Calcul de moyenne")
    println("Rentrer le nombre de notes")
    val nbNotes : Int = readln().toIntOrNull() ?: 0
    val alNotes = arrayListOf<Float>()
    for (index in 1..nbNotes){
        println("Note:")
        val note = readln().toFloatOrNull()
        if(note != null)
            alNotes.add(note)
    }
    println("Ma moyenne est de : ${alNotes.average()}")
}


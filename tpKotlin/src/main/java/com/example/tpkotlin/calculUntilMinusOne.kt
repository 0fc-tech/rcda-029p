package com.example.tpkotlin

fun main() {
    var note : Float
    val alNotes = arrayListOf<Float>()
    do {
        println("Note (-1 pour terminer) ?")
        note = readln().toFloatOrNull() ?: -1f
        if(note != -1f)
            alNotes.add(note)
    }while (note != -1f)
    println("Ma moyenne est de : ${alNotes.average()}")

}

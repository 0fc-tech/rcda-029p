package com.example.mod9room.bo

import androidx.room.Entity
import androidx.room.PrimaryKey


enum class SexOtter{
    MALE, FEMALE
}

/**
 * @author RCDA_029P
 * @param size Size in cms of the otter
 */
@Entity
data class Otter(
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0,
    val name: String,
    val sex: SexOtter,
    val cutenessIndex: Byte,
    val age: Int,
    val isAlive: Boolean,
    val size: Float,
)


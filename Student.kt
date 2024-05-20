package com.example.classroom.data

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName ="student_table")
 data class Student(
     @PrimaryKey(autoGenerate = true)
        var id: Int? = null,
     @ColumnInfo(name = "student_number")
        val studentNumber: String,
     @ColumnInfo(name = "first_name")
        val firstName: String,
     @ColumnInfo(name = "last_name")
        val lastName: String,
     @ColumnInfo(name = "enrollment_date")
        val enrollmentDate: Date,
     @ColumnInfo(name = "major")
        val major: String,
     @Ignore
        val playingWithPhoneInClass: Boolean,
     @Embedded
        val course:Course
 )

 @Entity(tableName = "course_table")
data class Course(
     @PrimaryKey(autoGenerate =true)
        val id: Int? = null,
     @ColumnInfo(name = "course_name")
        val courseName: String,
     @ColumnInfo(name = "credits")
        val credits: Int,
     @ColumnInfo(name = "instructor")
        val instructor: String
)

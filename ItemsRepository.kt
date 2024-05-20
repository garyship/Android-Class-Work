package com.example.classroom.data

import kotlinx.coroutines.flow.Flow

interface ItemsRepository {
    fun getAllStudentsStream(): Flow<List<Student>>
    fun getStudentStream(id:Int):Flow<Student?>
    suspend fun insertItem(student: Student)
    suspend fun deleteItem(student: Student)
    suspend fun updateItem(student: Student)
}
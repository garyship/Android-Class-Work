package com.example.classroom.data

import kotlinx.coroutines.flow.Flow

class OfflineItemsRepository (private  val studentDao: StudentDao):ItemsRepository{
    override fun getAllStudentsStream(): Flow<List<Student>> = studentDao.getAllStudents()

    override fun getStudentStream(id:Int):Flow<Student?> =studentDao.getStudent(id)

    override  suspend fun insertItem(student: Student)=studentDao.insert(student)
    override  suspend fun deleteItem(student: Student)=studentDao.delete(student)
    override  suspend fun updateItem(student: Student)=studentDao.update(student)
}
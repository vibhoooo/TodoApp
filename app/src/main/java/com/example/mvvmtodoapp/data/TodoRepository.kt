package com.example.mvvmtodoapp.data

import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun insertTodo(todo: Todo)
    suspend fun deleteTodo(todo: Todo)
    suspend fun getTodoById(todo: Int): Todo?
    fun getTodos(): Flow<List<Todo>>
}
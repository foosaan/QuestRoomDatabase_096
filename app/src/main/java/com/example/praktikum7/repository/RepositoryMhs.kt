package com.example.praktikum7.repository

import com.example.praktikum7.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    //interface ini operasinya harus sesuai dengan yang di dao
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    //getAllMhs
    fun getAllMhs(): Flow<List<Mahasiswa>>


}
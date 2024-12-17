package com.example.praktikum7.repository

import com.example.praktikum7.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    //interface ini operasinya harus sesuai dengan yang di dao
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    //getAllMhs
    fun getAllMhs(): Flow<List<Mahasiswa>>

    //getMhs
    fun getMhs(nim: String): Flow<Mahasiswa>

    //deleteMhs
    suspend fun deleteMhs(mahasiswa: Mahasiswa)
    //updateMhs
    suspend fun updateMhs(mahasiswa: Mahasiswa)


}
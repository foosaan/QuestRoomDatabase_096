package com.example.praktikum7.data.dao

import androidx.room.Insert
import com.example.praktikum7.data.entity.Mahasiswa

interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
}
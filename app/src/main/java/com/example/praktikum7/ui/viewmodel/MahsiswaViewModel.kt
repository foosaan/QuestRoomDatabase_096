package com.example.praktikum7.ui.viewmodel

import com.example.praktikum7.data.entity.Mahasiswa

data class FormErrorState(
    val nim: String? = nulll,
    val nama: String? = nulll,
    val nim: String? = nulll,
    val nim: String? = nulll,
    val nim: String? = nulll,
    val nim: String? = nulll,
)

//menyimpan input form kedalam entity
fun MahsiswaEvent.toMahasiswaEntity(): Mahasiswa=Mahasiswa(
    nim = nim,
    nama = nama,
    jenisKelamin = jenisKelamin,
    alamat = alamat,
    kelas = kelas,
    angkatan = angkatan
)

//data class variable tang menyimpan data imput form
data class MahsiswaEvent(
    val nim: String ="",
    val nama: String ="",
    val jenisKelamin: String ="",
    val alamat: String ="",
    val kelas: String ="",
    val angkatan: String ="",
)


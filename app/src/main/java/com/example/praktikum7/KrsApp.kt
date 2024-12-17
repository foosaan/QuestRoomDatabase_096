package com.example.praktikum7

import android.app.Application
import com.example.praktikum7.depedenciesinjection.ContainerApp
import com.example.praktikum7.depedenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    //fungsi untuk menyimpan instance container app
    lateinit var containerApp: ContainerApp

    override  fun onCreate(){
        super.onCreate()
        //membuat instance containerApp
        containerApp = ContainerApp(context = this)
        //instance adalah object yang dibuat dari class
    }
}
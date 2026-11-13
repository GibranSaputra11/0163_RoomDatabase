package com.ktp.roomdatabase

import android.app.Application
import com.ktp.roomdatabase.repositori.ContainerApp
import com.ktp.roomdatabase.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}
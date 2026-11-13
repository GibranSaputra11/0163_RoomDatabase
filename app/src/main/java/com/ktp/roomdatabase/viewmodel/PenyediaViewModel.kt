package com.ktp.roomdatabase.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ktp.roomdatabase.AplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
}
/*
* Fungsi ekstensi query untuk object [Application] dan mengembalikan sebuah instance dari [AplikasiSiswa].*/
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
package com.ktp.roomdatabase.viewmodel

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

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
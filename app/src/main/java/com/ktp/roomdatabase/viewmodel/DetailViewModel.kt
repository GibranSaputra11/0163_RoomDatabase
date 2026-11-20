package com.ktp.roomdatabase.viewmodel

import androidx.lifecycle.SavedStateHandle
import com.ktp.roomdatabase.repositori.RepositoriSiswa

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
)
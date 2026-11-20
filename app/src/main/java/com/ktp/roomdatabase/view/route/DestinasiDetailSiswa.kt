package com.ktp.roomdatabase.view.route

import com.ktp.roomdatabase.R
import com.ktp.roomdatabase.uicontroller.DestinasiNavigasi

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"

    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}
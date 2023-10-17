package com.example.utsmobkom.modul

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Matkul(
    @StringRes val matkulRes: Int,
    @StringRes val sksRes: Int,
    @DrawableRes val imageRes: Int
)

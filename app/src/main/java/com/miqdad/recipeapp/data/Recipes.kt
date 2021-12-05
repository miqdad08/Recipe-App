package com.miqdad.recipeapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipes(
    var name :  String?,
    var category: String?,
    var descprition: String?,
    var ingredients : String?,
    var instruction: String?,
    var photo: String?,
    var price : String?,
    var calories : String?,
    var carbo : String?,
    var protein : String?,
) : Parcelable
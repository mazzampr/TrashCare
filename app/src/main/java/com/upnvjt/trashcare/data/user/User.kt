package com.upnvjt.trashcare.data.user

data class User(
    val firstname: String? = null,
    val lastname: String? = null,
    val username: String = "",
    val email: String = "",
    val taCoins: Int = 0,
    var imagePath: String = ""
)

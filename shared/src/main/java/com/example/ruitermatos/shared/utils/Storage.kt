package com.example.ruitermatos.shared.utils

import android.content.Context

/**
 * Created by ruitermatos on 24/10/17.
 */
class Storage constructor(val context: Context) {

    // Salva uma preferencia
    fun save(key: String, value: String) {
        try {
            val sharedPreferences = this.context.getSharedPreferences("MY_SHARED_PREF_FRETES", 0)
            val editor = sharedPreferences.edit()
            editor.putString(key, value)
            editor.apply()
        } catch (ex: Exception) {
        }

    }

    // Carrega uma preferencia
    fun load(key: String): String {
        try {
            val sharedPreferences = this.context.getSharedPreferences("MY_SHARED_PREF_FRETES", 0)
            val valor = sharedPreferences.getString(key, "")
            return valor
        } catch (ex: Exception) {
            return ""
        }

    }
}
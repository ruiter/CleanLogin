package com.example.ruitermatos.repository.service

import com.example.ruitermatos.repository.storage.StorageRepository
import com.example.ruitermatos.signup.domain.model.SignUp
import io.reactivex.Observable

/**
 * Created by ruitermatos on 25/10/17.
 */
class StorageService : StorageRepository {

    override fun saveData(key: String, value: String) : Boolean {
        try {
            val sharedPreferences = this.context.getSharedPreferences("MY_SHARED_PREF_FRETES", 0)
            val editor = sharedPreferences.edit()
            editor.putString(key, value)
            editor.apply()
        } catch (ex: Exception) {
            return false
        }

        return true
    }

//    override fun getData() : Observable<SignUp> {
//        try {
//            val sharedPreferences = this.context.getSharedPreferences("MY_SHARED_PREF_FRETES", 0)
//            val valor = sharedPreferences.getString(key, "")
//            return valor
//        } catch (ex: Exception) {
//           //
//        }
//    }
}
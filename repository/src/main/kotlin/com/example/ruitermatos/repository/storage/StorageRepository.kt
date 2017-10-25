package com.example.ruitermatos.repository.storage

import com.example.ruitermatos.signup.domain.model.SignUp
import io.reactivex.Observable

/**
 * Created by ruitermatos on 25/10/17.
 */
interface StorageRepository {

    fun saveData(key: String, value: String) : Boolean

    //fun getData() : Observable<SignUp>
}
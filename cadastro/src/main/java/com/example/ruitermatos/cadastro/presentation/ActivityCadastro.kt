package com.example.ruitermatos.cadastro.presentation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.ruitermatos.cadastro.R
import com.example.ruitermatos.shared.BaseActivity

class ActivityCadastro : BaseActivity() {

//    companion object {
//        @JvmStatic
//        fun newInstance(context: Context): Intent {
//            return Intent(context, ActivityCadastro::class.java)
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }
}

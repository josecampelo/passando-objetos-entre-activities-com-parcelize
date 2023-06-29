package com.campelo.passandoobjetosentreactivitiescomparcelize

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    private lateinit var txtNome: TextView
    private lateinit var txtDuracao: TextView
    private lateinit var txtDistribuidor: TextView
    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        txtNome = findViewById(R.id.txtNome)
        txtDuracao = findViewById(R.id.txtDuracao)
        txtDistribuidor = findViewById(R.id.txtDistribuidor)
        btnVoltar = findViewById(R.id.btnVoltar)

        val bundle = intent.extras

        val filme = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            bundle?.getParcelable("filme", Filme::class.java)
        }else{
            bundle?.getParcelable("filme")
        }

        txtNome.text = "Nome: ${filme?.nome}"
        txtDuracao.text = "Duração: ${filme?.duracao}"
        txtDistribuidor.text = "Distribuidor: ${filme?.distribuidor}"

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
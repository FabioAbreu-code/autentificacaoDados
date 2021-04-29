package pt.ipg.autentificacaodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mostrarAutentificacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_autentificacao)

        val mensagemNome = intent.getStringExtra(MainActivity.INFO_NOME)
        val textViewNome = findViewById<TextView>(R.id.textViewNome)
        textViewNome.text = mensagemNome

        val mensagemEmail = intent.getStringExtra(MainActivity.INFO_EMAIL)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        textViewEmail.text = mensagemEmail

        val mensagemTelemovel = intent.getStringExtra(MainActivity.INFO_TELEMOVEL)
        val textViewTelemovel = findViewById<TextView>(R.id.textViewTelemovel)
        textViewTelemovel.text = mensagemTelemovel

        val mensagemIdade = intent.getStringExtra(MainActivity.INFO_IDADE)
        val textViewIdade = findViewById<TextView>(R.id.textViewIdade)
        textViewIdade.text = mensagemIdade
    }
}
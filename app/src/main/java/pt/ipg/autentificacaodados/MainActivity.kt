package pt.ipg.autentificacaodados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object{
        val INFO_NOME = "NOME"
        val INFO_EMAIL = "EMAIL"
        val INFO_TELEMOVEL = "TELEMOVEL"
        val INFO_IDADE = "IDADE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View ) {
        val TextInputEditNome = findViewById<EditText>(R.id.TextInputEditNome)
        val mensagemNome = TextInputEditNome.text.toString()

        val TextInputEditEmail = findViewById<EditText>(R.id.TextInputEditEmail)
        val mensagemEmail = TextInputEditEmail.text.toString()

        val TextInputEditTelemovel = findViewById<EditText>(R.id.TextInputEditTelemovel)
        val mensagemTelemovel = TextInputEditTelemovel.text.toString()

        val TextInputEditIdade = findViewById<EditText>(R.id.TextInputEditIdade)
        val mensagemIdade = TextInputEditIdade.text.toString()


        if (mensagemNome.isBlank()){
            TextInputEditNome.error = "Messagem vazia ou incorreta"
        }
        if (mensagemEmail.isBlank()){
            TextInputEditEmail.error = "Messagem vazia ou incorreta"
        }
        if (mensagemTelemovel.isBlank()){
            TextInputEditTelemovel.error = "Messagem vazia ou incorreta"
        }
        if (mensagemIdade.isBlank()){
            TextInputEditIdade.error = "Messagem vazia ou incorreta"
        }

        if(mensagemNome.isBlank()  || mensagemEmail.isBlank() || mensagemTelemovel.isBlank() || mensagemIdade.isBlank()){
            return
        }
        val  intent = Intent(this, mostrarAutentificacao::class.java)
            intent.putExtra(INFO_NOME, mensagemNome)
            intent.putExtra(INFO_EMAIL, mensagemEmail)
            intent.putExtra(INFO_TELEMOVEL, mensagemTelemovel)
            intent.putExtra(INFO_IDADE, mensagemIdade)


        startActivity(intent)


    }


}
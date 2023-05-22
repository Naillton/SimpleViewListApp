package com.example.simpleviewlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // definindo listView e recuperano o id da lista
        val listView: ListView = findViewById(R.id.listView)

        // definindo estrutura de dados, nesse caso usaremos um array de string
        val world_cup_array = arrayOf(
            "Brazil",
            "Argentina",
            "Germany",
            "Franca",
            "England",
            "Qatar",
            "Venezuela",
            "EUA",
            "Canadian",
            "Uruguay",
            "Italy",
        )

        // definindo adaptador de array
        val arrayAdapter: ArrayAdapter<*>
        // no parametro do nosso adaptador podemos passar um layout customizado, aqui usamos um ja existente no androidStudio
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_expandable_list_item_1,
            world_cup_array
        )

        // conectando listView ao nosso arrayAdapter
        // dessa forma conseguimos conectar nosso array adaptado a nossa listView e exibir na tela
        listView.adapter = arrayAdapter
    }
}
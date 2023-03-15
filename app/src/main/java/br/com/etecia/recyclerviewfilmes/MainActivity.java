package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a base de dados para carregamento da Lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Jesus de Nazaré", "Desde o celebrado momento do seu nascimento até a sua chegada em Jerusalém para ir de encontro com a crucificação, a história de Jesus de Nazaré foi um marco que perdura até hoje. Pouco antes de cumprir seu destino na Terra, Jesus passa por um longo retiro de 40 dias pelo deserto da Judeia, atravessando diversos tipos de obstáculos, provações e tentações.","Histórico/Religioso",R.drawable.jesus));


        //Criando a classe adaptadora e passando os parametros
          MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);
    }
}
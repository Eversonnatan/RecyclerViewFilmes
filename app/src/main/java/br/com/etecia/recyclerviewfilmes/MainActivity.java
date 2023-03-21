package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;

    //declarar o recycler view
    RecyclerView idRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o Java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //criando a base de dados para carregamento da Lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Jesus de Nazaré", "Desde o celebrado momento do seu nascimento até a sua chegada em Jerusalém para ir de encontro com a crucificação, a história de Jesus de Nazaré foi um marco que perdura até hoje. Pouco antes de cumprir seu destino na Terra, Jesus passa por um longo retiro de 40 dias pelo deserto da Judeia, atravessando diversos tipos de obstáculos, provações e tentações.", "Histórico/Religioso", R.drawable.jesus));
        listaFilmes.add(
                new Filmes("Donnie Darko", "Donnie é um jovem excêntrico que despreza a grande maioria de seus colegas de escola. Ele tem visões, em especial de Frank, um coelho gigante que só ele consegue ver e que o encoraja a fazer brincadeiras humilhantes com quem o cerca.", "Ficção cientifica", R.drawable.donnie));
        listaFilmes.add(
                new Filmes("Jhon Wick", "John Wick é forçado a deixar a aposentadoria mais uma vez por causa de uma promessa antiga e viaja para Roma, com o objetivo de ajudar um velho amigo a derrubar uma organização secreta, perigosa e mortal de assassinos procurados em todo o mundo. ", "Ação/Tiroteio", R.drawable.jhonwick));
        listaFilmes.add(
                new Filmes("Seven", "A ponto de se aposentar, o detetive William Somerset pega um último caso, com a ajuda do recém-transferido David Mills. Juntos, descobrem uma série de assassinatos e logo percebem que estão lidando com um assassino que tem como alvo pessoas que ele acredita representar os sete pecados capitais.", "Suspense/Policial", R.drawable.seven));
        listaFilmes.add(
                new Filmes("Top Gun ", "Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, Pete \"Maverick\" Mitchell está de volta, rompendo os limites como um piloto de testes corajoso. No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta drones e prova que o fator humano ainda é essencial.", "Ação/Militar", R.drawable.topgun));
        listaFilmes.add(
                new Filmes("Tres Homens em Conflito", "Nos Estados Unidos, durante a Guerra de Secessão, um pistoleiro misterioso tenta trabalhar em conjunto com um bandido e um caçador de recompensas para encontrar um tesouro escondido. Os homens são obrigados a forjar uma difícil aliança visto que cada um conhece apenas uma parte da localização da fortuna. O problema é que nenhum deles tem a intenção de dividir a riqueza.", "Wester/Espaguete", R.drawable.treshomens));
        listaFilmes.add(
                new Filmes("300", "Em 480 A.C., existe uma guerra entre a Pérsia, liderada pelo rei Xerxes, e a Grécia. Na batalha de Thermopylae, Leônidas, rei da cidade grega de Sparta, lidera seu guerreiros em desvantagem contra o massivo exército persa. Mesmo sabendo que a morte certa os espera, seus sacrifícios inspiram toda a Grécia a unir-se contra o seu inimigo comum.", "Baseado em Hq", R.drawable.trezentos));
listaFilmes.add(
                new Filmes("Senhor dos Anéis ", "Após a captura de Merry (Dominic Monaghan) e Pippy (Billy Boyd) pelos orcs, a Sociedade do Anel é dissolvida. Enquanto que Frodo (Elijah Wood) e Sam (Sean Astin) seguem sua jornada rumo à Montanha da Perdição para destruir o Um Anel, Aragorn (Viggo Mortensen), Legolas (Orlando Bloom) e Gimli (John Rhys-Davies) partem para resgatar os hobbits sequestrados.", " aventura e fantasia", R.drawable.torres));


        //Criando a classe adaptadora e passando os parametros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //tipo layout que a lista irá seguir
        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //fixador de tamanho da lista - deixar mais rapida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerView ao adptador
        idRecyclerView.setAdapter(adapter);

    }
}
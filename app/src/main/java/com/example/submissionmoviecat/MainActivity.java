package com.example.submissionmoviecat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listMovie;
    private ArrayList<Movie> list =new ArrayList<>();

    private static String[] NamaMovie = {
            "joker",
            "bohemian",
            "dragonball",
            "dragon",
            "aquaman",
            "a_star",
            "glass",
            "mortalengine",
            "robinhood",
            "venom"
    };

    private static String[] DetailMovie = {
            "Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown, and the guise he projects in a futile attempt to feel like he's part of the world around him. Isolated, bullied and disregarded by society, Fleck begins a slow descent into madness as he transforms into the criminal mastermind known as the Joker",
            "Freddie Mercury -- the lead singer of Queen -- defies stereotypes and convention to become one of history's most beloved entertainers. The band's revolutionary sound and popular songs lead to Queen's meteoric rise in the 1970s. After leaving the group to pursue a solo career, Mercury reunites with Queen for the benefit concert Live Aid -- resulting in one of the greatest performances in rock 'n' roll history",
            "One fateful day, a Saiyan appears before Goku and Vegeta who they have never seen before: Broly. With the return of Frieza from hell, a fierce battle awaits these three Saiyans who have followed completely different destinies.",
            "All seems well on the island of Berk as Vikings and dragons live together in peace and harmony. Now a Viking leader, Hiccup finds himself increasingly attracted to Astrid, while his beloved dragon Toothless meets an enchanting creature who captures his eye. When the evil Grimmel launches a devious plan to wipe out all the dragons, Hiccup must unite both clans to find Caldera, a hidden land that holds the key to saving Toothless and his flying friends.",
            "Half-human, half-Atlantean Arthur is born with the ability to communicate with marine creatures. His motive is to retrieve the legendary Trident of Atlan and protect the water world.",
            "After falling in love with struggling artist Ally, Jackson, a musician, coaxes her to follow her dreams, while he battles with alcoholism and his personal demons.",
            "David Dunn tries to stay one step ahead of the law while delivering vigilante justice on the streets of Philadelphia. His special talents soon put him on a collision course with the Beast -- the psychotic madman who has superhuman strength and 23 distinct personalities. Their epic showdown leads them to an encounter with the mysterious Elijah Price, the criminal mastermind who holds critical secrets for both men.",
            "A man and a woman come together in a bid to save the world from the expedient measures taken by countries to survive in a post-apocalyptic world.",
            "After returning home to England, aristocrat Robin of Loxley learns that the evil Sheriff of Nottingham has seized his family estate. He soon joins forces with Friar Tuck and Little John -- a fierce Arabian warrior who wants to put an end to the Crusades. Armed with arrows and dubbed Robin Hood, Loxley leads a band of oppressed rebels in a daring plan to rob the Sheriff of his money and take away his power.",
            "While trying to take down Carlton, the CEO of Life Foundation, Eddie, a journalist, investigates experiments of human trials. Unwittingly, he gets merged with a symbiotic alien with lethal abilities."


    };

    private static String[] NamaFilm ={
            "Joker",
            "Bohemian Rhapsody",
            "Dragonball : Broly",
            "How to train your dragon : Hidden World",
            "Aquaman",
            "A star is born",
            "Glass",
            "Mortal engine",
            "Robinhood",
            "Venom"

    };

    private static Integer [] GambarMovie = {
            R.drawable.joker,
            R.drawable.bohemian,
            R.drawable.dragonball,
            R.drawable.dragon,
            R.drawable.aquaman,
            R.drawable.a_star,
            R.drawable.glass,
            R.drawable.mortalengine,
            R.drawable.robinhood,
            R.drawable.venom
    };

    static ArrayList<Movie> getMovieData(){
        ArrayList<Movie> list = new ArrayList<>();
        for (int position =0;position <NamaMovie.length; position++){
            Movie movie = new Movie();
            movie.setName(NamaMovie[position]);
            movie.setDetail(DetailMovie[position]);
            movie.setPhoto(GambarMovie[position]);
            list.add(movie);


        }
        return list;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.addAll(MainActivity.getMovieData());

        listMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });










    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_Setting) {
            return true;
        }






    }
}

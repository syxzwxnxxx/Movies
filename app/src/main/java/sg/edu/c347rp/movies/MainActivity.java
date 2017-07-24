package sg.edu.c347rp.movies;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Steps for custom List
    ArrayList<movies>almovie;
    ListView lvMovie;
    CustomAdapter caMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = (ListView)findViewById(R.id.lv);
        almovie = new ArrayList<movies>();

        caMovie = new CustomAdapter(this, R.layout.movies_row, almovie);
        lvMovie.setAdapter(caMovie);

        movies item1 = new movies("The Avengers", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.", "2012 - Action | Sci-Fi", "Watch on 15/11/2014","Golden Village - Bishan");
        almovie.add(item1);

        movies item2 = new movies("Planes", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.", "2013 - Action | Animation | Comedy", "Watch on 15/5/2015", "Cathay - AMK Hub");
        almovie.add(item2);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                Intent intent = new Intent(listView.getContext(), moviesDetails.class);
                movies m = almovie.get(position);

                intent.putExtra("title", m.getTitle());
                intent.putExtra("date", m.getDate());
                intent.putExtra("year", m.getYear());
                intent.putExtra("detail", m.getDetail());
                intent.putExtra("place", m.getPlace());
                startActivity(intent);
            }

        });
    }
}

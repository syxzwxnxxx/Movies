package sg.edu.c347rp.movies;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 15017466 on 24/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<movies> movieList;//change

    public CustomAdapter(Context context, int resource, ArrayList<movies> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects; //change

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater  =(LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        TextView tvGenre = (TextView) rowView.findViewById(R.id.tvGenre);
        ImageView imageViewBox1 = (ImageView)rowView.findViewById(R.id.iv);

        movies currentItem = movieList.get(position);

        tvTitle.setText(currentItem.getTitle());

        if(currentItem.getTitle().equals("The Avengers")){
            imageViewBox1.setImageResource(R.drawable.rating_pg13);
            tvGenre.setText("2012 - Action | Sci-Fi");
        }else if(currentItem.getTitle().equals("Planes")){
            imageViewBox1.setImageResource(R.drawable.rating_pg);
            tvGenre.setText("2013 - Animation | Comedy");
        }else{
            imageViewBox1.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}

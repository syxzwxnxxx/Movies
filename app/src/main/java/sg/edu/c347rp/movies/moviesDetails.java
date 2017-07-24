package sg.edu.c347rp.movies;

import android.content.Intent;
import android.media.Image;
import android.media.Rating;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class moviesDetails extends AppCompatActivity {
    TextView tvYear;
    TextView tvTitle;
    TextView tvDate;
    TextView tvDetail;
    TextView tvPlace;
    ImageView ivMovie;
    RatingBar ratingBar;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_details);

        tvYear = (TextView)findViewById(R.id.tvYear);
        tvDetail = (TextView)findViewById(R.id.tvDetail);
        tvPlace = (TextView)findViewById(R.id.tvPlace);
        tvDate = (TextView)findViewById(R.id.tvDate);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        ivMovie = (ImageView)findViewById(R.id.ivMovie);
        ratingBar =(RatingBar)findViewById(R.id.ratingBar);
        iv = (ImageView)findViewById(R.id.iv);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        String detail = intentReceived.getStringExtra("detail");
        String year = intentReceived.getStringExtra("year");
        String date = intentReceived.getStringExtra("date");
        String place = intentReceived.getStringExtra("place");

        if (title == "The Avengers") {
            tvTitle.setText(title);
            tvDetail.setText(detail);
            tvDate.setText(date);
            tvYear.setText(year);
            tvPlace.setText(place);
            iv.setImageResource(R.drawable.avengers);
            ivMovie.setImageResource(R.drawable.rating_pg13);
            String rating =String.valueOf(ratingBar.getRating());

        } else {
            tvTitle.setText(title);
            tvDetail.setText(detail);
            tvDate.setText(date);
            tvYear.setText(year);
            tvPlace.setText(place);
            iv.setImageResource(R.drawable.planes);
            ivMovie.setImageResource(R.drawable.rating_pg);
            String rating =String.valueOf(ratingBar.getRating());

        }

    }
}

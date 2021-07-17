package com.example.submissionmoviecat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Activity extends AppCompatActivity {
    TextView txtName,Txtdetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtName = findViewById(R.id.judul);
        Movie movie = getIntent().getParcelableExtra("movie");
        txtName.setText(movie.getName());

        Txtdetail = findViewById(R.id.penjelasan);
        Txtdetail.setText(movie.getDetail());

        imgView = findViewById(R.id.gambar);
        imgView.setImageResource(movie.getPhoto());

    }

}

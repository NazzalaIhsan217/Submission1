package com.example.submissionmoviecat;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ListMovieAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] judullist;
    private final String[] detaillist;
    private final Integer[] photolist;


    public ListMovieAdapter(Activity context, String[] namaMovie, String[] judullist, String[] detaillist, Integer[] photolist) {
        super(context,R.layout.item_movie,namaMovie);
        this.context = context;
        this.judullist = judullist;
        this.detaillist = detaillist;
        this.photolist = photolist;
    }

    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View x1x1 = inflater .inflate(R.layout.item_movie,null,true);

        TextView txtList = x1x1.findViewById(R.id.tv_item_name);
        ImageView imageList = x1x1.findViewById(R.id.img_movie);
        TextView txtdetail = x1x1.findViewById(R.id.tv_item_detail);

        txtList.setText(judullist[position]);
        imageList.setImageResource(photolist[position]);
        txtdetail.setText(detaillist[position]);

        return x1x1;
    }

}

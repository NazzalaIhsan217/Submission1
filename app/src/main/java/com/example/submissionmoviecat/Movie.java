package com.example.submissionmoviecat;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    String Name;
    String Detail;
    int Photo;

    protected Movie(Parcel in) {
        Name = in.readString();
        Detail = in.readString();
        Photo = in.readInt();
    }

    public Movie() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Detail);
        dest.writeInt(Photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}

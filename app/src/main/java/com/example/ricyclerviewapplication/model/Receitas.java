package com.example.ricyclerviewapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

public  class Receitas implements Parcelable {

    private String name;
    private String description;
    private int imageReceita;

    public Receitas(String name, String description, int imageReceita) {
        this.name = name;
        this.description = description;
        this.imageReceita = imageReceita;
    }



    public Receitas(Parcel in) {
        name = in.readString();
        description = in.readString();
        imageReceita = in.readInt();
    }

    public static final Creator<Receitas> CREATOR = new Creator<Receitas>() {
        @Override
        public Receitas createFromParcel(Parcel in) {
            return new Receitas(in);
        }

        @Override
        public Receitas[] newArray(int size) {
            return new Receitas[size];
        }
    };

    public int getImageReceita() {
        return imageReceita;
    }

    public void setImageReceita(int imageReceita) {
        this.imageReceita = imageReceita;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeInt(imageReceita);
    }
}
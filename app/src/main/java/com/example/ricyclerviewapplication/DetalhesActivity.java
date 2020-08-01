package com.example.ricyclerviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ricyclerviewapplication.model.Receitas;

public class DetalhesActivity extends AppCompatActivity {

    private TextView mTextview;
    private TextView mTextview2;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        final Intent intent = getIntent();

        Receitas receitas = intent.getParcelableExtra("Receitas");
        mTextview = findViewById(R.id.titulo_detail);
        mTextview2 = findViewById(R.id.text_detail);
        mImageView = findViewById(R.id.image_detail);

            mTextview.setText(receitas.getName());
            mTextview2.setText(receitas.getDescription());
            mImageView.setImageResource(receitas.getImageReceita());
    }
}
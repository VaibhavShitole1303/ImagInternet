package com.example.imageinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
  ImageView onlineimg,onlineimg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onlineimg=findViewById(R.id.imageView);
        onlineimg2=findViewById(R.id.imageView2);
        String uri="https://bakesbybrownsugar.com/wp-content/uploads/2022/12/Prune-Bread-Pudding-3-1-1004x1536.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(onlineimg);


        Picasso.get().load("https://bakesbybrownsugar.com/wp-content/uploads/2022/12/Tart-Cherry-Puff-Pastry-Danish-8-768x1152.jpg").placeholder(R.drawable.placeholder).into(onlineimg2);
    }
}

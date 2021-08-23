package com.example.android.task_one_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import com.example.android.task_one_1.helper.Adapter;
import com.example.android.task_one_1.helper.Helper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView laptopRecycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        laptopRecycler = findViewById(R.id.my_recycler);
        laptopRecycler();
    }

    private void laptopRecycler() {

        GradientDrawable gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        GradientDrawable gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        GradientDrawable gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});

        laptopRecycler.setHasFixedSize(true);
        laptopRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Helper> laptoplocations = new ArrayList<>();
        laptoplocations.add(new Helper(gradient1, R.drawable.apple, "Apple"));
        laptoplocations.add(new Helper(gradient4, R.drawable.hp, "HP"));
        laptoplocations.add(new Helper(gradient2, R.drawable.dell, "DELL"));
        laptoplocations.add(new Helper(gradient4, R.drawable.lenovo, "LENEVO"));

        laptoplocations.add(new Helper(gradient2, R.drawable.asus, "ASUS"));


        adapter = new Adapter(laptoplocations);
        laptopRecycler.setAdapter(adapter);

    }
}
package com.example.android.task_one_1.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.task_one_1.MainActivity;
import com.example.android.task_one_1.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.LaptopHolder>  {

    ArrayList<Helper> laptoplocations;

    public Adapter(ArrayList<Helper> laptoplocations) {
        this.laptoplocations = laptoplocations;
    }

    @NonNull

    @Override
    public LaptopHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.laptop_layout, parent, false);
        return new LaptopHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull LaptopHolder holder, int position) {


        Helper helper = laptoplocations.get(position);
        holder.image.setImageResource(helper.getImage());
        holder.title.setText(helper.getTitle());
        holder.relativeLayout.setBackground(helper.getgradient());
    }

    @Override
    public int getItemCount() {
        return laptoplocations.size();

    }

    public class LaptopHolder extends RecyclerView.ViewHolder{


        ImageView image;
        TextView title;
        RelativeLayout relativeLayout;


        public LaptopHolder(@NonNull View itemView) {
            super(itemView);
            //hooks

            image = itemView.findViewById(R.id.laptop_image);
            title = itemView.findViewById(R.id.laptop_title);
            relativeLayout = itemView.findViewById(R.id.background_color);

        }
    }

}

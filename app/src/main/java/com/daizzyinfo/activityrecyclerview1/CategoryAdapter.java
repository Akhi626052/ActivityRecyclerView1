package com.daizzyinfo.activityrecyclerview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.VHMain> {

List<CategoryModel> categoryModels;
Context context;

    public CategoryAdapter(List<CategoryModel> categoryModels, Context context) {
        this.categoryModels = categoryModels;
        this.context = context;
    }


    @NonNull
    @Override
    public CategoryAdapter.VHMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu_rcy,parent,false);
      return new CategoryAdapter.VHMain(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.VHMain holder, int position) {

     holder.imageView.setImageResource(categoryModels.get(position).getImageView());
     holder.textView.setText(categoryModels.get(position).getTextView());


    }

    @Override
    public int getItemCount() {
        return categoryModels.size();
    }

    public class VHMain extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public VHMain(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);


        }
    }
}

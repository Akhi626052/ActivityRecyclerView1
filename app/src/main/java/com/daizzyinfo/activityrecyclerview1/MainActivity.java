package com.daizzyinfo.activityrecyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.daizzyinfo.activityrecyclerview1.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
   List<CategoryAdapter> categoryAdapters;
   List<CategoryModel> categoryModel = new ArrayList<>();
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);



     categoryModel.add(new CategoryModel(R.drawable.user,"dflkasfhdgfad"));
     categoryModel.add(new CategoryModel(R.drawable.user,"fkdfghkfslgsgf"));
     categoryModel.add(new CategoryModel(R.drawable.user,"fdjgfdkjghkfgj"));

      /*  LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.recyclerView.setLayoutManager(manager);*/




        GridLayoutManager layoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
      binding.recyclerView.setLayoutManager(layoutManager);
      CategoryAdapter adapter = new CategoryAdapter(categoryModel,this);
      binding.recyclerView.setAdapter(adapter);




    }
}
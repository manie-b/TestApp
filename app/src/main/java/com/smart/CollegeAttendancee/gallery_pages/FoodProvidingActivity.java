package com.smart.CollegeAttendancee.gallery_pages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.smart.CollegeAttendancee.R;
import com.smart.CollegeAttendancee.adapter.StaggeredRecyclerviewAdapter;
import com.smart.CollegeAttendancee.model.row;

import java.util.ArrayList;

public class FoodProvidingActivity extends AppCompatActivity {

    private RecyclerView staggeredRv;
    private StaggeredRecyclerviewAdapter adapter;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_food_providing);

        //for full screen activity
        getSupportActionBar().hide();

        staggeredRv=findViewById(R.id.staggered_rv_food);
        manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);

        //13-09-2019 url edit
        ArrayList imageUrlList=prepareData();
        StaggeredRecyclerviewAdapter staggeredRecyclerviewAdapter=new StaggeredRecyclerviewAdapter(getApplicationContext(),imageUrlList);
        staggeredRv.setAdapter(staggeredRecyclerviewAdapter);
        //13-09-2019 url edit
    }

    private ArrayList prepareData() {

        String imageUrls[]={
                "http://192.168.0.25/imagesbct/foodimg1.jpg",
                "http://192.168.0.25/imagesbct/foodimg2.jpg",
                "http://192.168.0.25/imagesbct/foodimg3.jpg",
                "http://192.168.0.25/imagesbct/foodimg4.jpg",
                "http://192.168.0.25/imagesbct/foodimg5.jpg",
                "http://192.168.0.25/imagesbct/foodimg6.jpg",
                "http://192.168.0.25/imagesbct/foodimg7.jpg",
                "http://192.168.0.25/imagesbct/foodimg8.jpg",
                "http://192.168.0.25/imagesbct/foodimg9.jpg",
                "http://192.168.0.25/imagesbct/foodimg10.jpg",
                "http://192.168.0.25/imagesbct/foodimg11.jpg",
                "http://192.168.0.25/imagesbct/foodimg12.jpg",
                "http://192.168.0.25/imagesbct/foodimg13.jpg",
                "http://192.168.0.25/imagesbct/foodimg14.jpg",
                "http://192.168.0.25/imagesbct/foodimg15.jpg",
                "http://192.168.0.25/imagesbct/foodimg16.jpg",
                "http://192.168.0.25/imagesbct/foodimg17.jpg",
                "http://192.168.0.25/imagesbct/foodimg18.jpg",
                "http://192.168.0.25/imagesbct/foodimg19.jpg",
                "http://192.168.0.25/imagesbct/foodimg20.jpg",
                "http://192.168.0.25/imagesbct/foodimg21.jpg",
                "http://192.168.0.25/imagesbct/foodimg22.jpg",
                "http://192.168.0.25/imagesbct/foodimg23.jpg",
                "http://192.168.0.25/imagesbct/foodimg24.jpg",
                "http://192.168.0.25/imagesbct/foodimg25.jpg",
                "http://192.168.0.25/imagesbct/foodimg26.jpg",
                "http://192.168.0.25/imagesbct/foodimg27.jpg",
                "http://192.168.0.25/imagesbct/foodimg28.jpg",
                "http://192.168.0.25/imagesbct/foodimg29.jpg",
                "http://192.168.0.25/imagesbct/foodimg30.jpg",
                "http://192.168.0.25/imagesbct/foodimg31.jpg",
                "http://192.168.0.25/imagesbct/foodimg32.jpg",
                "http://192.168.0.25/imagesbct/foodimg33.jpg"
        };

        ArrayList imageUrlList=new ArrayList<>();

        for (int i=0;i<imageUrls.length;i++)
        {
            row row=new row();
            row.setImg(imageUrls[i]);
            imageUrlList.add(row);

        }
        Log.d("FoodProvidingActivity","List count:"+imageUrlList.size());

        return imageUrlList;
    }

}

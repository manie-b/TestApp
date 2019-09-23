package com.smart.CollegeAttendancee.gallery_details_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.smart.CollegeAttendancee.R;

public class GalleryDetailsActivity extends AppCompatActivity {

    ImageView imageView;

    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_details);

        imageView=findViewById(R.id.img_fullView);

        img=getIntent().getIntExtra("image",0);
        imageView.setImageResource(img);
    }
}

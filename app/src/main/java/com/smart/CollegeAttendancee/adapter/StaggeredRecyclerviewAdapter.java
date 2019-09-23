package com.smart.CollegeAttendancee.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smart.CollegeAttendancee.R;
import com.smart.CollegeAttendancee.gallery_details_activity.GalleryDetailsActivity;
import com.smart.CollegeAttendancee.model.row;

import java.util.ArrayList;

public class StaggeredRecyclerviewAdapter extends RecyclerView.Adapter<StaggeredRecyclerviewAdapter.ImageviewHolder>{

    Context mContext;
    ArrayList<row> mData;

    public StaggeredRecyclerviewAdapter(Context mContext, ArrayList<row> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public ImageviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.row_item,parent,false);
        return new ImageviewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageviewHolder holder, int position) {
        /*//bind the images here
        holder.img.setImageResource(mData.get(position).getImg());*/

        //get image url here
        Glide.with(mContext).load(mData.get(position).getImg()).into(holder.img);

        //click listener for new activity 12-09-2019
        final row row=mData.get(position);
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mContext, GalleryDetailsActivity.class);
                intent.putExtra("image",row.getImg());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ImageviewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        public ImageviewHolder(View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.row_image);
        }
    }
}

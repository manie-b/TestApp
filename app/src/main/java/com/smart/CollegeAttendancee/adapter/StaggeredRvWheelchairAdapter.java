package com.smart.CollegeAttendancee.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smart.CollegeAttendancee.gallery_details_activity.GalleryDetailsActivity;
import com.smart.CollegeAttendancee.gallery_details_activity.Wheelchair_GalleryDetailsActivity;
import com.smart.CollegeAttendancee.model.RowItem_Wheelchair;
import com.smart.CollegeAttendancee.model.row;

import java.util.ArrayList;

public class StaggeredRvWheelchairAdapter extends RecyclerView.Adapter<StaggeredRvWheelchairAdapter.ImageviewHolder> {

    Context mContext;
    ArrayList<RowItem_Wheelchair> mData;

    public StaggeredRvWheelchairAdapter(Context mContext, ArrayList<RowItem_Wheelchair> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ImageviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageviewHolder holder, int position) {

        //get image url here
        Glide.with(mContext).load(mData.get(position).getImgurls()).into(holder.img);

        //click listener for new activity 12-09-2019
        final RowItem_Wheelchair row=mData.get(position);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext, Wheelchair_GalleryDetailsActivity.class);
                intent.putExtra("image",row.getImgurls());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ImageviewHolder extends RecyclerView.ViewHolder{

        ImageView img;

        public ImageviewHolder(View itemView) {
            super(itemView);
        }
    }
}

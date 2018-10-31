package com.example.kira.comflu2018;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView title;


    public MyViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.lecture_topic);

    }

}

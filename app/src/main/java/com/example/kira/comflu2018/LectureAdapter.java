package com.example.kira.comflu2018;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class LectureAdapter extends RecyclerView.Adapter<LectureAdapter.LectureViewHolder>{



    private List<CardData>card_data;
    private Context mContext;


   public class LectureViewHolder extends RecyclerView.ViewHolder {

       TextView lecture_topic;
       TextView lecture_time;
       TextView professor;
       TextView lecture_abstract;
       ImageView marked_items;
       TextView tvIcon;
       RelativeLayout lecture_details;
       Boolean marked;
     //  CardView cardView;
        LectureViewHolder(View itemView) {
            super(itemView);

            lecture_time = itemView.findViewById(R.id.lecture_time);
            lecture_topic = itemView.findViewById(R.id.lecture_topic);
            professor   = itemView.findViewById(R.id.professor);
            lecture_abstract = itemView.findViewById(R.id.lecture_abstract);
            marked_items = itemView.findViewById(R.id.marked_items);
            tvIcon = itemView.findViewById(R.id.tvIcon);
            lecture_details = itemView.findViewById(R.id.lecture_details);
           // cardView = itemView.findViewById(R.id.cardView);
        }
    }

    LectureAdapter(List<CardData> card_data, Context mcontext) {
        this.card_data = card_data;
        this.mContext = mcontext;
    }

    @NonNull
    @Override
    public LectureAdapter.LectureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new LectureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LectureAdapter.LectureViewHolder holder, int position) {
        CardData data = card_data.get(position);
        holder.lecture_topic.setText(data.getLecture_topic());
        holder.lecture_time.setText(data.getLecture_time());
        holder.professor.setText(data.getProfessor());
        holder.lecture_abstract.setText(data.getLecture_abstract());
        holder.tvIcon.setText(data.getLecture_topic().substring(0,1));

        Random mRandom = new Random();
       final int color = Color.argb(255, mRandom.nextInt(256), mRandom.nextInt(256), mRandom.nextInt(256));
        ((GradientDrawable)holder.tvIcon.getBackground()).setColor(color);

        holder.marked_items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.marked_items.getColorFilter()!=null)
                {
                    holder.marked_items.clearColorFilter();
                }
                else{
                    holder.marked_items.setColorFilter(ContextCompat.getColor(mContext,R.color.colorOrange));
                }
            }
        });

        holder.lecture_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(mContext,DetailActivity.class);
                mIntent.putExtra("professor", holder.professor.getText().toString());
                mIntent.putExtra("lecture_topic", holder.lecture_topic.getText().toString());
                mIntent.putExtra("lecture_abstract", holder.lecture_abstract.getText().toString());
                mIntent.putExtra("time", holder.lecture_time.getText().toString());
                mIntent.putExtra("tvIcon", holder.tvIcon.getText().toString());
                mIntent.putExtra("colorIcon", color);
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return card_data.size();
    }
}


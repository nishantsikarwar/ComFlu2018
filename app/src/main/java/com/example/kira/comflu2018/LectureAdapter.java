package com.example.kira.comflu2018;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
//import android.os.Bundle;
//import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
//import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
//import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

//import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LectureAdapter extends RecyclerView.Adapter<LectureAdapter.LectureViewHolder>{



    private List<CardData>card_data;
    private Context mContext;
    private SparseBooleanArray itemStateArray= new SparseBooleanArray();

   public class LectureViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

       TextView lecture_topic;
       TextView lecture_time;
       TextView professor;
       TextView lecture_abstract;
       ImageView marked_items;
       TextView tvIcon;
       RelativeLayout lecture_details;
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

            marked_items.setOnClickListener(this);
           // cardView = itemView.findViewById(R.id.cardView);
        }
       void bind(int position) {
           // use the sparse boolean array to check
           if (!itemStateArray.get(position, false)) {
               marked_items.clearColorFilter();
//               mCheckedTextView.setChecked(false);
           }
           else {
               marked_items.setColorFilter(ContextCompat.getColor(mContext,R.color.colorOrange));

//               mCheckedTextView.setChecked(true);
           }
//           mCheckedTextView.setText(String.valueOf(card_data.get(position).getPosition()));
           marked_items.clearColorFilter();
       }
       @Override
       public void onClick(View v) {
           int adapterPosition = getAdapterPosition();
           if (!itemStateArray.get(adapterPosition, false)) {
               marked_items.setColorFilter(ContextCompat.getColor(mContext,R.color.colorOrange));
//               mCheckedTextView.setChecked(true);
               itemStateArray.put(adapterPosition, true);
           }
           else  {
               marked_items.clearColorFilter();
//               mCheckedTextView.setChecked(false);
               itemStateArray.put(adapterPosition, false);
           }
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
    public void onBindViewHolder(@NonNull final LectureAdapter.LectureViewHolder holder, final int position) {
       final int pos = holder.getAdapterPosition();
        CardData data = card_data.get(position);
        holder.lecture_topic.setText(data.getLecture_topic());
        holder.lecture_time.setText(data.getLecture_time());
        holder.professor.setText(data.getProfessor());
        holder.lecture_abstract.setText(data.getLecture_abstract());

        Random mRandom = new Random();
       final int color = Color.argb(255, mRandom.nextInt(256), mRandom.nextInt(256), mRandom.nextInt(256));
        ((GradientDrawable)holder.tvIcon.getBackground()).setColor(color);
        holder.bind(pos);
//
//        holder.marked_items.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                holder.marked_items.getColorFilter()!=null
//                if(card_data.get(position).getMarked())
//                {
//                    card_data.get(position).setMarked(false);
//                    holder.marked_items.clearColorFilter();
//                }
//                else{
//                    card_data.get(position).setMarked(true);
//                    holder.marked_items.setColorFilter(ContextCompat.getColor(mContext,R.color.colorOrange));
//                }
//            }
//        });

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
                mIntent.putExtra("marked",itemStateArray.valueAt(pos));

//                Bundle b = new Bundle();
//                b.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) card_data);
//
//                mIntent.putExtra("data",b);
//                mIntent.putExtra("position",position);

                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return card_data.size();
    }
}


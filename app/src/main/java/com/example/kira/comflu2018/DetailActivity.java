package com.example.kira.comflu2018;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public TextView lecture_topic;
    public TextView lecture_time;
    public TextView professor;
    public TextView lecture_abstract;
    public ImageView marked_items;
    public TextView tvIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        lecture_topic = findViewById(R.id.lecture_topic);
        lecture_abstract= findViewById(R.id.lecture_abstract);
        lecture_time = findViewById(R.id.lecture_time);
        tvIcon = findViewById(R.id.tvIcon);
        marked_items= findViewById(R.id.marked_items);
        professor = findViewById(R.id.professor);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            professor.setText(bundle.getString("professor"));
            lecture_topic.setText(bundle.getString("lecture_topic"));
            lecture_abstract.setText(bundle.getString("lecture_abstract"));
            lecture_time.setText(bundle.getString("time"));
            tvIcon.setText(bundle.getString("tvIcon"));
            ((GradientDrawable)tvIcon.getBackground()).setColor(bundle.getInt("colorIcon"));
        }

        marked_items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(marked_items.getColorFilter()!=null)
                {
                    marked_items.clearColorFilter();
                }
                else{
                    marked_items.setColorFilter(ContextCompat.getColor(DetailActivity.this,R.color.colorOrange));
                }
            }
        });
    }
}


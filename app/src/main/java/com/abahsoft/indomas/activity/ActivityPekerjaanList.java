package com.abahsoft.indomas.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.abahsoft.indomas.R;

import java.util.Calendar;

public class ActivityPekerjaanList extends AppCompatActivity{


    private ImageView headerImage;
    private TextView headerTitle;
    private LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan_list);

        headerImage = (ImageView)findViewById(R.id.header_image);
        headerTitle = (TextView)findViewById(R.id.header_title);
        linearLayout1 = (LinearLayout)findViewById(R.id.layout1);
        linearLayout2 = (LinearLayout)findViewById(R.id.layout2);
        linearLayout3 = (LinearLayout)findViewById(R.id.layout3);
        linearLayout4 = (LinearLayout)findViewById(R.id.layout4);

        loadToolbar();



        linearLayout1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(ActivityPekerjaanList.this, ActivityPekerjaanDetail.class));
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(ActivityPekerjaanList.this, ActivityPekerjaanDetail.class));
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(ActivityPekerjaanList.this, ActivityPekerjaanDetail.class));
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(ActivityPekerjaanList.this, ActivityPekerjaanDetail.class));
            }
        });

    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
	

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void loadToolbar() {

        //headerImage.setImageDrawable(null);
        headerTitle.setText("List Pekerjaan");

        headerImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }

}

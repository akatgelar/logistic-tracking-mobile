package com.abahsoft.indomas.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.abahsoft.indomas.R;

public class ActivityProfil extends AppCompatActivity{


    private ImageView headerImage;
    private TextView headerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        headerImage = (ImageView)findViewById(R.id.header_image);
        headerTitle = (TextView)findViewById(R.id.header_title);

        loadToolbar();

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
        headerTitle.setText("Profil");

        headerImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }

}

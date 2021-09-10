package com.abahsoft.indomas.activity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import com.abahsoft.indomas.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ActivityBahanBakarList extends AppCompatActivity{


    private ImageView headerImage;
    private TextView headerTitle;
    private FloatingActionButton cmdAddBahanBakar;


    Calendar myCalendar;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahan_bakar_list);

        headerImage = (ImageView)findViewById(R.id.header_image);
        headerTitle = (TextView)findViewById(R.id.header_title);

        cmdAddBahanBakar = (FloatingActionButton)findViewById(R.id.cmd_add_bahan_bakar);
        loadToolbar();

        cmdAddBahanBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            startActivity(new Intent(ActivityBahanBakarList.this, ActivityBahanBakarAdd.class));
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
        headerTitle.setText("Bahan Bakar");

        headerImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }

}

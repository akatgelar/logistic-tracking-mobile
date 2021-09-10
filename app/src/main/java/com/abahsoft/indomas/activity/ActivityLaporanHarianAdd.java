package com.abahsoft.indomas.activity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
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

public class ActivityLaporanHarianAdd extends AppCompatActivity{



    private ImageView headerImage;
    private TextView headerTitle;
    private EditText txtTanggal;
    private EditText txtWaktu;
    private TextInputLayout cmdTanggal;
    private TextInputLayout cmdWaktu;

    int mYear;
    int mMonth;
    int mDay;
    int mHour;
    int mMinute;

    Calendar myCalendar;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahan_bakar_add);

        headerImage = (ImageView)findViewById(R.id.header_image);
        headerTitle = (TextView)findViewById(R.id.header_title);
        txtTanggal = (EditText)findViewById(R.id.txt_tanggal);
        txtWaktu = (EditText)findViewById(R.id.txt_waktu);
        cmdTanggal = (TextInputLayout)findViewById(R.id.cmd_tanggal);
        cmdWaktu = (TextInputLayout)findViewById(R.id.cmd_waktu);
        myCalendar = Calendar.getInstance();

        loadToolbar();




        txtTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get Current Date
                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(ActivityLaporanHarianAdd.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,int monthOfYear, int dayOfMonth) {
                                String dateString = dayOfMonth + "-" + (monthOfYear+1) + "-" + year;
                                String myFormat = "dd-MM-yyyy"; //In which you need put here
                                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                                txtTanggal.setText(dateString);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });


        txtWaktu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get Current Time
                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(ActivityLaporanHarianAdd.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,int minute) {
                                String dateString = hourOfDay + ":" + minute;
                                String myFormat = "hh:mm"; //In which you need put here
                                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                                txtWaktu.setText(dateString);
                            }
                        }, mHour, mMinute, true);
                timePickerDialog.show();
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

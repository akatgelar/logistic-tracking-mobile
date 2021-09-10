package com.abahsoft.indomas.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.abahsoft.indomas.R;

public class ActivityHome extends AppCompatActivity{


    private LinearLayout menuProfil;
    private LinearLayout menuPeta;
    private LinearLayout menuBahanBakar;
    private LinearLayout menuPekerjaan;
    private LinearLayout menuLaporanHarian;
    private LinearLayout menuSukuCadang;
    private LinearLayout menuService;
    private LinearLayout menuLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        menuProfil = (LinearLayout) findViewById(R.id.menu_profil);
        menuPeta = (LinearLayout) findViewById(R.id.menu_peta);
        menuBahanBakar = (LinearLayout) findViewById(R.id.menu_bahan_bakar);
        menuPekerjaan = (LinearLayout) findViewById(R.id.menu_pekerjaan);
        menuLaporanHarian = (LinearLayout) findViewById(R.id.menu_laporan_harian);
        menuSukuCadang = (LinearLayout) findViewById(R.id.menu_suku_cadang);
        menuService = (LinearLayout) findViewById(R.id.menu_service);
        menuLogout = (LinearLayout) findViewById(R.id.menu_logout);

        loadToolbar();
        loadMenu();

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


    }

    private void loadMenu() {

        menuProfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, ActivityProfil.class));
            }
        });

        menuPeta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, ActivityPeta.class));
            }
        });

        menuBahanBakar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, ActivityBahanBakarList.class));
            }
        });

        menuPekerjaan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, ActivityPekerjaanList.class));
            }
        });

    }

}

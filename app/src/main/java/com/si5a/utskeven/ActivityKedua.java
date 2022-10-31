package com.si5a.utskeven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {
    TextView tvNama;
    TextView tvNomorPendaftaran;
    TextView tvJalurPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        getSupportActionBar().setTitle("UTS Keven");

        tvNama = findViewById(R.id.tv_tampil_nama_lengkap);
        tvNomorPendaftaran = findViewById(R.id.tv_tampil_nomor_pendaftaran);
        tvJalurPendaftaran = findViewById(R.id.tv_tampil_jalur_pendaftaran);

        Intent terima = getIntent();
        String xNama = terima.getStringExtra("xNama");
        String xNomorPendaftaran = terima.getStringExtra("xNomorPendaftaran");
        String xJalurPendaftaran = terima.getStringExtra("xJalurPendaftaran");
        tvNama.setText(xNama);
        tvNomorPendaftaran.setText(xNomorPendaftaran);
        tvJalurPendaftaran.setText(xJalurPendaftaran);

    }
}
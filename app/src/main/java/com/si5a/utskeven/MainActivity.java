package com.si5a.utskeven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText etNamaLengkap;
    EditText etNomorPendaftaran;
    Spinner spJalurPendaftaran;
    CheckBox cbKonfirmasiDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS Keven");

        btnDaftar = findViewById(R.id.btn_daftar);
        etNamaLengkap = findViewById(R.id.et_nama);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        spJalurPendaftaran = findViewById(R.id.sp_jalur_pendaftaran);
        cbKonfirmasiDaftar = findViewById(R.id.cb_konfirmasi_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaLengkap = etNamaLengkap.getText().toString();
                String nomorPendaftaran = etNomorPendaftaran.getText().toString();
                String jalurPendaftaran = spJalurPendaftaran.getSelectedItem().toString();
                Boolean konfirmasiDaftar = cbKonfirmasiDaftar.isChecked();

                if (namaLengkap.trim().equals("")){
                    etNamaLengkap.setError("Nama Harus Diisi!");
                }
                else if (nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Harus Diisi!");
                }
                else if (jalurPendaftaran.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih Jalur Pendaftaran!", Toast.LENGTH_SHORT).show();
                }
                else if (konfirmasiDaftar == Boolean.FALSE){
                    Toast.makeText(MainActivity.this, "Ceklist Konfirmasi Daftar!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent pindah = new Intent(MainActivity.this, ActivityKedua.class);
                    pindah.putExtra("xNama", namaLengkap);
                    pindah.putExtra("xNomorPendaftaran", nomorPendaftaran);
                    pindah.putExtra("xJalurPendaftaran", jalurPendaftaran);
                    startActivity(pindah);
                }
            }
        });


    }
}
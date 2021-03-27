package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView txtnis,txtnama,txtkelas,txtalamat,txtjurusan;
    ApiInterpace apiInterpace;
    DataSiswa DataSiswanya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnama = (TextView) findViewById(R.id.txt_nama);
        txtnis = (TextView) findViewById(R.id.txt_nis);
        txtkelas = (TextView) findViewById(R.id.txt_kelas);
        txtjurusan = (TextView) findViewById(R.id.txt_jurusan);
        txtalamat = (TextView) findViewById(R.id.txt_alamat);
        apiInterpace=apiclient.getApiClient().create(ApiInterpace.class);
        Call<DataSiswa> call=apiInterpace.getSiswa();
        call.enqueue(new Callback<DataSiswa>() {
            @Override
            public void onResponse(Call<DataSiswa> call, Response<DataSiswa> response) {
                DataSiswanya=response.body();
               txtnama.setText(DataSiswanya.getNama());
               txtnis.setText(DataSiswanya.getNis());
               txtkelas.setText(DataSiswanya.getKelas());
               txtjurusan.setText(DataSiswanya.getJurusan());
               txtalamat.setText(DataSiswanya.getAlamat());

            }

            @Override
            public void onFailure(Call<DataSiswa> call, Throwable t) {

            }
        });
    }
}
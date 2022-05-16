package com.example.letseatapps;
// heiii Aditya Catur Putra 30120044 here
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class SubmainPemesananActivity extends AppCompatActivity implements
        View.OnClickListener{
    private EditText namaPemesan;
    private EditText alamatPemesan;
    private TextView totalAyamGoreng;
    private TextView totalChickenWings;
    private CheckBox sambalMerah;
    private CheckBox sambalIjo;
    private CheckBox lalapan;
    private CheckBox nasi;
    private Button selesaiPesan;

    int ayamGoreng = 0;
    int satuanAyamGoreng = 10000;
    int hargaAyamGoreng = 0;
    int chickenWings = 0;
    int satuanChickenWings = 15000;
    int hargaChickenWings = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain_pemesanan);
        findAllViewsId();
        selesaiPesan.setOnClickListener(this);
    }
    private void findAllViewsId() {
        namaPemesan = (EditText) findViewById(R.id.et_nama_pemesan);
        totalAyamGoreng = (TextView)findViewById(R.id.txt_harga_ayam_goreng);
        sambalMerah = (CheckBox)findViewById(R.id.cb_sambal_merah);
        sambalIjo = (CheckBox)findViewById(R.id.cb_sambal_ijo);
        selesaiPesan=(Button)findViewById(R.id.btn_selesaiPesan);
        alamatPemesan = (EditText)findViewById(R.id.et_alamat_pemesan);
        totalChickenWings = (TextView)findViewById(R.id.txt_harga_chicken_wings);
        lalapan = (CheckBox)findViewById(R.id.cb_lalapan);
        nasi = (CheckBox)findViewById(R.id.cb_nasi);
    }
    @Override
    public void onClick(View view){
//        Intent intent = new Intent(SubmainPemesananActivity.this,
//                SubmainHasilPemesananActivity.class);
//        intent.putExtra("nama", namaPemesan.getText().toString());
//        intent.putExtra("ayamGoreng", totalAyamGoreng.getText().toString());
//
//        intent.putExtra("sambalMerah",sambalMerah.isChecked());
//        intent.putExtra("sambalIjo",sambalIjo.isChecked());
//        intent.putExtra("alamat",alamatPemesan.getText().toString());
//        intent.putExtra("chickenWings", totalChickenWings.getText().toString());
//        intent.putExtra("lalapan",lalapan.isChecked());
//        intent.putExtra("nasi",nasi.isChecked());
//        startActivity(intent);
    }
    public void incrementAyamGoreng(View view){
        ayamGoreng = ayamGoreng + 1 ;
        hargaAyamGoreng = ayamGoreng * satuanAyamGoreng;
        displayAyamGoreng(ayamGoreng);
        displayHargaAyamGoreng(hargaAyamGoreng);
    }
    public void decrementAyamGoreng(View view){
        if(ayamGoreng < 1){
            Toast.makeText(this, "Maaf, Anda tidak bisa memesan kurang dari 0",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        ayamGoreng = ayamGoreng - 1;
        hargaAyamGoreng = ayamGoreng * satuanAyamGoreng;
        displayAyamGoreng(ayamGoreng);
        displayHargaAyamGoreng(hargaAyamGoreng);
    }
    private void displayAyamGoreng(int number){
        TextView txtAyamGoreng = (TextView)findViewById(R.id.txt_jumlah_ayam);
        txtAyamGoreng.setText(""+number);
    }
    private void displayHargaAyamGoreng(int number){
        TextView txtHargaAyamGoreng =
                (TextView)findViewById(R.id.txt_harga_ayam_goreng);

        txtHargaAyamGoreng.setText(""+number);
    }
    public void incrementChickenWings(View view){
        chickenWings = chickenWings + 1 ;
        hargaChickenWings = chickenWings * satuanChickenWings;
        displayChickenWings(chickenWings);
        displayHargaChickenWings(hargaChickenWings);
    }
    public void decrementChickenWings(View view){
        if(chickenWings < 1){
            Toast.makeText(this, "Maaf, Anda tidak bisa memesan kurang dari 0",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        chickenWings = chickenWings - 1;
        hargaChickenWings = chickenWings * satuanChickenWings;
        displayChickenWings(chickenWings);
        displayHargaChickenWings(hargaChickenWings);
    }
    private void displayChickenWings(int number){
        TextView txtChickenWings = (TextView)findViewById(R.id.txt_jumlah_chicken);
        txtChickenWings.setText(""+number);
    }
    private void displayHargaChickenWings(int number){
        TextView txtHargaChickenWings =
                (TextView)findViewById(R.id.txt_harga_chicken_wings);
        txtHargaChickenWings.setText(""+number);
    }
}
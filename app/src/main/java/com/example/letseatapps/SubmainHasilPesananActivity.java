package com.example.letseatapps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
public class SubmainHasilPesananActivity extends AppCompatActivity {
    private Button kirimPesanan;
    private CheckBox setujuPesan;
    TextView namaPemesan ;
    TextView alamatPemesan ;
    TextView totalAyamGoreng ;
    TextView totalChickenWings;
    TextView sambalMerah;
    TextView sambalIjo;
    TextView lalapan;
    TextView nasi;
    TextView totalPembayaran;
    String namaEmail = "";
    String alamatEmail = "";
    String hargaAyamEmail = "";
    String hargaChickenEmail = "";
    String hargaSblMerahEmail = "";
    String hargaSblIjoEmail = "";
    String hargaLalapanEmail = "";
    String hargaNasiEmail = "";
    String totalPembayaranEmail = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain_hasil_pesanan);
        Intent intent = getIntent();
        namaPemesan = (TextView)findViewById(R.id.txt_nama_pemesan);
        alamatPemesan = (TextView)findViewById(R.id.txt_alamat_pemesan);
        totalAyamGoreng = (TextView)findViewById(R.id.txt_ayam_goreng);
        totalChickenWings=(TextView)findViewById(R.id.txt_chicken_wings);
        sambalMerah = (TextView)findViewById(R.id.txt_sambal_merah);
        sambalIjo = (TextView)findViewById(R.id.txt_sambal_ijo);
        lalapan = (TextView)findViewById(R.id.txt_lalapan);
        nasi = (TextView)findViewById(R.id.txt_nasi);
        namaPemesan.setText(intent.getExtras().getString("nama"));
        alamatPemesan.setText(intent.getExtras().getString("alamat"));
        totalAyamGoreng.setText(intent.getExtras().getString("ayamGoreng"));
        totalChickenWings.setText(intent.getExtras().getString("chickenWings"));
        sambalMerah.setText(intent.getExtras().getString("sambalMerah"));
        sambalIjo.setText(intent.getExtras().getString("sambalIjo"));
        lalapan.setText(intent.getExtras().getString("lalapan"));
        nasi.setText(intent.getExtras().getString("nasi"));
        Boolean trueSambalMerah = getIntent().getExtras().getBoolean("sambalMerah");
        Boolean trueSambalijo = getIntent().getExtras().getBoolean("sambalIjo");
        Boolean trueLalapan = getIntent().getExtras().getBoolean("lalapan");
        Boolean trueNasi = getIntent().getExtras().getBoolean("nasi");
        if(trueSambalMerah){
            sambalMerah.setText("3000");
        }else {
            sambalMerah.setText("0");
        }
        if(trueSambalijo){
            sambalIjo.setText("3000");
        }else {
            sambalIjo.setText("0");
        }
        if(trueLalapan){
            lalapan.setText("2000");
        }else {
            lalapan.setText("0");
        }
        if(trueNasi){
            nasi.setText("4000");
        }else {
            nasi.setText("0");
        }
        String stringAyamGoreng = totalAyamGoreng.getText().toString();
        int intAyamGoreng = Integer.parseInt(stringAyamGoreng);
        String stringChickenWings = totalChickenWings.getText().toString();
        int intChickenWings = Integer.parseInt(stringChickenWings);
        String stringSambalMerah = sambalMerah.getText().toString();
        int intSambalMerah = Integer.parseInt(stringSambalMerah);
        String stringSambalIjo = sambalIjo.getText().toString();
        int intSambalIjo = Integer.parseInt(stringSambalIjo);

        String stringLalapan = lalapan.getText().toString();
        int intLalapan = Integer.parseInt(stringLalapan);
        String stringNasi = nasi.getText().toString();
        int intNasi = Integer.parseInt(stringNasi);
        int total = intAyamGoreng + intChickenWings + intSambalMerah + intSambalIjo +
                intLalapan + intNasi;
        totalPembayaran = (TextView)findViewById(R.id.txt_total_pembayaran);
        totalPembayaran.setText(total+"");
        kirimPesanan = (Button)findViewById(R.id.btn_kirimPesanan);
    }
    public String getNamaEmail(){
        TextView namaEmail = (TextView)findViewById(R.id.txt_nama_pemesan);
        String nama = namaEmail.getText().toString();
        return nama;
    }
    public String getAlamatEmail(){
        TextView alamatEmail = (TextView)findViewById(R.id.txt_alamat_pemesan);
        String alamat = alamatEmail.getText().toString();
        return alamat;
    }
    public String getHargaAyamEmail(){
        TextView hargaAyamEmail = (TextView)findViewById(R.id.txt_ayam_goreng);
        String hargaAyam = String.valueOf(hargaAyamEmail);
        return hargaAyam;
    }
    public String getHargaChickenEmail(){
        TextView hargaChickenEmail = (TextView)findViewById(R.id.txt_chicken_wings);
        String hargaChicken = String.valueOf(hargaChickenEmail);
        return hargaChicken;
    }
    public String getHargaSblMerahEmail(){
        TextView hargaSblMerahEmail = (TextView)findViewById(R.id.txt_sambal_merah);
        String hargaSblMerah = String.valueOf(hargaSblMerahEmail);
        return hargaSblMerah;
    }
    public String getHargaSblIjoEmail(){
        TextView hargaSblIjoEmail = (TextView)findViewById(R.id.txt_sambal_ijo);
        String hargaSblIjo = String.valueOf(hargaSblIjoEmail);
        return hargaSblIjo;
    }

    public String getHargaLalapanEmail(){
        TextView hargaLalapanEmail = (TextView)findViewById(R.id.txt_lalapan);
        String hargaLalapan = String.valueOf(hargaLalapanEmail);
        return hargaLalapan;
    }
    public String getHargaNasiEmail(){
        TextView hargaNasiEmail = (TextView)findViewById(R.id.txt_nasi);
        String hargaNasi = String.valueOf(hargaNasiEmail);
        return hargaNasi;
    }
    public String getTotalPembayaranEmail(){
        TextView totalPembayaranEmail =
                (TextView)findViewById(R.id.txt_total_pembayaran);
        String totalPembayaran = String.valueOf(totalPembayaranEmail);
        return totalPembayaran;
    }
    public void onClick(View v) {
        setujuPesan = (CheckBox)findViewById(R.id.cb_setuju_pesan);
        namaEmail = namaPemesan.getText().toString();
        alamatEmail = alamatPemesan.getText().toString();
        hargaAyamEmail = totalAyamGoreng.getText().toString();
        hargaChickenEmail = totalChickenWings.getText().toString();
        hargaSblMerahEmail = sambalMerah.getText().toString();
        hargaSblIjoEmail = sambalIjo.getText().toString();
        hargaLalapanEmail = lalapan.getText().toString();
        hargaNasiEmail = nasi.getText().toString();
        totalPembayaranEmail = totalPembayaran.getText().toString();
        String pesanan = String.format("Nama Pemesan : %s" +
                        "\nAlamat Pemesan : %s" +
                        "\nAyam Goreng Original : %s" +
                        "\nChicken Wings : %s" +
                        "\nSambah Merah : %s" +
                        "\nSambal Ijo : %s" +
                        "\nLalapan : %s" +
                        "\nNasi : %s" +
                        "\n\nTotal Pembayaran : %s" +
                        "\n",
                namaEmail,
                alamatEmail,
                hargaAyamEmail,
                hargaChickenEmail,
                hargaSblMerahEmail,
                hargaSblIjoEmail,
                hargaLalapanEmail,
                hargaNasiEmail,
                totalPembayaranEmail);
        if(setujuPesan.isChecked()){
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:nadiafirly@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Order Food dari : " + namaEmail);
            intent.putExtra(Intent.EXTRA_TEXT, pesanan);
            startActivity(Intent.createChooser(intent, "Send Email"));
        }else{
            Toast.makeText(this, "Silahkan chekclist \"Pesanan sudah benar\" untuk melanjutkan pengiriman email", Toast.LENGTH_SHORT).show();
        }
    }
}
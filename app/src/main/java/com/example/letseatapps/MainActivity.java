package com.example.letseatapps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.example.letseatapps.R;
import com.example.letseatapps.SubmainPemesananActivity;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Button pesanEmail;
    private Button pesanPhone;
    //Slide ViewFlipper
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesanEmail = (Button) findViewById(R.id.btn_pesan_email);
        pesanEmail.setOnClickListener(this);
        pesanPhone = (Button) findViewById(R.id.btn_pesan_phone);
        pesanPhone.setOnClickListener(this);
//ViewFlipper
        int images[] = {R.drawable.menu_1, R.drawable.menu_2,
                R.drawable.menu_3, R.drawable.menu_4};
        v_flipper = findViewById(R.id.v_flipper);
        for (int image : images) {
            flipperImages(image);
        }
    }
    //Method Flipper
    private void flipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000); //3 scn
        v_flipper.setAutoStart(true);
//animationn
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pesan_email:
                Intent moveIntent = new Intent(MainActivity.this,
                        SubmainPemesananActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_pesan_phone:

                String phoneNumber = "08567018242";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}

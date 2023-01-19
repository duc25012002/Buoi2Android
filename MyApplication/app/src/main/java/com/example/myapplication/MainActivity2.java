package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView txt_man_hinh_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "Đây là màn hình 2", Toast.LENGTH_SHORT).show();

        //anh xa
        txt_man_hinh_2 = findViewById(R.id.txt_man_hinh_2);


        //nhan du lieu sang man hinh 2
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle!= null) {//kiem tra xem trong bundle co du lieu khong

            //tao bien de nhan du lieu tu man hinh 1
            String duLieuNhan = bundle.getString("key_1", "Sai dia chi");//key phai trung voi key gui du lieu ben man hinh 2
            txt_man_hinh_2.setText(duLieuNhan);//truyen du lieu vao textview ben man hinh 2
        }
    }
}
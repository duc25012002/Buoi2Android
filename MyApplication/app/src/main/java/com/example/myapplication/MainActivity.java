package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khai bao bien
    TextView txt;
    Button btn_nut_an;
    EditText edt_nhap_du_lieu;

    RadioButton radio_lua_chon_1, radio_lua_chon_2, radio_lua_chon_3;
    String luaChon;

    String luaChonCheckBox;

    CheckBox chk_lua_chon_1, chk_lua_chon_2, chk_lua_chon_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        suKienSuKien();

    }

    private void suKienSuKien() {

        //thao tac cua nut an
        btn_nut_an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luaChonCheckBox = "";
                if (radio_lua_chon_1.isChecked()) {
                    luaChon = "Lua chon 1";
                }
                if (radio_lua_chon_2.isChecked()) {
                    luaChon = "Lua chon 2";
                }
                if (radio_lua_chon_3.isChecked()) {
                    luaChon = "Lua chon 3";
                }


                //kiem tra check box
                if (chk_lua_chon_1.isChecked()) {
                    luaChonCheckBox = luaChonCheckBox + "Lua chon 1";
                }
                if (chk_lua_chon_2.isChecked()) {
                    luaChonCheckBox = luaChonCheckBox + "Lua chon 2";
                }
                if (chk_lua_chon_3.isChecked()) {
                    luaChonCheckBox = luaChonCheckBox + "Lua chon 3";
                }


                //tao bien de gui du lieu sang man hinh 2
                String bienGuiduLieu = edt_nhap_du_lieu.getText().toString() + " " + luaChonCheckBox;//chinh sua noi dung trong TextView


                //gui du lieu sang man hinh khac
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("key_1", bienGuiduLieu);//ten khoa de gui du lieu sang man hinh 2 (key_1)
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }

    private void anhXa() {
        //anh Xa den id mong muon
        txt = findViewById(R.id.txt_ten);
        btn_nut_an = findViewById(R.id.btn_nut_an);
        edt_nhap_du_lieu = findViewById(R.id.edt_nhap_du_lieu);


        radio_lua_chon_1 = findViewById(R.id.radio_lua_chon_1);
        radio_lua_chon_2 = findViewById(R.id.radio_lua_chon_2);
        radio_lua_chon_3 = findViewById(R.id.radio_lua_chon_3);


        chk_lua_chon_1 = findViewById(R.id.chk_lua_chon_1);
        chk_lua_chon_2 = findViewById(R.id.chk_lua_chon_2);
        chk_lua_chon_3 = findViewById(R.id.chk_lua_chon_3);
    }
}
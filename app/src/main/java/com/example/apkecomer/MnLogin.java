package com.example.apkecomer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.controlador.DLogin;

public class MnLogin extends AppCompatActivity {
    private EditText txtusu, txtpas;
    private DLogin obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mn_login);

        txtusu = (EditText)findViewById(R.id.FrmLog_txtusu);
        txtpas = (EditText)findViewById(R.id.FrmLog_txtpas);
        obj=new DLogin(this);
    }

    public void OnClick_BtnAcep(View v){
        String usu=txtusu.getText().toString();
        String pas=txtpas.getText().toString();
        try {
            obj.getValidar(usu,pas);
        } catch (Exception e) {e.printStackTrace();}
        //startActivity(new Intent(MnLogin.this, MnMenu.class));
    }
}
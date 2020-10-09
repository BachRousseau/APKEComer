package com.example.apkecomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.modelo.Producto;
import com.example.util.ADPProducto;

public class MnListproducto extends AppCompatActivity {
    private ADPProducto adp;
    private GridView datagrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mn_listproducto);

        datagrid = (GridView) findViewById(R.id.FrmLProd_DataGrid);

        adp=new ADPProducto(this);
        for(int i=0;i<100;i++) {
            adp.getAdd(new Producto
                    (1,
                            "Celular",
                            560,
                            10,
                            "M00"+i,
                            "CT001",
                            3,
                            "",
                            ""));
        }
        datagrid.setAdapter(adp);
    }


}
package com.example.controlador;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.apkecomer.MnLogin;
import com.example.apkecomer.MnMenu;
import com.example.modelo.Login;
import com.example.util.Message;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class DLogin implements IDao<Login> {
    private AsyncHttpClient asyn=new AsyncHttpClient();
    private List<Login> array=new ArrayList<>();
    private String url="http://192.168.1.7:8090/PHPEComer/Servicio/SLogin.php";
    private Message ms;
    private Context ct;

    public DLogin(Context c){   //Constructor
        this.ct = c;
        this.ms = new Message(c);
    }

    public void getValidar(String usu,String pas)throws Exception{
        RequestParams params=new RequestParams();
        params.add("frm","valc");
        params.add("txtcor",usu);
        params.add("txtpas",pas);
        asyn.get(url, params, new AsyncHttpResponseHandler() {
            @Override
            public void onStart() {
                super.onStart();
                ms.MProgressBarDato();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    ms.MCloseProgressBarDato(true);
                    String resp=new String(responseBody);   //Valores JSON
                    JSONObject json=new JSONObject(resp);
                    try{
                        if(json.getString("Success").equals("Carrito.php"))
                            ct.startActivity(new Intent(ct, MnMenu.class));
                    }catch (JSONException e)
                    {Toast.makeText(ct,"Error:"+json.getString("Error"),Toast.LENGTH_LONG).show(); }

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(ct,"Error JSONExcep.:"+e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                ms.MCloseProgressBarDato(true);
                Toast.makeText(ct,"Mensaje:"+error,Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void getList(Object bus) throws Exception {
    }

    @Override
    public void getAdd(Login obj) throws Exception {

    }

    @Override
    public void getUp(Login obj) throws Exception {

    }

    @Override
    public void getDel(Object cod) throws Exception {

    }

    @Override
    public Login getItem(int f) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}

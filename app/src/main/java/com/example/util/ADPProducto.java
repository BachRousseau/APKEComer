package com.example.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.apkecomer.R;
import com.example.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class ADPProducto extends BaseAdapter{
    private List<Producto> array=new ArrayList<>();
    private Context ct;

    public ADPProducto(Context c) {
        this.ct = c;
    }

    public ADPProducto(Context c, List lst){
        this.ct = c;
        this.array = lst;
    }

    public void getAdd(Producto obj){
        array.add(obj);
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Producto getItem(int position) {
        return array.get(position);
    }

    @Override
    public long getItemId(int position) {
        return array.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista= convertView;
        if(vista==null){
            LayoutInflater inflater=(LayoutInflater)ct.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            vista = inflater.inflate(R.layout.conf_listproducto ,parent,false);
        }

        ImageView img = (ImageView) vista.findViewById(R.id.FrmConfLProd_img);
        TextView lblmar = (TextView) vista.findViewById(R.id.FrmConfLProd_Lblmar);
        TextView lblnom = (TextView) vista.findViewById(R.id.FrmConfLProd_Lblnom);
        RatingBar rking = (RatingBar) vista.findViewById(R.id.FrmConfLProd_Rkpro);
        TextView lblpre = (TextView) vista.findViewById(R.id.FrmConfLProd_Lblpre);

        Producto obj=getItem(position);
        String mar=obj.getCodmar();
        String nom=obj.getNomprod();
        int rank = obj.getRankprod();
        double pre = obj.getPreprod();

        lblmar.setText(""+mar);
        lblnom.setText(""+nom);
        rking.setRating(rank);
        lblpre.setText(""+pre);

        return vista;
    }
}

package com.example.modelo;

public class Producto {
    private int codprod;
    private String nomprod;
    private double preprod;
    private int stockprod;
    private String codmar;
    private String codcat;
    private int rankprod;
    private String carprod;
    private String imgprod;

    public Producto() {
    }

    public Producto(int codprod, String nomprod, double preprod, int stockprod, String codmar, String codcat, int rankprod, String carprod, String imgprod) {
        this.codprod = codprod;
        this.nomprod = nomprod;
        this.preprod = preprod;
        this.stockprod = stockprod;
        this.codmar = codmar;
        this.codcat = codcat;
        this.rankprod = rankprod;
        this.carprod = carprod;
        this.imgprod = imgprod;
    }

    public int getCodprod() {
        return codprod;
    }

    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

    public double getPreprod() {
        return preprod;
    }

    public void setPreprod(double preprod) {
        this.preprod = preprod;
    }

    public int getStockprod() {
        return stockprod;
    }

    public void setStockprod(int stockprod) {
        this.stockprod = stockprod;
    }

    public String getCodmar() {
        return codmar;
    }

    public void setCodmar(String codmar) {
        this.codmar = codmar;
    }

    public String getCodcat() {
        return codcat;
    }

    public void setCodcat(String codcat) {
        this.codcat = codcat;
    }

    public int getRankprod() {
        return rankprod;
    }

    public void setRankprod(int rankprod) {
        this.rankprod = rankprod;
    }

    public String getCarprod() {
        return carprod;
    }

    public void setCarprod(String carprod) {
        this.carprod = carprod;
    }

    public String getImgprod() {
        return imgprod;
    }

    public void setImgprod(String imgprod) {
        this.imgprod = imgprod;
    }
}

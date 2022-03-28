package com.example.myapplication.lab6b;

public class Shoes {
    private String nameShoes;
    private String desShoes;
    private double priceShoes;
    private int imageShoes;

    public String getNameShoes() {
        return nameShoes;
    }

    public void setNameShoes(String nameShoes) {
        this.nameShoes = nameShoes;
    }

    public String getDesShoes() {
        return desShoes;
    }

    public void setDesShoes(String desShoes) {
        this.desShoes = desShoes;
    }

    public double getPriceShoes() {
        return priceShoes;
    }

    public void setPriceShoes(double priceShoes) {
        this.priceShoes = priceShoes;
    }

    public int getImageShoes() {
        return imageShoes;
    }

    public void setImageShoes(int imageShoes) {
        this.imageShoes = imageShoes;
    }

    public Shoes() {
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "nameShoes='" + nameShoes + '\'' +
                ", desShoes='" + desShoes + '\'' +
                ", priceShoes=" + priceShoes +
                ", imageShoes=" + imageShoes +
                '}';
    }

    public Shoes(String nameShoes, String desShoes, double priceShoes, int imageShoes) {
        this.nameShoes = nameShoes;
        this.desShoes = desShoes;
        this.priceShoes = priceShoes;
        this.imageShoes = imageShoes;
    }
}

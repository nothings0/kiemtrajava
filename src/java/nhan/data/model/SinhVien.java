/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhan.data.model;

/**
 *
 * @author pv
 */
public class SinhVien {
    int id, tuoi;
    String ten;
    float dtd;

    public SinhVien(int id, String ten, int tuoi, float dtd) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.dtd = dtd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDtd() {
        return dtd;
    }

    public void setDtd(float dtd) {
        this.dtd = dtd;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhan.data.dao;

import nhan.data.model.SinhVien;

/**
 *
 * @author pv
 */
public interface SinhVienDao {
    public SinhVien findSInhVien(String name);
    public void insertSInhVien(String name, int tuoi, float dtd);
}

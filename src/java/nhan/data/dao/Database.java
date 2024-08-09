/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhan.data.dao;

import nhan.data.impl.SinhVienImpl;

/**
 *
 * @author pv
 */
public class Database {
     public static SinhVienDao getSinhVienDAO() {
        return new SinhVienImpl();
    }
}

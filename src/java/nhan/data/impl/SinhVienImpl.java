/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhan.data.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import nhan.data.dao.SinhVienDao;
import nhan.data.driver.MysqlDriver;
import nhan.data.model.SinhVien;
/**
 *
 * @author pv
 */
public class SinhVienImpl implements SinhVienDao{

    Connection conn = MysqlDriver.getConnection();

    @Override
    public void insertSInhVien(String name, int tuoi, float dtd) {
        String sql = "INSERT INTO SinhVien (ten, tuoi, dtb) VALUES (?, ?, ?)";
        
        try{
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, name);
            sttm.setInt(2, tuoi);
            sttm.setFloat(3, dtd);
            sttm.execute();
        }catch(SQLException e){
        }
    }

    @Override
    public SinhVien findSInhVien(String name) {
        SinhVien a = null;
        try {
            String sql = "Select * from SinhVien where ten = ?";
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, name);
            ResultSet rs = sttm.executeQuery();
            if(rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int tuoi = rs.getInt("tuoi");
                float dtb = rs.getFloat("dtb");
                a = new SinhVien(id, ten, tuoi, dtb);
            }
        } catch (SQLException e) {
        }
        return a;
    }
    
}

<%-- 
    Document   : sinhvien
    Created on : Aug 9, 2024, 2:29:07 PM
    Author     : pv
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Sinh Viên</title>
        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                outline: none;
            }
            input{
                padding: 6px 12px;
                border-radius: 8px;
            }
            
            button{
                padding: 6px 12px;
                border-radius: 8px;
                cursor: pointer;
            }
        </style>
    </head>
    <body style="height: 100vh; display: flex; align-items: center; justify-content: center">
        <div style="display: flex; align-items: center; flex-direction: column; gap: 2rem 0">
            <h1 style="text-align: center">Nhập thông tin sinh viên</h1>
            <form action="" method="post" style="padding: 1rem; display: flex; justify-content: space-around; align-items: center; flex-direction: column; gap: 1rem 0; width: 320px; height: 240px; border: 1px solid #ccc">
                <div class="input-box">
                    <label style="margin-right: 8px" for="ten">Tên</label>
                    <input placeholder="Tên" name="ten" id="ten" required>
                    <span style="color: red">${err_ten}</span>
                </div>
                
                <div class="input-box">
                    <label style="margin-right: 8px" for="tuoi">Tuổi</label>
                    <input placeholder="Tuổi" name="tuoi" id="tuoi" required>
                    <span style="color: red">${err_tuoi}</span>
                </div>
                
                <div class="input-box">
                    <label style="margin-right: 8px" for="dtb">Đtb</label>
                    <input placeholder="Điểm trung bình" name="dtb" id="dtb" required>
                    <span style="color: red">${err_dtb}</span>
                </div>
                <p style="color: greenyellow">${success}</p>

                <p style="color: red">${exist_sv}</p>
                <button type="submit">Nhập</button>
            </form>
        </div>
    </body>
</html>

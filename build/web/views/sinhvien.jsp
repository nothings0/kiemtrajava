<%-- 
    Document   : sinhvien
    Created on : Aug 9, 2024, 2:29:07 PM
    Author     : pv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Sinh Viên</title>
        <link rel="stylesheet" href="./css/style.css">
    </head>
    <body>
        <div>
            <h1 class="heading">Nhập thông tin sinh viên</h1>
            <form action="" method="post">
                <div class="input-box">
                    <label>Tên</label>
                    <input placeholder="Tên" name="ten" required>
                    <span style="color: red">${err_ten}</span>
                </div>
                
                <div class="input-box">
                    <label>Tuổi</label>
                    <input placeholder="Tuổi" name="tuoi" required>
                    <span style="color: red">${err_tuoi}</span>
                </div>
                
                <div class="input-box">
                    <label>Đtb</label>
                    <input placeholder="Điểm trung bình" name="dtb" required>
                    <span style="color: red">${err_dtb}</span>
                </div>
                <p style="color: greenyellow">${success}</p>
                <p style="color: red">${exist_sv}</p>
                <button type="submit">Nhập</button>
            </form>
        </div>
    </body>
</html>

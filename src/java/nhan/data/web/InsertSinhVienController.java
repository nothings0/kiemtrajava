/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package nhan.data.web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nhan.data.dao.Database;
import nhan.data.model.SinhVien;

/**
 *
 * @author pv
 */
public class InsertSinhVienController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertSinhVienController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertSinhVienController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("./views/sinhvien.jsp").include(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String err_ten="", err_dtb="", err_tuoi="";
        String ten = request.getParameter("ten");
        int tuoi = Integer.parseInt(request.getParameter("tuoi"));
        float dtb = Float.parseFloat(request.getParameter("dtb"));
        boolean err = false;
        if(ten == null || ten.isEmpty()){
            err_ten="Vui lòng nhập tên";
            request.getSession().setAttribute("err_ten", err_ten);
            err=true;
        }else{
            err_ten="";
            request.getSession().removeAttribute("err_ten");
        }
        
        if(dtb < 0.0 || dtb > 10.0){
            err_dtb="Diem trung binh tu 0 - 10";
            request.getSession().setAttribute("err_dtb", err_dtb);
            err=true;
        }else{
            err_dtb="";
            request.getSession().removeAttribute("err_dtb");
        }
        
        if(tuoi < 0 || tuoi > 100){
            err_tuoi="Tuoi tu 0 - 100";
            request.getSession().setAttribute("err_tuoi", err_tuoi);
            err=true;
        }else{
            err_tuoi="";
            request.getSession().removeAttribute("err_tuoi");
        }
        
        if(err){
            response.sendRedirect("sinh-vien");
        }else{
            if(Database.getSinhVienDAO().findSInhVien(ten)!=null){
                request.getSession().setAttribute("exist_sv", "Sinh vien da ton tai!");
                response.sendRedirect("sinh-vien");
            }else{
                Database.getSinhVienDAO().insertSInhVien(ten, tuoi, dtb);
                request.getSession().setAttribute("success", "Nhập thành công");
                request.getSession().removeAttribute("exist_sv");
                response.sendRedirect("sinh-vien");
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

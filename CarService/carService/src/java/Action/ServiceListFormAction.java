/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import Cars.CarsDaoLocal;
import Services.ServicesDaoLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nishabanur
 */
@WebServlet(name = "ServiceListFormAction", urlPatterns = {"/ServiceListFormAction"})
public class ServiceListFormAction extends HttpServlet {
    
    @EJB
    private CarsDaoLocal carsDao;
    
    @EJB
    private ServicesDaoLocal servicesDao;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        //Cars cars = new Cars();
        //request.setAttribute("allCars", carsDao.getAllCars());
        
        if("BUY CARS".equalsIgnoreCase(action)){
            request.setAttribute("allCars", carsDao.getAllCars());
            request.getRequestDispatcher("Buy.jsp").forward(request, response);
        }
        
        else if("SELL CARS".equalsIgnoreCase(action)){
            String message = "Please enter the details of your car";
            request.setAttribute("message", message);
            request.getRequestDispatcher("Sell.jsp").forward(request, response);
        }
        
        else if("MECHANICAL SERVICES".equalsIgnoreCase(action)){
            request.setAttribute("allServices", servicesDao.getAllServices());
            request.getRequestDispatcher("MechServices.jsp").forward(request, response);
        }
        
        /*List<Cars> cars = carsDao.getAllCars();
            for(Cars c: cars){
                System.out.println(c.getCarID());
                System.out.println(c.getColor());
            }
        
        request.setAttribute("allCars", cars);
        request.getRequestDispatcher("Buy.jsp").forward(request, response);*/

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
        processRequest(request, response);
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
        processRequest(request, response);
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

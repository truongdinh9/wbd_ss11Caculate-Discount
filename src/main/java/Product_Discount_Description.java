import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculateDiscount", urlPatterns = "/CalculateDiscount")
public class Product_Discount_Description extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Double price = Double.parseDouble(req.getParameter("price"));
//        Double discount = Double.parseDouble(req.getParameter("discount"));
//        PrintWriter writer = resp.getWriter();
//        writer.println("Discount Amount: " + price*discount/100);
//        writer.println("Discount Price: " + (price- discount*price/100));


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double price = Double.parseDouble(req.getParameter("price"));
        Double discount = Double.parseDouble(req.getParameter("discount"));
        PrintWriter writer = resp.getWriter();
        writer.println("Discount Amount: " + price*discount/100+"$");
        writer.println("Discount Price: " + (price- discount*price/100)+"$");

    }
}

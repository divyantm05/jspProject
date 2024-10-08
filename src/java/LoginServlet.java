
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/divyan","root","13071977@edm");
            String query="select * from login where username=? and password=?";
            PreparedStatement statement=con.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2,password);
            ResultSet rs=statement.executeQuery();
            if(rs.next()){
                res.sendRedirect("math.jsp");
            }else{
               res.sendRedirect("login.jsp");
            }
        }catch(Exception e){ 
            out.println(e);
        }
    }
    
}

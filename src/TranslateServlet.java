import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@javax.servlet.annotation.WebServlet(name = "TranslateServlet",urlPatterns = "/translate")
public class TranslateServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("Hello","Xin chao");
        dictionary.put("Flower","Hoa");
        dictionary.put("Key","Khoa");

        String search=request.getParameter("txtSearch");

        PrintWriter writer=response.getWriter();
        writer.println("<html>");

        String result=dictionary.get(search);
        if(result!=null){
            writer.println("Word :"+search);
            writer.println("Result :"+result);
        }else {
            writer.println("not found.");
        }
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

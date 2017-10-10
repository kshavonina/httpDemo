import com.mysoft.DAO;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "MyServlet", urlPatterns = "/posts")
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("posts", DAO.getPosts());
        //response.sendRedirect("http://ya.ru");
        request.getRequestDispatcher("WEB-INF/posts.jsp").forward(request, response);
    }
}

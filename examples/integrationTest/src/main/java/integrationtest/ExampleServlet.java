package integrationtest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleServlet extends HttpServlet {

  private static final long serialVersionUID = -6506276378398106663L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try (PrintWriter out = response.getWriter()) {
      out.println("<html><body><div class='greeting'>Hello, integration test!</div>");
      out.println("<p>test message 1</p>");
      out.println("</body></html>");
      out.flush();
    }
  }
}

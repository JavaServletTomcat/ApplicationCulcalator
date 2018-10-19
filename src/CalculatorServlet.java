import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Double firstNumber = Double.parseDouble(request.getParameter("firstNumber"));
        Double secondNumber = Double.parseDouble(request.getParameter("secondNumber"));
        String operator = request.getParameter("operator");

        PrintWriter writer = response.getWriter();

        switch (operator) {
            case "+":
                writer.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case "-":
                writer.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case "*":
                writer.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case "/":
                writer.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                break;
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

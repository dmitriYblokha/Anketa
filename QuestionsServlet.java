package ua.kiev.prog.Anet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet (name = "QuestionsServlet", value = "/questions")
public class QuestionsServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, NullPointerException {
        resp.setContentType("text/html; charset=UTF-8");
        String name = req.getParameter("name");

        PrintWriter pw = resp.getWriter();

        pw.println("<!DOCTYPE html> <html>\n" +
                "<head>\n" +
                "    <title>Questions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1 align=\"center\">Отлично! Вы прошли мини-регистрацию, теперь можете поучаствовать в опросе</h1> <br>\n" +
                "    <form action=\"result\" method=\"get\">\n" +
                "        <P> <label>1. Вы знаете язык программирования Java?</label>\n" +
                "        <input name=\"java\" type=\"radio\" value=\"yes\"> Да\n" +
                "        <input name=\"java\" type=\"radio\" value=\"no\"> Нет </p>\n" +
                "        <p> <label>2. Вы знаете язык программирования Python?</label>\n" +
                "        <input name=\"python\" type=\"radio\" value=\"yes\"> Да\n" +
                "        <input name=\"python\" type=\"radio\" value=\"no\"> Нет </p>\n" +
                "        <p> <label>3. Вы знаете язык программирования C?</label>\n" +
                "        <input name=\"cccc\" type=\"radio\" value=\"yes\"> Да\n" +
                "        <input name=\"cccc\" type=\"radio\" value=\"no\"> Нет </p>\n" +
                "        <input type=\"submit\" value=\"Выбрать\">\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>");


    }
}

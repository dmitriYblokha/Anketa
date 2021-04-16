package ua.kiev.prog.Anet;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet (name = "ResultServlet", value = "/result")
public class ResultServlet extends HttpServlet{

    private AtomicInteger javaY = new AtomicInteger(0);
    private AtomicInteger javaN = new AtomicInteger(0);
    private AtomicInteger pythonY = new AtomicInteger(0);
    private AtomicInteger pythonN = new AtomicInteger(0);
    private AtomicInteger cY = new AtomicInteger(0);
    private AtomicInteger cN = new AtomicInteger(0);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            resp.setContentType("text/html; charset=UTF-8");

            String java = req.getParameter("java");
            String python = req.getParameter("python");
            String cccc = req.getParameter("cccc");


            if (java.equals("yes")) {
                javaY.getAndIncrement();
            }

            if (java.equals("no")) {
                javaN.getAndIncrement();
            }

            if (python.equals("yes")) {
                pythonY.getAndIncrement();
            }

            if (python.equals("no")) {
                pythonN.getAndIncrement();
            }

            if (cccc.equals("yes")) {
                cY.getAndIncrement();
            }

            if (cccc.equals("no")) {
                cN.getAndIncrement();
            }

        }catch (NullPointerException e) {

        }
        PrintWriter out = resp.getWriter();
        out.println("<html>\n" +
                "<head>\n" +
                "    <title>Statistics</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1 align=\"center\">Статистика опроса:</h1> <br>\n" +
                "    <table border=\"2\" align=\"center\">\n" +
                "        <tr>\n" +
                "            <th>    </th>\n" +
                "            <th>Java</th>\n" +
                "            <th>Python</th>\n" +
                "            <th>C</th>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <th>Знают</th>\n" +
                "            <td align=\"center\">" + javaY + "</td>\n" +
                "            <td align=\"center\">" + pythonY + "</td>\n" +
                "            <td align=\"center\">" + cY + "</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <th>Не знают</th>\n" +
                "            <td align=\"center\">" + javaN + "</td>\n" +
                "            <td align=\"center\">" + pythonN + "</td>\n" +
                "            <td align=\"center\">" + cN + "</td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "       <h5 align=\"center\">Пройти опрос снова - <a href=\"http://localhost:8080/Anet_war_exploded/questions?\">клик</a></h5>\n" +
                "</body>\n" +
                "</html>");
    }
}

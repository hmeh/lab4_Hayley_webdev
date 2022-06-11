package Servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Hayley
 */

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       BufferedReader br = new BufferedReader(new FileReader(new File(path)));

       
       String titleP = request.getParameter("edit_title");
       String contentP = request.getParameter("edit_content");
       
        titleP = br.readLine();
        contentP = br.readLine();
        
//        request.setAttribute("title", titleP);
//        request.setAttribute("content", contentP);

        Note newNote = new Note(titleP, contentP);
        request.setAttribute("note", newNote);
        
        
        String url_edit = request.getParameter("edit");
        br.close();
        if(url_edit == null){
            // open edit page
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        
        return;
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to a file
       PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
       
        String titleP = request.getParameter("edit_title");
        String contentP = request.getParameter("edit_content");
        
        pw.println(titleP);
        pw.println(contentP);
        
//        request.setAttribute("title", titleP);
//        request.setAttribute("content", contentP);
        
        Note newNote = new Note(titleP, contentP);
        request.setAttribute("note", newNote);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        pw.close();
        
        return;
        
    }
}

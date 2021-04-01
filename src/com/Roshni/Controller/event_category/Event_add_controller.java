package com.Roshni.Controller.event_category;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.Roshni.DAO.Event_DAO;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.Entity.Events;

/**
 * Servlet implementation class Event_add_controller
 */
@WebServlet("/eventadd_controller")
public class Event_add_controller extends HttpServlet {
	private static final String UPLOAD_DIRECTORY = "WebContent/images/events";
	private static final int THRESHOLD_SIZE     = 1024 * 1024 * 3;  // 3MB
	private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		Events e = new Events();
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(THRESHOLD_SIZE);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setFileSizeMax(MAX_FILE_SIZE);
		upload.setSizeMax(MAX_REQUEST_SIZE);
		
		String realPath = getServletConfig().getServletContext().getRealPath("");
		String uploadPath = realPath.replace("\\build\\web\\wtpwebapps\\EventRegistration\\","\\WebContent\\images\\events" );
		System.err.print(uploadPath);
		
		File uploadDir = new File(uploadPath);
		if(!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		try {
			List formItems = upload.parseRequest(request);
			Iterator i = formItems.iterator();
			while(i.hasNext()) {
				FileItem item = (FileItem)i.next();
				if(!item.isFormField()) {
					String fileName = new File(item.getName()).getName();
					String filepath = uploadPath+File.separator+fileName;
					File storeFile = new File(filepath); 
					
					item.write(storeFile);
					e.setFile_name(fileName);
					
				}else if(item.isFormField()) {
					if(item.getFieldName().equals("description")) {
						e.setDescription(item.getString());
					}else if(item.getFieldName().equals("title")) {
						e.setTitle(item.getString());
					}else if(item.getFieldName().equals("date_time")) {
						e.setDate_time(item.getString());
					}else if(item.getFieldName().equals("cost")) {
					e.setCost(Float.parseFloat(item.getString()));
					}else if(item.getFieldName().equals("event_category_id")) {
						e.setEvent_category_id(Integer.parseInt(item.getString()));
					}
				}
			}
			
			
			}catch (Exception ex) {
				// TODO: handle exception
				System.err.print(ex);
			}
		boolean bool = new Event_DAO(MyConnection.connectTo()).insert(e);
		if(bool=true) {
			response.sendRedirect("admin/events.jsp?status=success");
		}else {
			response.sendRedirect("admin/events.jsp?status=failed");
		}
		
		
	  }

	}
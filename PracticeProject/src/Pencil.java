import com.google.gson.*;
import com.google.gson.stream.JsonWriter;

import java.io.FileWriter; 
import java.io.*;
import java.io.Writer;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption; 

public class Pencil extends Tools{ 
	
	double x, y; //instance variables representing the  
	final private String xcoor = "x-coordinate", ycoor = "y-coordinate"; 
	static Gson gson = new Gson();  
	static BufferedWriter bfWriter; 
	static boolean pen = true, erasure = false;

	
	public Pencil(){  
		x = 0; 
		y = 0;
	} 
	
	public Pencil(double x, double y) { 
		x = this.x; 
		y = this.y;  
		new PracticeCanvas();
	} 
	
	public void toDraw(double x, double y) { 
		System.out.println(x+" "+y);
	}
	
	public void serializeDraw(double x, double y) { 
		try {
			JsonObject jsonObj = new JsonObject(); 
			jsonObj.addProperty(xcoor, x); 
			jsonObj.addProperty(ycoor, y); 
			jsonObj.addProperty("pencil", pen); 
			jsonObj.addProperty("eraser", erasure);
			
			bfWriter = new BufferedWriter(new FileWriter("C:\\Users\\Idorenyin Inyang\\Documents\\file.json", true));  
			String jsonStr = gson.toJson(jsonObj); 
			bfWriter.write(jsonStr); 
			bfWriter.flush();
		} catch(IOException e) { 
			e.printStackTrace();
		}finally {                       // always close the file
			 if (bfWriter != null) try {
				    bfWriter.close();
				 } catch (IOException ioe2) {
				    // just ignore it
			}
		} // end try/catch/finally
	}
}

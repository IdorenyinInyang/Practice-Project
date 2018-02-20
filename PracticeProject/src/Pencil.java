import javafx.event.EventHandler; 


public class Pencil extends Tools{ 
	
	double x, y; //instance variables representing the 
	
	public Pencil(){  
		x = 0; 
		y = 0;
	} 
	
	public Pencil(double x, double y) { 
		x = this.x; 
		y = this.y; 
	} 
	
	public void toDraw(double x, double y) { 
		System.out.println(x+" "+y);
	}
	
	public void serializeDraw(double x, double y) { 
		
	}
}

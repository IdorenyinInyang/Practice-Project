import javafx.event.EventHandler; 


public class Pencil extends Tools{ 
	
	int x, y; //instance variables representing the 
	
	public Pencil(){  
		x = 0; 
		y = 0;
	} 
	
	public Pencil(int x, int y) { 
		x = this.x; 
		y = this.y; 
	}
	
	public void serializeDraw(int x, int y) { 
		
	}
}

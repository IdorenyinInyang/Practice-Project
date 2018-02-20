
public class Tools {
	
	double x, y; //instance variables representing x and y coordinates
	static boolean pen, erasure; // boolean varaibles to represent 

	public Tools() { 
		x = 0; 
		y = 0; //instantiate variables 
		pen = true; 
		erasure = false;
	}
	public Tools(double x, double y) { 
		x = this.x; 
		y = this.y;
	} 
	
	public void serializeDraw(double x, double y) { 
		
	} 
}

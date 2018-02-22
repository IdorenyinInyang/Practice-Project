// this class will host the canvas that will be used by the main application 

import javafx.scene.canvas.*;

public class PracticeCanvas {
	static Canvas backgroundLayer, Layer1, Layer2, Layer3; 
	static boolean bL, l1, l2, l3; 
	static Tools utensil;
	
	public PracticeCanvas() { 
		backgroundLayer = new Canvas(1500, 800); 
		Layer1 = new Canvas(1500, 800); 
		Layer2 = new Canvas(1500, 800); 
		Layer3 = new Canvas(1500, 800);  
		
		bL = true; // boolean value to represent the background layer as the default layer 
		l1 = false; 
		l2 = false; 
		l3 = false;
	}   
	
	public PracticeCanvas(GraphicsContext gcBL, GraphicsContext gcL1, GraphicsContext gcL2, GraphicsContext gcL3) {  
		
		gcBL = backgroundLayer.getGraphicsContext2D();  
		gcL1 = Layer1.getGraphicsContext2D(); 
		gcL2 = Layer2.getGraphicsContext2D(); 
		gcL3 = Layer3.getGraphicsContext2D();
		
	}
	
	private static void createLayer() { 
	    /*gc1 = layer1.getGraphicsContext2D();
	    gc1.setFill(Color.GREEN);
	    gc1.fillOval(50,50,20,20);
	    gc2 = layer2.getGraphicsContext2D();
	    gc2.setFill(Color.BLUE);
	    gc2.fillOval(100,100,20,20); */
	} 
	
	//@param layerName - The name of the layer that will be 
	private static void layerHandler(String layerName, boolean givenLayer) { 
		// will specified layer of canvas specified canvas  
		int givenLayerInt = givenLayer? 1:0;
		switch(givenLayerInt) { 
			case 0: 
				if(layerName.equals("background") && givenLayer == true) { 
					givenLayer = false;
					return;  
				}
			
			case 1: 
				
			default:
				
		}
	} 
	
	private static void Drawing() { 
		
	}
}

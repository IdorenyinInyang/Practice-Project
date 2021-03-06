
import javafx.application.Application;  
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;  
import javafx.scene.canvas.*;
import javafx.scene.Group;
import javafx.scene.Scene;  
import javafx.scene.paint.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;



public final class PracticeClass extends Application{  
	
	private static volatile PracticeClass _instance; 
	
	static Pencil pencil = new Pencil();  
	static StackPane stackP = new StackPane();
	
	public static PracticeClass getInstance() { 
		if(_instance == null) { 
			synchronized(PracticeClass.class) { 
				if(_instance == null ) { 
					_instance = new PracticeClass();
				}
			}
		} 
		return _instance;
	}
	
	public static void main(String[] args) {
		launch(PracticeClass.class);
	}   
	
	
	
	public void start(Stage primaryStage) throws Exception { 
		primaryStage.setTitle("Practice JavaFX Window");  
		//final GraphicsContext gContext = null;
		//new PracticeCanvas(gContext, gContext, gContext, gContext);
		Canvas canvas = new Canvas(1500, 800);   
		
		final GraphicsContext gc = canvas.getGraphicsContext2D();  
		initDraw(gc);

        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, 
                new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                gc.beginPath();
                gc.moveTo(event.getX(), event.getY());
                gc.stroke();
            }
        });

        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, 
                new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                gc.lineTo(event.getX(), event.getY()); 
                gc.stroke();  
                pencil.serializeDraw(event.getX(), event.getY());
                toDrawSerialize(event.getX(), event.getY());
            }
        });

        canvas.addEventHandler(MouseEvent.MOUSE_RELEASED, 
                new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {

            }
        });
        
        stackP.getChildren().add(canvas);
		primaryStage.setScene(new Scene(stackP, 1500, 800)); 
		primaryStage.show(); 
	}  
	
	//@param x  Will be sending the information that is picked up by the graphics content object to the specified Tools class to serialize input 
	public static void toDrawSerialize(double x, double y) { 
		pencil.toDraw(x,y); 
		pencil.serializeDraw(x, y);
	}
	
	public void initDraw(GraphicsContext gc) { 
		double canvasWidth = gc.getCanvas().getWidth();
        double canvasHeight = gc.getCanvas().getHeight();

        gc.setFill(Color.LIGHTGRAY);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);

        gc.fill();
        gc.strokeRect(
                0,              //x of the upper left corner
                0,              //y of the upper left corner
                canvasWidth,    //width of the rectangle
                canvasHeight);  //height of the rectangle

        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);

		
	}
}

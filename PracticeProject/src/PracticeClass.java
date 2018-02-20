
import javafx.application.Application;  
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;  
import javafx.scene.canvas.*;
import javafx.scene.Group;
import javafx.scene.Scene;  
import javafx.scene.paint.*;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;




public class PracticeClass extends Application{ 
	
	public static void main(String[] args) {
		launch(PracticeClass.class);
	}  
	
	
	public void start(Stage primaryStage) throws Exception { 
		primaryStage.setTitle("Practice JavaFX Window");	 
		StackPane stackP = new StackPane();
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
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);

		
	}
}

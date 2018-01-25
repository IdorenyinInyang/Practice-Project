
import javafx.application.Application;  
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;  
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;




public class PracticeClass extends Application{ 
	
	Button button;

	public static void main(String[] args) {
		launch(args);
	} 
	
	public void start(Stage primaryStage) throws Exception { 
		primaryStage.setTitle("Practice JavaFX Window");	
		button = new Button(); //
		button.setText("Click Me!"); // second alternative, you can put title in initial button declaration parameters 
		
		StackPane layout = new StackPane(); 
		layout.getChildren().add(button); 
		
		Scene scene = new Scene(layout, 300, 250); //by default, 
		primaryStage.setScene(scene); 
		primaryStage.show();
	}

}

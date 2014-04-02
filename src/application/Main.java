package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


// Subclass of JavaFX Application.
public class Main extends Application {
	
	// Overrides start using the default stage.
	@Override
	public void start(Stage primaryStage) {
		try {
			// Layout pane.
			BorderPane root = new BorderPane();
			// Set the root layout of the scene.
			Scene scene = new Scene(root,400,400);
			// Default styling of the scene.
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// Set the stage's scene.
			primaryStage.setScene(scene);
			// Show the stage.
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// Main points to Application launch method.
		launch(args);
	}
}


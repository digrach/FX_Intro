package application;
	
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;


// Subclass of JavaFX Application.
public class Main extends Application {
	
	GraphicsContext gc;
	
	// Overrides start using the default stage.
	@Override
	public void start(Stage primaryStage) {
		try {
			
			double sceneWidth = 500;
			double sceneHeight = 500;
			
			double topBottHeight = sceneHeight / 6;
			double middleHeight = sceneHeight - topBottHeight;
			double rightLeftWidth = sceneWidth / 4;
			double middleWidth = sceneWidth - rightLeftWidth;
			
			// Layout pane.
			BorderPane root = new BorderPane();
			
			FlowPane topPane = new FlowPane();	
			topPane.setMinSize(sceneWidth, topBottHeight);
			topPane.setMaxSize(sceneWidth, topBottHeight);
			topPane.setPrefSize(sceneWidth, topBottHeight);
			topPane.setStyle("-fx-background-color: #336699;-fx-border-color: rgb(0, 0, 0);-fx-border-radius: 0;");
			Button btnTop = new Button("top");
			topPane.getChildren().add(btnTop);
			root.setTop(topPane);
			
			FlowPane centerPane = new FlowPane();
			centerPane.setMinSize(middleWidth, middleHeight);
			centerPane.setMaxSize(middleWidth, middleHeight);
			centerPane.setPrefSize(middleWidth, middleHeight);
			centerPane.setStyle("-fx-background-color: #ffffff;-fx-border-color: rgb(0, 0, 0);-fx-border-radius: 0;");
			
//			Canvas canvas = new Canvas();
//			gc = canvas.getGraphicsContext2D();
//			
//			centerPane.getChildren().add(canvas);
			root.setCenter(centerPane);
			
			FlowPane bottomPane = new FlowPane();
			bottomPane.setMinSize(sceneWidth, topBottHeight);
			bottomPane.setMaxSize(sceneWidth, topBottHeight);
			bottomPane.setPrefSize(sceneWidth, topBottHeight);
			bottomPane.setStyle("-fx-background-color: #336699;-fx-border-color: rgb(0, 0, 0);-fx-border-radius: 0;");
			root.setBottom(bottomPane);
			
			FlowPane rightPane = new FlowPane();	
			rightPane.setMinSize(rightLeftWidth,middleHeight);
			rightPane.setMaxSize(rightLeftWidth,middleHeight);
			rightPane.setPrefSize(rightLeftWidth, middleHeight);
			rightPane.setStyle("-fx-background-color: #336699;-fx-border-color: rgb(0, 0, 0);-fx-border-radius: 0;");
			root.setRight(rightPane);
			
			FlowPane leftPane = new FlowPane();	
			leftPane.setMinSize(rightLeftWidth,middleHeight);
			leftPane.setMaxSize(rightLeftWidth, middleHeight);
			leftPane.setPrefSize(rightLeftWidth,middleHeight);
			leftPane.setStyle("-fx-background-color: #336699;-fx-border-color: rgb(0, 0, 0);-fx-border-radius: 0;");
			root.setLeft(leftPane);
			
			
			
			// Set the root layout of the scene.
			Scene scene = new Scene(root,sceneWidth,sceneHeight);
			// Default styling of the scene.
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// Set the stage's scene.
			primaryStage.setScene(scene);
			// Show the stage.
			primaryStage.show();
			
			//doAnimation();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doAnimation() {
		
		AnimationTimer timer = new AnimationTimer() {
			
			double x, y = 0;

			@Override
			public void handle(long arg0) {
				System.out.println("ddd");
				gc.setFill(Color.PINK);
				gc.fillOval(x, y, 10, 10);
				x++;
				y++;
			}
			
		};
		timer.start();
		
	}
	
	public static void main(String[] args) {
		// Main points to Application launch method.
		launch(args);
	}
	
}


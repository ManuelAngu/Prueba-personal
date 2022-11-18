import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

public class Main extends Application {
	
	 @Override
	    public void start(Stage primaryStage) throws Exception{ 
		 Circle circ = new Circle (40, 40, 30);
		 Group root = new Group(circ);
		 Scene scene = new Scene(root,400,300);
		 
		 primaryStage.setTitle("Mi primera aplicacion");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	 }
	public static void main(String[] args) {
			launch(args);
	}

}

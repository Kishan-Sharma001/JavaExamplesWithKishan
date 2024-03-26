
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFx extends Application  {

	public HelloFx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		Button btn = new Button("Click Me");
		
			
		StackPane root = new StackPane();
		Scene scene = new Scene(root,300,300);
		root.getChildren().add(btn);
		
		arg0.setScene(scene);
		arg0.setTitle("java FX -Demo");
		arg0.show();// TODO Auto-generated method stub
		
	}

}

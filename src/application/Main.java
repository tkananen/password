package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	private Stage myStage;
	private AnchorPane passAnchor;
	@Override
	public void start(Stage primaryStage) {
		this.myStage = primaryStage;
		this.myStage.setTitle("Password Checker");
		showpassAnchor();
	}
	
		
	private void showpassAnchor(){
		try{
			FXMLLoader passLoader = new FXMLLoader();
			passLoader.setLocation(Main.class.getResource("passwordxml.fxml"));
			passAnchor = (AnchorPane) passLoader.load();
			
		Scene scene = new Scene(passAnchor);
		myStage.setScene(scene);
		passController passControl = passLoader.getController();
		passControl.setMain(this);
		myStage.show();
		}
		 catch(IOException e){
				e.printStackTrace();
			}
	}
		
	
	public static void main(String[] args) {
		launch(args);
	}
}






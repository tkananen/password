package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class passController extends Main {
	
	@FXML
	private Label passMessage = new Label("Enter the password: ");
	@FXML
	private Button okButton = new Button("OK");
	@FXML
	private Button helpButton = new Button("Help");
	@FXML
	 private Alert helpAlert = new Alert(AlertType.INFORMATION);	

	@FXML
	Alert incorrectAlert = new Alert(AlertType.ERROR);
	@FXML
	Alert correctAlert = new Alert(AlertType.INFORMATION);
	
	@FXML
	private PasswordField passField = new PasswordField();
	private Main main;	
	
	
			@FXML
			public void handleOK(ActionEvent e){
		
			if(passField.getText().toString().equals("bugaboo")){
				correctAlert.setTitle("Confirmation Message");
				correctAlert.setHeaderText("Correct!");				
				correctAlert.setContentText("The password you entered was correct");
				correctAlert.showAndWait();
			}
			else{
				incorrectAlert.setHeaderText("This is an error message");
				incorrectAlert.setHeaderText("ERROR!");
				incorrectAlert.setContentText("The password you entered was incorrect");
				incorrectAlert.showAndWait();
				
			}
			};

			
			@FXML
			public void initialize(){
			}
			

		public void handleHelp(ActionEvent e){
			helpAlert.setContentText("Help was clicked");
			helpAlert.showAndWait();
		}
		public void setMain(Main main){
			 this.main = main;
					 
		}
		
	}


	



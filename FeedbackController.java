package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;



public class FeedbackController {
	@FXML
	private ChoiceBox feeedback_cat;
	@FXML
	private TextArea feedback_txt;
	
	 private Stage stage;
	 private Scene scene;
	 private Parent root;

	// Event Listener on Button.onAction
	@FXML
	public void submit_btn_fnc(ActionEvent event)  throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Main_menu.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void back_btn_fnc(ActionEvent event)  throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Main_menu.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
}

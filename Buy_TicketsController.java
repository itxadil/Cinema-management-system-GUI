package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.DatePicker;

import javafx.scene.control.ChoiceBox;

public class Buy_TicketsController {
	@FXML
	private ChoiceBox movie;
	@FXML
	private ChoiceBox show;
	@FXML
	private DatePicker date;

	 private Stage stage;
	 private Scene scene;
	 private Parent root;

	// Event Listener on Button.onAction
	@FXML
	public void next_btn_fnc(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Buy_Tickets_2.fxml"));
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

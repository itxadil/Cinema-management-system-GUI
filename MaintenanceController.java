package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

public class MaintenanceController {
	@FXML
	private TextField con_floor;
	@FXML
	private TextField con_seats;
	@FXML
	private TextField con_screen;
	@FXML
	private TextField con_screens;
	@FXML
	private TextField con_proj;
	@FXML
	private TextArea con_comments;

	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	
	// Event Listener on Button.onAction
	@FXML
	public void buy_btn_fnc(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Main_menu.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void back_btn_fcn(ActionEvent event)  throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Main_menu.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
}

package application;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;

public class Login_ScreenController {
	
	private Stage stage;
	 private Scene scene;
	 private Parent root;
	
	@FXML
	private TextField login_id;
	@FXML
	private TextField password;

	// Event Listener on Button.onAction
	@FXML
	public void loginfnc(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("/application/Main_menu.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
}

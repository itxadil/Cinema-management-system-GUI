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
import javafx.scene.control.ChoiceBox;

public class stock_refreshments2Controller {
	@FXML
	private TextField quantity;
	@FXML
	private ChoiceBox vendors;
	@FXML
	private TextField bill;
	@FXML
	private TextField price;

	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	
	// Event Listener on Button.onAction
	@FXML
	public void place_order_fnc(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Main_menu.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
}

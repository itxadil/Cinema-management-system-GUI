package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;

public class Buy_Tickets_2Controller {
	@FXML
	private AnchorPane price;
	@FXML
	private TextField Customer_cnic;
	@FXML
	private TextField customer_name;
	@FXML
	private TextField customer_email;
	@FXML
	private TextField customer_contact;
	@FXML
	private TextField ticket_price;
	@FXML
	private RadioButton cash;
	@FXML
	private RadioButton card;

	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	
	// Event Listener on Button.onAction
	@FXML
	public void buy_ticket(ActionEvent event) throws IOException {

	}
	// Event Listener on Button.onAction
	@FXML
	public void back_btn_fnc(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Buy_Tickets.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
}

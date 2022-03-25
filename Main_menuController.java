package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class Main_menuController {

	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	
	// Event Listener on Button.onAction
	@FXML
	public void buy_tickets(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Buy_tickets.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void store_belongings(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Belongings.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void purchase_food(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/purchase_food.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void stock_refreshments(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/stock_refershments.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void start_show(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Start_show.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void maintainance(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Maintenance.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void schedule_movie(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Schedule_Movie.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void purchase_movie(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/purchase_movie.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void feedback(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/purchase_movie.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void log_out(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Login_Screen.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
}

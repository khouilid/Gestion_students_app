package Views;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Main extends Application  {

	@Override
	public void start(Stage primaryStage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));

			primaryStage.setTitle("Gestion des élèves");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}


	}

//	public void getspeWindow(MouseEvent mouseEvent) {
//		Stage stage = new Stage();
//		try {
//			Parent root = FXMLLoader.load(getClass().getResource("specialiste.fxml"));
//
//			stage.setTitle("Gestion des élèves");
//			stage.setScene(new Scene(root));
//			stage.show();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
}

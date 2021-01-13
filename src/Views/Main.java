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
import javafx.stage.Stage;


public class Main extends Application  {

	@Override
	public void start(Stage primaryStage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("specialiste.fxml"));

			primaryStage.setTitle("Gestion des élèves");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}


	}

}

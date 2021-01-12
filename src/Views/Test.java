package Views;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Test extends Application  {


	@Override
	public void start(Stage primaryStage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Module.fxml"));

			primaryStage.setTitle("hi!!");
			primaryStage.setScene(new Scene(root, 800, 600));
			primaryStage.show();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}

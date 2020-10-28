package ConfigurationPart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import toast.MyDialoug;
import toast.Openscreen;
import toast.Toast;
import application.DataStore;
import application.Main;
import application.MainancController;
import application.SerialWriter;
import application.writeFormat;
import extrafont.Myfont;

public class defaultsettingpopupController implements Initializable {

	@FXML
	AnchorPane root;

	@FXML
	private Button btnyes;

	@FXML
	private Button btncancel;

	Myfont f = new Myfont(22);
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		/*
		Default Popup Screen. 
		Default Setting Apply Button Event Yes or No.
		Set Label cssclass.
		*/
	
		/*Default Popup close*/
		btncancel.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

				Toast.makeText(Main.mainstage, "Please wait...", 1000, 200,
						200);
				//NLivetestController.isBubbleStart.set(false);
				MyDialoug.closeDialoug();

				


			}
		});

		/*Set Default Setting*/
		btnyes.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				DataStore.defaultsetting();
				
				Openscreen.open("/ConfigurationPart/Nconfigurepage.fxml");				
			
				MyDialoug.closeDialoug();
				Toast.makeText(Main.mainstage, "Please wait...", 1000, 200,
						200);
			}
		});

	}

	/*Set Label css class*/
	
	void setLabelFont() {
		btncancel.setFont(f.getM_M());
		btnyes.setFont(f.getM_M());

	}


}
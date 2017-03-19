import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * Author: Xueyuan He(Brian)
 * Date: 3/19/2017
 * Professor: Tanes
 * Purpose: Prompt the user to enter number of people with JavaFX, if numPeople is greater than 10, execute = numPeople/2, If numPeople is between 3 and 10, execute groupSize = numPeople/3, OtherWise, display message " The number of people has to be at least 3." Display the number of people and group size.
 */
public class sizeOfGroup extends Application {
	public void start(Stage primaryStage) {
		
		//create a input dialog
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("The size of group");
		dialog.setContentText("Enter the number of people: ");
		dialog.showAndWait();

		//convert string to integer
		int numPeople = Integer.parseInt(dialog.getResult());
		
		//create output dialog
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Number of people and group size");

		//convert the group size and show outputs
		if (numPeople>=10) {
			int groupSize = numPeople/2;
			alert.setContentText("You have " + numPeople + " People"+ ", and group size are " + groupSize);
			alert.showAndWait();
		}else if (numPeople>=3) {
			int groupSize = numPeople/3;
			alert.setContentText("You have " + numPeople + " people" + ", and group size are " + groupSize);
			alert.showAndWait();
		}else {
			alert.setContentText("The number of people has to be at least 3. ");
			alert.showAndWait();
		}
		
		/*Prompt the other input, output dialog, and converter for the players and team size */

		//create the second input dialog
		dialog.setContentText("Enter the number of players: ");
		dialog.showAndWait();

		//convert the second string to integer
		int numPlayers = Integer.parseInt(dialog.getResult());

		//create the second output dialog
		Alert secAlert = new Alert(AlertType.INFORMATION);
		secAlert.setTitle("Number of players and team size");

		//convert the team size and output results
		if ((numPlayers>=11)&&(numPlayers<=55)) {
			int teamSize = numPlayers/11;
			alert.setContentText("You have " + numPlayers + " Players" + ", and the team size are " + teamSize);
			alert.showAndWait();
		}else {
			alert.setContentText("You have " + numPlayers + " players" + ", and your team size are" + numPlayers);
			alert.showAndWait();
		}

	}
}


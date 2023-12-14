package alban.puissance.puissancequatre;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PuissanceQuatreController {
    @FXML
    private Button newGame;

    @FXML
    private Button quit;

    @FXML
    private GridPane grilleJeu;

    private boolean auTourDuJ1;

    @FXML
    protected void reset(){
        // TODO code pour réinitialiser la grille
    }

    @FXML
    protected void quit(){
        Stage stage = (Stage) quit.getScene().getWindow();
        stage.close();
    }

    protected void ajouterPion(){

    }
    @FXML
    protected void grilleJeu(){

    }
}
package alban.puissance.puissancequatre;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

    protected void ajouterPion(int col, int row, String nomImage){
        Image image = new Image(getClass().getResourceAsStream("/src/main/resources/alban.puissance.images/" + nomImage));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        grilleJeu.add(imageView, col, row);
    }
    @FXML
    protected void grilleJeu(){

    }
}
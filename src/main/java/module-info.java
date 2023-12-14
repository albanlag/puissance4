module alban.puissance.puissancequatre {
    requires javafx.controls;
    requires javafx.fxml;


    opens alban.puissance.puissancequatre to javafx.fxml;
    exports alban.puissance.puissancequatre;
}
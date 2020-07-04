package Main.Controller;

import Main.Resources.Values.StyleValues;
import Main.Resources.Values.TamaniosValues;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.routes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.*;
import static Main.Resources.Values.retweet.defaultestilo;

public class _9_0 implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._8_6;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._9;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._9_1;
    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    @FXML
    public ImageView closeimg;
    @FXML
    public ImageView nextimg;
    @FXML
    public ImageView imagen1;
    @FXML
    public ImageView previmg;
    @FXML
    public AnchorPane superior;
    @FXML
    public AnchorPane inferior;
    @FXML
    public AnchorPane panelvista;
    @FXML
    public AnchorPane panel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //cambiamos tamanios
        tamanios();
        //mostramos donde estamos
        dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        //siguiente pantalla
        cambiarPantalla(nextimg,fxmlnext,getClass());
        //pantalla anterior
        cambiarPantalla(previmg,fxmlprev,getClass());
        //cerrar app
        cerrarApp(closeimg);
    }
    public void tamanios(){
        TamaniosValues.tamaniosbarras(superior,inferior);
        TamaniosValues.posicionpanelgrande(panel,panelvista);
        TamaniosValues.tamanioimagen01(imagen1);
    }

}
//tamanio :https://www.javatpoint.com/java-double-to-string
// boton estilo : https://stackoverflow.com/questions/22047457/how-to-change-the-text-font-size-in-javafx

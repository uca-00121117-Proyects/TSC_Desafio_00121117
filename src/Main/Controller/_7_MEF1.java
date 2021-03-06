package Main.Controller;

import Main.Resources.Values.*;
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

public class _7_MEF1 implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._7_0;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._7;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._7_2;

    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    routes path7_1 = routes.r_7_1;
    String d_7_1 = path7_1.getroutes();
    routes path7_2 = routes.r_7_2;
    String d_7_2 = path7_2.getroutes();
    routes path7_3 = routes.r_7_3;
    String d_7_3 = path7_3.getroutes();

    @FXML
    public ImageView closeimg;
    @FXML
    public ImageView nextimg;
    @FXML
    public ImageView previmg;
    @FXML
    private Button primero;
    @FXML
    private Button segundo;
    @FXML
    private Button tercero;

    @FXML
    public BorderPane panelborder;
    @FXML
    public AnchorPane panel;
    @FXML
    public AnchorPane dominiobar;
    @FXML
    public AnchorPane superior;
    @FXML
    public AnchorPane inferior;
    @FXML
    public AnchorPane panelmenubar;
    @FXML
    public AnchorPane panelvista;
    public Integer LastButton = 1;

    @FXML
    private void primerAct(ActionEvent event) throws Exception {
        cambiar(d_7_1, getClass(), panelborder);
        estilo(primero,LastButton);
        LastButton = 1;
    }

    @FXML
    private void segundaAct(ActionEvent event) throws Exception {
        cambiar(d_7_2, getClass(), panelborder);
        estilo(segundo,LastButton);
        LastButton = 2;
    }

    @FXML
    private void tercerAct(ActionEvent event) throws Exception {
        cambiar(d_7_3, getClass(), panelborder);
        estilo(tercero,LastButton);
        LastButton = 3;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Mostramos donde estamos
        dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        //damos tamanios
        tamanios();
        iniciartodo();
        //mostramos la primera pantalla del menu
        primer();
        //Cambios de pantalla
        cambiarPantalla(nextimg,fxmlnext,getClass());
        cambiarPantalla(previmg,fxmlprev,getClass());
        //Cerrar
        cerrarApp(closeimg);
    }

    public void primer(){
        cambiar(d_7_1,getClass(),panelborder);
        estiloInicial(primero);
    }
    public void estilo(Button thisbutton,Integer last){
        StyleValues.stylebuttoncontroller(last,thisbutton,primero,segundo,tercero,null,null,null,null,null,null,null);
    }
    public void estiloInicial(Button thisbutton){
        reiniciarestilo(primero,primero.getText().length());
        defaultestilofocus(primero,primero.getText().length());
    }
    public void iniciartodo(){
        estilo(primero,LastButton);
        defaultestilo(segundo,segundo.getText().length());
        defaultestilo(tercero,tercero.getText().length());
    }

    public void tamanios() {
        TamaniosValues.tamaniosbarras(superior,inferior);
        TamaniosValues.tamaniopanelmenu(panel,panelmenubar);
        TamaniosValues.posicionpanelfragmento(panel,panelvista);
        TamaniosValues.tamaniobotones(primero,segundo,tercero,null,null,null,null,null,null,null);

    }


}
//tamanio :https://www.javatpoint.com/java-double-to-string
// boton estilo : https://stackoverflow.com/questions/22047457/how-to-change-the-text-font-size-in-javafx

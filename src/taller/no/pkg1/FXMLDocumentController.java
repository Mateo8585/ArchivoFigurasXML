
package taller.no.pkg1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *
 * @author Mateo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Canvas Lienzo;
    
    @FXML
    private GraphicsContext g;
       
    @FXML
    private ColorPicker Colores; //Me permite establecer qué color tendrá las figuras con la clase ColorPicker
    
    @FXML
    private Label M; //Label que me permite mostrar las coordenadas del mouse: X
    
    @FXML
    private Label D; //Label que me permite mostrar las coordenadas del mouse: Y
    
    @FXML
    private Polygon TR1;
    
    @FXML
    private Polygon TR2;
    
    @FXML
    private Polygon TR3;
    
    @FXML
    private void CrearFigura1(ActionEvent event) {
       
        g = Lienzo.getGraphicsContext2D();       
        g.setLineWidth(4);       
        g.setStroke(Colores.getValue()); 
        
        //Título que acompañara la figura en el canvas
        g.setFont(Font.font("Verdana",40));
        g.strokeText("POLÍGONO NO.1", 110, 70);
        
        
        double X[] = {135, 180, 360, 405, 270};
        double Y[] = {310, 140, 140, 310, 350};
        int Puntos = 5; //Número de vertices que tendrá el poligono
        
        g.strokePolygon(X, Y, Puntos);
        
        
        double X1[] = {126, 270, 412, 330, 270, 205};
        double Y2[] = {215, 110, 215, 370, 350, 370};
        
        g.strokePolygon(X1, Y2, 6);
      
    }
    
      @FXML
    private void CrearFigura2(ActionEvent event) {
       
        g = Lienzo.getGraphicsContext2D();       
        g.setLineWidth(4);
        g.setStroke(Colores.getValue());
        
        //Título que acompañara la figura en el canvas
        g.setFont(Font.font("Verdana",40));
        g.strokeText("POLÍGONO NO.2", 110, 70);
        
        
        
        //Primer triángulo
        double X[] = {180, 400, 290};
        double Y[] = {300, 300, 100};
        
        g.strokePolygon(X, Y, 3);
        
        //Segundo triángulo
        double X1[] = {160, 365, 345};
        double Y1[] = {220, 130, 350};
        
        g.strokePolygon(X1, Y1, 3);
        
        //Tercer triángulo
        double X2[] = {205, 420, 240};
        double Y2[] = {130, 215, 350};
        
        g.strokePolygon(X2, Y2, 3);
           
    }
    
    @FXML
    private void BorrarCanvas(MouseEvent e){
       
        g = Lienzo.getGraphicsContext2D();
              
        double X = e.getX();
        double Y = e.getY(); 
        
        g.clearRect(X, Y, 25, 25);
           
    }
    
    @FXML
    private void BorrarRapido(ActionEvent event){
       
        g = Lienzo.getGraphicsContext2D();
       
        double A = Lienzo.getHeight();
        double B = Lienzo.getWidth();
        
        g.clearRect(0, 0, B, A);
      
    }
      
     @FXML
    private void CrearFigura3(ActionEvent event) {
       
        g = Lienzo.getGraphicsContext2D();       
        g.setLineWidth(4);
        
        //Título que acompañara la figura en el canvas
        g.setStroke(Colores.getValue());
        g.setFont(Font.font("Verdana",40));
        g.strokeText("POLÍGONO NO.3", 110, 50);
        
       
        
        //Primer triángulo
        double X[] = {270, 220, 270, 320};
        double Y[] = {80, 330, 250, 330};
        
        
        g.strokePolygon(X, Y, 4);
        
         //Segundo triángulo
        double X1[] = {123, 420, 270};
        double Y1[] = {187, 187, 235};
        
        g.strokePolygon(X1, Y1, 3);
        
         //Tercer triángulo
        double X2[] = {270, 170, 270, 370};
        double Y2[] = {250, 100, 180, 100};
        
        g.strokePolygon(X2, Y2, 4);
        
         //Cuarto triángulo
        double X3[] = {270, 145, 270, 412};
        double Y3[] = {180, 275, 235, 275};
        
        g.strokePolygon(X3, Y3, 4);
        

    }
    
    //Método para imprimir coordenadas Mouse
    @FXML
    private void Coordenadas(MouseEvent e){
       
        M.setText("X: " + e.getX()); //Imprime la coordenada X del mouse
        D.setText("Y: " + e.getY()); //Imprime la coordenada Y del mouse
        
    }
    
    @FXML
    private void MoverFigura1(ActionEvent e){
            
        //Permite establecer la visibilidad de los polígonos en el canvas
        TR1.setVisible(true);
        TR2.setVisible(true);
        TR3.setVisible(true);
        
        PathTransition transition1 = new PathTransition(); //Creo un objeto de la clase PathTransition 
        PathTransition transition2 = new PathTransition();
        PathTransition transition3 = new PathTransition();
        
        Polygon E = new Polygon(); //Creo un objeto de la clase Polygon
        E.getPoints().addAll(new Double[]{0.0, 0.0, 400.0, 0.0, 250.0, -150.0, 400.0, -200.0, 200.0, -320.0, 80.0, -200.0, 150.0, -150.0}); //Creo el polígono que establecerá la ruta de animación para la figura
             
        transition1.setDuration(Duration.seconds(8)); //Establece el tiempo que durará la transición de movimiento
        transition1.setNode(TR1); //Establece la figura que se va animar
        transition1.setPath(E); //Establece el polígono que permitira de ruta de animación
        transition1.setCycleCount(PathTransition.INDEFINITE); //El número de veces que se repitirá la animación
        transition1.play(); //Ejecuta la animación
        
        transition2.setDuration(Duration.seconds(8));
        transition2.setNode(TR2);
        transition2.setPath(E);
        transition2.setCycleCount(PathTransition.INDEFINITE);
        transition2.play();
       
        transition3.setDuration(Duration.seconds(8));
        transition3.setNode(TR3);
        transition3.setPath(E);
        transition3.setCycleCount(PathTransition.INDEFINITE);
        transition3.play();
       
               
    }
    
    
    //Permite cambiar el estado de los polígonos a invisible, deteniendo su transición de movimiento
    @FXML
    private void Esconder(ActionEvent e){ 
        
        TR1.setVisible(false);
        TR2.setVisible(false);
        TR3.setVisible(false);
        
    }
    
    @FXML
    private void ColocarFigura(MouseEvent e){
            
        g = Lienzo.getGraphicsContext2D();
        g.setStroke(Colores.getValue());
        g.setLineWidth(3); 
        
        if(e.getButton().equals(MouseButton.PRIMARY)){
                
        double X = e.getX();
        double Y = e.getY();
        
        g.strokeRect(X, Y, 100, 100);
            
        }else if(e.getButton().equals(MouseButton.SECONDARY)){
        
        double X = e.getX();
        double Y = e.getY();
        
        g.strokeRect(X, Y, 200, 150);
        
        }
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }    
    
}

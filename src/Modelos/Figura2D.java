
package Modelos;

import java.io.FileWriter;
import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class Figura2D {
    
    private String Nombre;
    
    //***********************************************************************************************************************************
    
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x5;
    
    private int y1;
    private int y2;
    private int y3;
    private int y4;
    private int y5;
    
    //***********************************************************************************************************************************
    
    private int x11;
    private int x22;
    private int x33;
    private int x44;
    private int x55;
    private int x66;
    
    private int y11;
    private int y22;
    private int y33;
    private int y44;
    private int y55;
    private int y66;
    
    //***********************************************************************************************************************************

    public Figura2D(String Nombre, int x1, int x2, int x3, int x4, int x5, int y1, int y2, int y3, int y4, int y5, int x11, int x22, int x33, int x44, int x55, int x66, int y11, int y22, int y33, int y44, int y55, int y66) {
        this.Nombre = Nombre;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
        this.y5 = y5;
        this.x11 = x11;
        this.x22 = x22;
        this.x33 = x33;
        this.x44 = x44;
        this.x55 = x55;
        this.x66 = x66;
        this.y11 = y11;
        this.y22 = y22;
        this.y33 = y33;
        this.y44 = y44;
        this.y55 = y55;
        this.y66 = y66;
    }
    
    public Figura2D() {
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getX5() {
        return x5;
    }

    public void setX5(int x5) {
        this.x5 = x5;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public int getY5() {
        return y5;
    }

    public void setY5(int y5) {
        this.y5 = y5;
    }

    public int getX11() {
        return x11;
    }

    public void setX11(int x11) {
        this.x11 = x11;
    }

    public int getX22() {
        return x22;
    }

    public void setX22(int x22) {
        this.x22 = x22;
    }

    public int getX33() {
        return x33;
    }

    public void setX33(int x33) {
        this.x33 = x33;
    }

    public int getX44() {
        return x44;
    }

    public void setX44(int x44) {
        this.x44 = x44;
    }

    public int getX55() {
        return x55;
    }

    public void setX55(int x55) {
        this.x55 = x55;
    }

    public int getX66() {
        return x66;
    }

    public void setX66(int x66) {
        this.x66 = x66;
    }

    public int getY11() {
        return y11;
    }

    public void setY11(int y11) {
        this.y11 = y11;
    }

    public int getY22() {
        return y22;
    }

    public void setY22(int y22) {
        this.y22 = y22;
    }

    public int getY33() {
        return y33;
    }

    public void setY33(int y33) {
        this.y33 = y33;
    }

    public int getY44() {
        return y44;
    }

    public void setY44(int y44) {
        this.y44 = y44;
    }

    public int getY55() {
        return y55;
    }

    public void setY55(int y55) {
        this.y55 = y55;
    }

    public int getY66() {
        return y66;
    }

    public void setY66(int y66) {
        this.y66 = y66;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", x1: " + x1 + ", x2: " + x2 + ", x3: " + x3 + ", x4: " + x4 + ", x5: " + x5 + ", y1: " + y1 + ", y2: " + y2 + ", y3: " + y3 + ", y4: " + y4 
                + ", y5: " + y5 + ", x11: " + x11 + ", x22: " + x22 + ", x33: " + x33 + ", x44: " + x44 + ", x55: " + x55 + ", x66: " + x66 + ", y11: " + y11 
                + ", y22: " + y22 + ", y33: " + y33 + ", y44: " + y44 + ", y55: " + y55 + ", y66: " + y66 + '}';
    }

    
    public boolean GuardarFigura(LinkedList<Figura2D> ListaFigura) {
        
        boolean g = false;
        try{
        
        Element Figura = new Element("FIGURA2D"); //Elemento o etiqueta raíz principal donde estará almacenada toda los datos del polígono
        Document doc = new Document(Figura);
        
        Element Nombre = new Element("Nombre").setText(ListaFigura.get(0).getNombre()); //Elemento o etiqueta del nombre del polígono
        
        //***********************************************************************************************************************************
        Element Poligono1 = new Element("Polígono-1");
        
        //Conversión de los valores de tipo entero a cadena
        String x1 = Integer.toString(ListaFigura.get(0).getX1());
        String x2 = Integer.toString(ListaFigura.get(0).getX2());
        String x3 = Integer.toString(ListaFigura.get(0).getX3());
        String x4 = Integer.toString(ListaFigura.get(0).getX4());
        String x5 = Integer.toString(ListaFigura.get(0).getX5());
        
        //Elementos que estarán adentro de la etiqueta Polígono-1
        Poligono1.addContent(new Element("Coordenada-X1").setText(x1));
        Poligono1.addContent(new Element("Coordenada-X2").setText(x2));
        Poligono1.addContent(new Element("Coordenada-X3").setText(x3));
        Poligono1.addContent(new Element("Coordenada-X4").setText(x4));
        Poligono1.addContent(new Element("Coordenada-X5").setText(x5));
       
        //Conversión de los valores de tipo entero a cadena
        String y1 = Integer.toString(ListaFigura.get(0).getY1());
        String y2 = Integer.toString(ListaFigura.get(0).getY2());
        String y3 = Integer.toString(ListaFigura.get(0).getY3());
        String y4 = Integer.toString(ListaFigura.get(0).getY4());
        String y5 = Integer.toString(ListaFigura.get(0).getY5());
        
        Poligono1.addContent(new Element("Coordenada-Y1").setText(y1));
        Poligono1.addContent(new Element("Coordenada-Y2").setText(y2));
        Poligono1.addContent(new Element("Coordenada-Y3").setText(y3));
        Poligono1.addContent(new Element("Coordenada-Y4").setText(y4));
        Poligono1.addContent(new Element("Coordenada-Y5").setText(y5));
        
        //***********************************************************************************************************************************
        
        Element Poligono2 = new Element("Polígono-2");
        
        //Conversión de los valores de tipo entero a cadena
        String x11 = Integer.toString(ListaFigura.get(0).getX11());
        String x22 = Integer.toString(ListaFigura.get(0).getX22());
        String x33 = Integer.toString(ListaFigura.get(0).getX33());
        String x44 = Integer.toString(ListaFigura.get(0).getX44());
        String x55 = Integer.toString(ListaFigura.get(0).getX55());
        String x66 = Integer.toString(ListaFigura.get(0).getX66());
        
        Poligono2.addContent(new Element("Coordenada-X1").setText(x11));
        Poligono2.addContent(new Element("Coordenada-X2").setText(x22));
        Poligono2.addContent(new Element("Coordenada-X3").setText(x33));
        Poligono2.addContent(new Element("Coordenada-X4").setText(x44));
        Poligono2.addContent(new Element("Coordenada-X5").setText(x55));
        Poligono2.addContent(new Element("Coordenada-X6").setText(x66));
        
        //Conversión de los valores de tipo entero a cadena
        String y11 = Integer.toString(ListaFigura.get(0).getY11());
        String y22 = Integer.toString(ListaFigura.get(0).getY22());
        String y33 = Integer.toString(ListaFigura.get(0).getY33());
        String y44 = Integer.toString(ListaFigura.get(0).getY44());
        String y55 = Integer.toString(ListaFigura.get(0).getY55());
        String y66 = Integer.toString(ListaFigura.get(0).getY66());
        
        Poligono2.addContent(new Element("Coordenada-Y1").setText(y11));
        Poligono2.addContent(new Element("Coordenada-Y2").setText(y22));
        Poligono2.addContent(new Element("Coordenada-Y3").setText(y33));
        Poligono2.addContent(new Element("Coordenada-Y4").setText(y44));
        Poligono2.addContent(new Element("Coordenada-Y5").setText(y55));
        Poligono2.addContent(new Element("Coordenada-Y6").setText(y66));
             
        //***********************************************************************************************************************************
        
        //Se establece los elementos raices principales que contendra el archivo XML en el documento. 
        //Asimismo, incluye los elementos hijos en conjunto con el contenido de cada elemento raíz
        doc.getRootElement().addContent(Nombre);
        doc.getRootElement().addContent(Poligono1);
        doc.getRootElement().addContent(Poligono2);
        
        //Se cierra el proceso de guardado en XML
        XMLOutputter xmlOutput = new XMLOutputter();
        xmlOutput.setFormat(Format.getPrettyFormat());
        xmlOutput.output(doc, new FileWriter("FIGURA2D.xml"));
        
        g = true;
        System.out.println("ARCHIVO GUARDADO");
        
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
        
        return g;
    }
    
    
    
    
}

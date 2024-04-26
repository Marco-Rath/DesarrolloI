
package jPack_Tienda_MarcoRath;
public class jClass_Prendas_Vestir {
    private int precioJeans;
    private int precioJogger;
    private int precioChino;
    private int precioLino;
        
    private int precioCamisaconcuelloInglés;
    private int precioCamisaconcuelloItaliano;
    private int precioCamisaconcuelloCutaway;
    private int precioCamisaconcuellopaloma;
    
      private int precioAlbarca;
    private int precioAlpargata;
    private int precioBabucha;
    private int precioBotas;
    
      private int precioamericana;
    private int precioblazer;
    private int preciocruzada;
    private int preciobomber;
    
     private String[] tamañoJeans;
    private String[] tamañoJogger;
    private String[] tamañoChino;
    private String[] tamañoLino;

    private String[] tamañoCamisaconcuelloInglés;
    private String[] tamañoCamisaconcuelloItaliano;
    private String[] tamañoCamisaconcuelloCutaway;
    private String[] tamañoCamisaconcuellopaloma;

    private String[] tamañoAlbarca;
    private String[] tamañoAlpargata;
    private String[] tamañoBabucha;
    private String[] tamañoBotas;

    private String[] tamañoamericana;
    private String[] tamañoblazer;
    private String[] tamañocruzada;
    private String[] tamañobomber;
   
    
    public jClass_Prendas_Vestir() {

        precioJeans = 150;
        precioJogger = 100;
        precioChino = 80;
        precioLino = 110;
        
        precioCamisaconcuelloInglés=70;
        precioCamisaconcuelloItaliano=60;
        precioCamisaconcuelloCutaway=90;
        precioCamisaconcuellopaloma=75;
        
        precioAlbarca=150;
        precioAlpargata=140;
        precioBabucha=130;
        precioBotas=180;  
        
        precioamericana=60;
        precioblazer=40;
        preciocruzada=35;
        preciobomber=50;
       
        tamañoJeans = new String[]{"S", "M", "L", "XL"};
        tamañoJogger = new String[]{"S", "M", "L", "XL"};
        tamañoChino = new String[]{"S", "M", "L", "XL"};
        tamañoLino = new String[]{"S", "M", "L", "XL"};

        tamañoCamisaconcuelloInglés = new String[]{"S", "M", "L", "XL"};
        tamañoCamisaconcuelloItaliano = new String[]{"S", "M", "L", "XL"};
        tamañoCamisaconcuelloCutaway = new String[]{"S", "M", "L", "XL"};
        tamañoCamisaconcuellopaloma = new String[]{"S", "M", "L", "XL"};

        tamañoAlbarca = new String[]{"35", "40", "37", "39"};
        tamañoAlpargata = new String[]{"35", "40", "37", "39"};
        tamañoBabucha = new String[]{"35", "40", "37", "39"};
        tamañoBotas = new String[]{"35", "40", "37", "39"};

        tamañoamericana = new String[]{"S", "M", "L", "XL"};
        tamañoblazer = new String[]{"S", "M", "L", "XL"};
        tamañocruzada = new String[]{"S", "M", "L", "XL"};
        tamañobomber = new String[]{"S", "M", "L", "XL"};
    
       
        
    }
    
    public int getPrecioJeans() {
        return precioJeans;
    }
    
    public int getPrecioJogger() {
        return precioJogger;
    }
    
    public int getPrecioChino() {
        return precioChino;
    }
    
    public int getPrecioLino() {
        return precioLino;
    }
    
    public void setPrecioJeans(int precio) {
        precioJeans = precio;
    }
    
    public void setPrecioJogger(int precio) {
        precioJogger = precio;
    }
    
    public void setPrecioChino(int precio) {
        precioChino = precio;
    }
    
    public void setPrecioLino(int precio) {
        precioLino = precio;
    }
    /*****************PARA CAMIZA****
     */
    
    public int getprecioCamisaconcuelloInglés() {
        return precioCamisaconcuelloInglés;
    }
    
    public int getprecioCamisaconcuelloItaliano() {
        return precioCamisaconcuelloItaliano;
    }
    
    public int getprecioCamisaconcuelloCutaway() {
        return precioCamisaconcuelloCutaway;
    }
    
    public int getprecioCamisaconcuellopaloma() {
        return precioCamisaconcuellopaloma;
    }
    
    public void setprecioCamisaconcuelloInglés(int precio1) {
        precioCamisaconcuelloInglés = precio1;
    }
    
    public void setprecioCamisaconcuelloItaliano(int precio1) {
        precioCamisaconcuelloItaliano = precio1;
    }
    
    public void setprecioCamisaconcuelloCutaway(int precio1) {
        precioChino = precio1;
    }
    
    public void setprecioCamisaconcuellopaloma(int precio1) {
        precioLino = precio1;
    }
    /**** PARA CALSADOS
     */
     
    public int getprecioAlbarca() {
        return precioAlbarca;
    }
    
    public int getprecioAlpargata() {
        return precioAlpargata;
    }
    
    public int getprecioBabucha() {
        return precioBabucha;
    }
    
    public int getprecioBotas() {
        return precioBotas;
    }
    
    public void setprecioAlbarca(int precio2) {
        precioAlbarca = precio2;
    }
    
    public void setprecioAlpargata(int precio2) {
        precioAlpargata = precio2;
    }
    
    public void setprecioBabucha(int precio2) {
        precioBabucha = precio2;
    }
    
    public void setprecioBotas(int precio2) {
        precioBotas = precio2;
    }
           /* PARA CASACA
    */
       public int getprecioamericana() {
        return precioamericana;
    }
    
    public int getprecioblazer() {
        return precioblazer;
    }
    
    public int getpreciocruzada() {
        return preciocruzada;
    }
    
    public int getpreciobomber() {
        return preciobomber;
    }
    
    public void setprecioamericana(int precio3) {
        precioamericana = precio3;
    }
    
    public void setprecioblazer(int precio3) {
        precioblazer = precio3;
    }
    
    public void setpreciocruzada(int precio3) {
        preciocruzada = precio3;
    }
    
    public void setpreciobomber(int precio3) {
        preciobomber = precio3;
    }
    
    

       public String[] getSizesJeans() {
        return tamañoJeans;
    }

    public void setSizesJeans(String[] sizes) {
        tamañoJeans = sizes;
    }

    // Repeat the above pattern for other items...

    // Additional methods for modifying sizes

    public void addSizeToJeans(String size) {
        String[] updatedSizes = new String[tamañoJeans.length + 1];
        System.arraycopy(tamañoJeans, 0, updatedSizes, 0, tamañoJeans.length);
        updatedSizes[tamañoJeans.length] = size;
        tamañoJeans = updatedSizes;
    }

    // Repeat the above pattern for other items...

    public void removeSizeFromJeans(String size) {
        String[] updatedSizes = new String[tamañoJeans.length - 1];
        int index = -1;
        for (int i = 0; i < tamañoJeans.length; i++) {
            if (tamañoJeans[i].equals(size)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            System.arraycopy(tamañoJeans, 0, updatedSizes, 0, index);
            System.arraycopy(tamañoJeans, index + 1, updatedSizes, index, tamañoJeans.length - index - 1);
            tamañoJeans = updatedSizes;
        }
    }


    
}

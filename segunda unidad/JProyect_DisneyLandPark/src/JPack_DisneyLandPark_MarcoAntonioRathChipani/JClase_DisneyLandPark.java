
package JPack_DisneyLandPark_MarcoAntonioRathChipani;

public class JClase_DisneyLandPark {
    int capacidad;
    int ocupados;
    String tipo;
    double entrada;
    //preparando constructor
    
    public JClase_DisneyLandPark(){
        
        capacidad = 15;
        ocupados = 0;
        tipo = "";
        entrada = 5.00;
    }
    //implementando el metodo set y get
    public int getCapacidad(){
        return capacidad;
    }
     public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public int getOcupadas (){
        return ocupados;
    }
    public void setOcupadas(int ocupados){
        this.ocupados = ocupados;
    }
    //tipo
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public Double getEntrada(){
        return entrada;
    }
    public void setEntrada(Double entrada){
        this.entrada = entrada;
    }
    //metodos adicionales
    public int getLibres(){
        int lib;
        lib = capacidad - ocupados;
        return lib;
    }
    public void setLibres (int lib){
        int ocu;
        ocu = capacidad-lib;
        ocupados = ocu;
    }
    public double getPorcentaje(){
        double por;
        por = Math.round( (double)ocupados/(double)capacidad*100);
        
        return por;
    }
    //ingresos
    public double getIngresos (){
        double ingre;
        ingre = ocupados*entrada;
        return ingre;
    }
    //metodo de orden
    //vaciar
    public void Vaciar(){
        
    ocupados = 0;
    tipo ="";
    }
    public void EntraUno (){
        ocupados ++;
    }
}

class Figura {
    private String nombre;
    private String color;
    private Punto centro;

    public Figura(String nombre, String color, Punto centro){
        this.nombre = nombre;
        this.color = color;
        this.centro = centro;
    }

    @Override
    public String toString(){
        return "Figura: " + nombre + "\n" +
                "Color: " + color + "\n" +
                "Centro: " + centro;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
        
    }
}

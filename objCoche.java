public class objCoche {
    private String Color;
    private String Marca;
    private int Cilindraje;

    public objCoche(String color, String marca, int cilindraje) {
        Color = color;
        Marca = marca;
        Cilindraje = cilindraje;
    }

    public objCoche() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }

}

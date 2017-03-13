package geometrie;
class Couleur {
    private int red;
    private int blue;  
    private int green;     

    Couleur(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
    public String toString() {
        return "rgb(" + red + ","
                      + green + ","
                      + blue + ")";
     }
}

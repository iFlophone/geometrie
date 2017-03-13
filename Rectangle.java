package geometrie;
class Rectangle extends Figure{
    private double coteHorizontal;
    private double coteVertical; 
    
    Rectangle() {
        super();
        coteHorizontal = 0;
        coteVertical = 0;
    }
    
    Rectangle(double coteHorizontal, double coteVertical) {
        super();
        this.coteHorizontal = coteHorizontal;
        this.coteVertical = coteVertical;
    }
    Rectangle(double coteHorizontal, double coteVertical, Point centre) {
        super(centre);
        this.coteHorizontal = coteHorizontal;
        this.coteVertical = coteVertical;

    }

    double getCoteHorizontal() {
        return coteHorizontal;
    }
    
    double getCoteVertical() {
        return coteVertical;
    }
    
    void setCoteHorizontal(double coteHorizontal) {
        this.coteHorizontal = coteHorizontal;
    }
    
    void setCoteVertical(double coteVertical) {
        this.coteVertical = coteVertical;
    }
    
    public String toString() {
        return super.toString() +"\ndimensions : " + coteHorizontal + " x " + coteVertical;
    }
    
    
    
    
    
    
    
    
    double calculerLongueur() {
        return 2 * (coteHorizontal + coteVertical);
    }
    
    double calculerAire() {
        return coteHorizontal * coteVertical;
    }
    
    boolean estInscrit(Cercle c) {
        return 4 * c.getRayon() * c.getRayon() == 
            coteHorizontal * coteHorizontal + 
            coteVertical * coteVertical;
    }
    Cercle inscrire() {
        if(coteHorizontal !=  coteVertical)  
            return null;
        return new Cercle(coteHorizontal / 2);
    }
    public void zoomer(double coefficient) {
       super.zoomer(coefficient);
       coteHorizontal = coefficient * coteHorizontal;
       coteVertical = coefficient * coteVertical;
    }
    boolean estCarre(){
        return coteHorizontal == coteVertical;
    }
        public Losange pivoter() {
        if(estCarre())
            return new Losange(coteHorizontal);
        return null;
    }

}

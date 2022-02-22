public class Cirkel {
    int radius;
    int xPositie;
    int yPositie;

    public Cirkel(int rad, int posx, int posy){
        radius = rad;
        xPositie = posx;
        yPositie = posy;
        if (radius <= 0){
            throw new IllegalArgumentException("radius moet groter dan 0 zijn!");
        }
    }


    public String toString(){
        return "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }


}

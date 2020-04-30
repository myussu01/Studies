public class MutablePoint {
    double x;
    double k;

    public MutablePoint(double dx, double dy){
        this.x = dx;
        this.k = dy;
    }
    public MutablePoint(){
        this.x = 0;
        this.k = 0;
    }
    public void translate(int i, int j){
        this.x += i;
        this.k+= j;
    }

    public void scale(double l){
        this.x*=l;
        this.k*=l;
    }

    public double getX() {
        return x;
    }

    public double getK() {
        return k;
    }
}

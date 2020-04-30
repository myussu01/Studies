public class Point {
    private final double x;
    private final double k;

    public Point(double dx, double dy){
        this.x = dx;
        this.k = dy;
    }
    public Point(){
        this.x = 0;
        this.k = 0;
    }
    public Point translate(int i, int j){
        Point x = new Point(i + this.x, j + this.k);
        return x;
    }

    public Point scale(double l){
        Point c = new Point(this.x*l, this.k*l);
        return c;
    }

    public double getX() {
        return x;
    }

    public double getK() {
        return k;
    }
}

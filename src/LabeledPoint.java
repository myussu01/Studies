public class LabeledPoint extends Point{
    String label;
    public LabeledPoint(String l, double x, double y){
        super(x,y);
        this.label = l;
    }

    public String getLabel() {
        return label;
    }
}

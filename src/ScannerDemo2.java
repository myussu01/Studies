import java.util.Scanner;

public class ScannerDemo2<T> {
    T name;

   public ScannerDemo2(T x){
       this.name = x;
   }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
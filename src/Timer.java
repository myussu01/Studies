public class Timer implements Runnable {

    long time;
    long x;

    public Timer(long x){
    this.time = x;
    }

    public void run(){
        try{
            countdown(this.time);
        }catch (Exception e){System.out.println("Exception caught");}
    }

    public void countdown(long c){
        while(c !=0){
            this.time-=1;
            c-=1;
        }
        System.out.println("Timer is done");
    }
}

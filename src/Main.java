import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main {

    public static abstract class ChessPiece
    {
        private int locX, locY;

        ChessPiece( int x, int y )
        {
            locX = x;
            locY = y;
        }

        int getX()
        {
            return locX;
        }

        int getY()
        {
            return locY;
        }

        abstract boolean canAttack( ChessPiece p );

    }

    public static class King extends ChessPiece
    {
        public King(int x, int y){
            super(x,y);
        }
        @Override
        boolean canAttack(ChessPiece p) {
            if(this.getY() + 1 == p.getY() || this.getX() + 1 == p.getX()) return true;
            else if(this.getY() - 1 == p.getY() || this.getX() - 1 == p.getX()) return true;
            else if(this.getY() == p.getY() && this.getX()+1 == p.getX()
            ||this.getX() == p.getX() && this.getY()+1 == p.getY()  ||
                    this.getX() == p.getX() && this.getY()-1 == p.getY() ||
                    this.getY() == p.getY() && this.getX()-1 == p.getX()) return true;
            else return false;
        }
    }


    public static class Bishop extends ChessPiece
    {
        public Bishop(int x,int y){
            super(x,y);
        }
        @Override
        boolean canAttack(ChessPiece p) {
            if(Math.abs(this.getX() - this.getY()) ==
                    Math.abs(p.locX - p.getY())){
                return true;
            }else return false;
        }
    }

    public static class Rook extends ChessPiece
    {
        public Rook(int x, int y){
            super(x,y);
        }

        @Override
        boolean canAttack(ChessPiece p) {
            if((this.getX() == p.getX()) || this.getY() == p.getY()){
            return true;}else return false;
        }
    }

    public static class Queen extends ChessPiece
    {
        public Queen(int x, int y){
            super(x,y);
        }
        @Override
        boolean canAttack(ChessPiece p) {
            if((this.getX() == p.getX()) || this.getY() == p.getY()){
                return true;} else if(Math.abs(this.getX() - this.getY()) ==
                    Math.abs(p.getX() - p.getY())){
            return true;}else return false;
        }
    }

    public static class Knight extends ChessPiece
    {
        public Knight(int x, int y){
            super(x,y);
        }

        @Override
        boolean canAttack(ChessPiece p) {
            if(this.getX()+2 == p.getX() && this.getY()-1 == p.getY())return true;
            else if(this.getX()+2 == p.getX() && this.getY()+1 == p.getY())return true;
            else if(this.getX()-2 == p.getX() && this.getY()-1 == p.getY())return true;
            else if(this.getX()-2 == p.getX() && this.getY()+1 == p.getY())return true;
            else if(this.getY()+2 == p.getY() && this.getX()-1 == p.getX())return true;
            else if(this.getY()+2 == p.getY() && this.getX()+1 == p.getX())return true;
            else if(this.getY()-2 == p.getY() && this.getX()-1 == p.getX())return true;
            else if(this.getY()-2 == p.getY() && this.getX()+1 == p.getX())return true;
            else return false;
        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number");
        int num = in.nextInt();
        int n,m, u, p;
        String x, z;
        ArrayList<ChessPiece> ch = new ArrayList<ChessPiece>();

        for(int i =0; i<num; i++){
            System.out.print("Provide lines");
            x = in.next().toLowerCase();
            n = in.nextInt();
            m = in.nextInt();
            z = in.next().toLowerCase();
            u = in.nextInt();
            p = in.nextInt();
            switch(x){
                case "q": ch.add(i,new Queen(n, m));
                    break;
                case "k": ch.add(i,new King(n, m));
                    break;
                case "b": ch.add(i,new Bishop(n, m));
                    break;
                case "r": ch.add(i,new Rook(n, m));
                    break;
                case "n": ch.add(i,new Knight(n, m));
                    break;}
                switch(z){
                    case "q": ch.add(i+1,new Queen(u,p));
                        break;
                    case "k": ch.add(i+1,new King(u,p));
                        break;
                    case "b": ch.add(i+1,new Bishop(u,p));
                        break;
                    case "r": ch.add(i+1,new Rook(u,p));
                        break;
                    case "n": ch.add(i+1,new Knight(u,p));
                        break;
                }
        }

        for(int j = 0; j<ch.size()-2; j++){
            System.out.println(ch.get(j).canAttack(ch.get(j+1)));
        }


        // use in.nextInt(); to read an int, and use in.next().charAt(0); to read a character
        MutablePoint d = new MutablePoint(34,45);
        d.k = 49;
        System.out.println(d.x + " " + d.k);
    }
}
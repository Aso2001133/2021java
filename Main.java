package KadaiSaisyu2;

import java.util.Scanner;

public class Main {
    public static void main(String[] ages){
        set();
        Disp.start();
        sub();
        Disp.end();
    }

    public static void set(){
        Ship ship=new Ship();
        ship.setShip(1);
        ship.setShip(2);
        ship.setShip(3);

    }

    public static void sub(){

        while(Ship.hp[0]+Ship.hp[1]+Ship.hp[2]!=0){
            Map.disp();
            Disp.disp1(Ship.f[0],Ship.f[1],Ship.f[2]);
            Disp.disp2();
            int x=sc();
            Disp.disp3();
            int y=sc();
            Map.b_map(x,y);
        }

    }

    public static int sc(){
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        while(num<1||num>5){
            Disp.disp4();
            num = scanner.nextInt();
        }
        return num;
    }
    
}

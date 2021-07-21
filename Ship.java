package KadaiSaisyu2;
import java.util.Random;

public class Ship {
    public static int[] x=new int[3];
    public static int[] y=new int[3];
    public static int[] z=new int[3];
    public static int[] hp={3,3,3};
    public static String[] f={"生きている","生きている","生きている"};

    public void setShip(int z){
        Random r = new Random();
        Ship.x[z-1] = r.nextInt(5)+1;
        Ship.y[z-1] = r.nextInt(5)+1;
        Ship.z[z-1]=z;
        while(Map.map[Ship.x[z-1]][Ship.y[z-1]]!=0){
            Ship.x[z-1] = r.nextInt(5)+1;
            Ship.y[z-1] = r.nextInt(5)+1; 
        }
        Map.map(Ship.x[z-1],Ship.y[z-1],Ship.z[z-1]);
    }

    public void d_ship(int z){
        Disp.hit_disp(z);
        Map.map[Ship.x[z-1]][Ship.y[z-1]]=0;
        setShip(z);
        Ship.hp[z-1]=Ship.hp[z-1]-1;
        if(Ship.hp[z-1]==0){
            f[z-1]="撃沈";
            Map.map[Ship.x[z-1]][Ship.y[z-1]]=0;
            Disp.hit_disp3(z);
        }else{
            Disp.hit_disp2(z);
        }
        
    }
    
}

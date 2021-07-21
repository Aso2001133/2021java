package KadaiSaisyu2;

public class Map {
    public static int[][]  map={{0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0}
                        };
    
    public static void map(int x,int y,int z){
        map[x][y]=z;
    } 

    public static void b_map(int x,int y){
        for(int i=1; i<=3;i++){
            if(Ship.hp[i-1]==0){
                Disp.nohp_disp(i);
            }else{
                if(map[x][y]==i){
                    Ship ship=new Ship();
                    ship.d_ship(i);
                }else if(map[x+1][y]==i||map[x-1][y]==i||map[x][y-1]==i||map[x][y+1]==i){
                    Disp.nir_disp(i);
                }else{
                    Disp.mis_disp(i);
                }
            }    
        }
    }

    public static void disp(){
        for(int i=1; i<Map.map.length-1; i++){
            for(int j=1; j<Map.map.length-2; j++){
                System.out.print(Map.map[i][j]);
            }
            System.out.println(Map.map[i][5]);
        }
    }
}

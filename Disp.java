package KadaiSaisyu2;

public class Disp {
    public static int i=0;
    
    public static void start(){
        System.out.println("****************\n戦艦ゲーム\n****************");
    }

    public static void disp1(String a,String b,String c){
        System.out.printf("---------[ターン%d]---------\n",++i);
        System.out.printf("船1:%s\n",a);
        System.out.printf("船2:%s\n",b);
        System.out.printf("船3:%s\n",c);
    }
    public static void disp2(){
        System.out.println("爆弾のX座標を入力してください(1-5)"+Ship.x[0]);
    }
    
    public static void disp3(){
        System.out.println("爆弾のY座標を入力してください(1-5)");
    }
    public static void disp4(){
        System.out.println("座標は1から5までです。");
    }

    public static void hit_disp(int z){
        System.out.printf("船%d:爆弾が当たった。",z);
    }

    public static void hit_disp2(int z){
        System.out.printf("しかし船は、まだ沈まない！船は移動します。\n",z);
    }

    public static void hit_disp3(int z){
        System.out.printf("船は撃沈しました。\n",z);
    }

    public static void mis_disp(int z){
        System.out.printf("船%d:はずれ！\n",z);
    }

    public static void nir_disp(int z){
        System.out.printf("船%d:波高し！\n",z);
    }

    public static void nohp_disp(int z){
        System.out.printf("船%d:撃沈\n",z);
    }
    public static void end(){
        System.out.printf("船はすべて撃沈しました。");
    }
    
}

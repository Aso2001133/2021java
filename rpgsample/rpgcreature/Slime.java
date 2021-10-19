package rpgcreature;

import java.util.Random;

/**
 * スライムクラス
 */
public class Slime extends Monster{

    /**
     * スライムクラスのコンストラクタ
     */
    public Slime(){
        super("スライム",12,1,3);
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    @Override
    public void attack(Creature opponent) {
        
        Random r = new Random();
        int damage = r.nextInt(5)-opponent.defense;
        System.out.printf("%sの攻撃！\n",getName());
        if(damage<0){
            damage=0;
        }
        opponent.damaged(damage);
        
        displayMessage(opponent,damage);
        
    }
    
}

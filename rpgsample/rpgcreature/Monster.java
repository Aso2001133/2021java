package rpgcreature;

/**
 * モンスターのスーパークラス
 */
public abstract class Monster extends Creature{
    protected boolean escapeFlag = false;
public int gold;

    /**
     * モンスタークラスのコンストラクタ
     * @param name　名前
     * @param hp　モンスターの体力
     * @param gold ゴールド
     */
    public Monster(String name,int hp,int defense,int gold){
        super(name,hp,defense);
        this.gold=gold;
    }

    /**
     * 〇〇が現れたを表示するメソッド
     */
    public void displayAppearanceMsg(){
        System.out.printf("%sが現れた！\n",getName());
    }

    /**
     * すでに逃げているかのチェック
     * @return true:逃げている　false：まだ逃げていない
     */
    public boolean isEscaped(){
        return escapeFlag;
    }

    /**
     * モンスターが居るかどうかのチェックメソッド
     * モンスターが居ない＝「モンスターが死んでいる」もしくは「すでに逃げている」
     * @return true:居る false：居ない
     */
    public boolean isThere(){
        return (hp > 0 && !escapeFlag);
    }

    public int getGold(){
        return this.gold;
    }
}

package base;

import util.Rand;

public class Player {
	public Player(int atk,int def,int matk,int mdef,int spd,int luk,int hp,int tec) {
		this.atk = atk;
		this.def = def;
		this.matk = matk;
		this.mdef = mdef;
		this.spd = spd;
		this.luk = luk;
		this.hp = hp;
		this.tec = tec;
	}
	/**
	 * Base Damage = (atk - def) * (random(0.75 + luk,1)) + 1
	 * Base Magic Damage = (matk - mdef) * (random(0.75 + luk,1)) + 1
	 * Hit Chance = BaseChance + 2 * tec - luk - spd
	 * */
	//攻
	private static int atk;
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	//防
	private static int def;
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	//魔攻,目前无用
	private static int matk;
	public int getMatk() {
		return matk;
	}
	public void setMatk(int matk) {
		this.matk = matk;
	}
	//魔防,目前无用
	private static int mdef;
	public int getMdef() {
		return mdef;
	}
	public void setmdef(int mdef) {
		this.mdef = mdef;
	}
	//速
	private static int spd;
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	//运
	private static int luk;
	public int getLuk() {
		return luk;
	}
	public void setLuk(int luk) {
		this.luk = luk;
	}
	//hp
	private static int hp;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	//技
	private static int tec;
	public int getTec() {
		return tec;
	}
	public void setTec(int tec) {
		this.tec = tec;
	}
	private static String name = new String();
	public
	/*************************************************/
	//攻击方法
	static void attack(Player player2) {
		int baseDamage = atk * (atk - def) * (util.Rand.ranInt(75 + luk,1))/(100) + 1;
		if(hit(player2)) {
			player2.setHp(player2.getHp()-baseDamage);
			System.out.println("damage="+baseDamage);
		}else {
			System.out.println("attack is not hit");
		}
	}
	
	private static boolean hit(Player defer) {
		//Hit Chance = BaseChance + 2 * tec - luk - spd
		int hitChance = 85 + 2 * tec - defer.getLuk() - defer.getSpd();
		return util.Rand.ranInt(0,100) > hitChance;
	}
}

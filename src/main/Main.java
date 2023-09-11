package main;

import util.Rand;
import base.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("this game is run");
		Player p1 = new Player(10,10,10,10,10,10,60,10);
		Player p2 = new Player(10,10,10,10,10,10,60,10);
		System.out.println("player is loding");
		int i = 0;
		while(true) {
			i++;
			System.out.println("循环执行了"+i+"次");
			p1.attack(p2);
			if(p2.getHp() <= 0) {
				System.out.println("p1win");
				break;
			}
			p2.attack(p1);
			if(p1.getHp() <= 0) {
				System.out.println("p2win");
				break;
			}
		}
		System.out.println("game is end");
	}
}

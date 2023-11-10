package helloworld;

import java.util.Scanner;
import verbo.verbo;

public class Verbo {
	public static void main(String[] args) {
    String rad, suf;
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite o radical: ");
    rad = sc.nextLine();
    System.out.println(" Digite o sufixo");
    suf = sc.nextLine();
    verbo verbo = new verbo(rad, suf);
    verbo.conjugar();
    		
	}
}
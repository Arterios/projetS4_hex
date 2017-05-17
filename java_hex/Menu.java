package java_hex;

import java.util.Scanner;
import java_hex.partie;

/**
	penser à close sc en fin d'utilisation
*/
public class Menu {
	private boolean estMenuSecondaire;
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 
	 * @param secondaire: si false, le Menu aura les methodes sauvegarder et quitter inutilisables
	 */
	public Menu (Boolean secondaire){
		super();
		this.estMenuSecondaire = secondaire;
	}

	/**
	 * @return estMenuSecondaire
	 */
	public boolean estMenuSecondaire() {
		return this.estMenuSecondaire;
	}
	
	
	
	
	
	
	private int new_game(){
		System.out.println("new game");
		return 0;
	}
	
	private int quitter(){
		return 0;
	}
	
	private int sauvegarder(){
		System.out.println("save");
		return 0;
	}
	
	private int charger(){
		System.out.println("charger");
		return 0;
	}
	
	private void help(){
		System.out.println("help");
	}
	
	private void regles(){
		System.out.println("Présentation du jeu de Hex\n");
		System.out.println("	Le jeu de Hex est un jeu de société combinatoire abstrait pour deux joueurs.\n"+
				" Il se joue sur un tablier en forme de losange dont les cases sont hexagonales.\n"+
				" Toutes les dimensions du côté du losange sont possibles, la plus traditionnelle est celle composée par 11 hexagones,\n"+
				" mais on trouve aussi les valeurs 13 ou 19. L’un des inventeurs du jeu, John Nash, préconise un tablier de taille 14 × 14.");
		
		System.out.println("\n\nBut du jeu\n");
		System.out.println("Le but du jeu est, pour chaque joueur, de relier les deux bords opposés du plateau de jeu (noir: B ou blanc: W)\n"+
		" avec un chemin continu de pions.");
		
		System.out.println("\n\nLes coups\n");
		System.out.println("Chaque joueur joue à tour de rôle en posant un pion sur une case libre\n"+
		" n’importe où sur le plateau de jeu. Le premier qui crée un chemin contigu de pions gagne la partie.\n");

		System.out.println("Appuyez sur Entrée pour revenir au menu précédent");
		
		sc.nextLine();
	}
	
	private void printMenu(){
		System.out.println("Entrez un des caractères suivants:");
		
		System.out.println("	n: commencer une nouvelle partie");
		if (this.estMenuSecondaire){
			System.out.println("	s: sauvegarder la partie en cours");
			System.out.println("	q: quitter la partie");
		}
		System.out.println("	l: (load) charger une partie");
		System.out.println("	h: (help) afficher l'aide");
		System.out.println("	r: afficher les règles du jeu de Hex");
	}
	
	public String menu(){
		String str;
		printMenu();
		str = sc.nextLine();
		while (!str.equals("n") ||
		(this.estMenuSecondaire && (!str.equals("s") || !str.equals("q"))) ||
		!str.equals("l") ||
		!str.equals("h") ||
		!str.equals("r")){
			System.out.print("saisie incorrecte. ");
			printMenu();
			str = sc.nextLine();
		}
		switch (str){
			case "h": this.help();
					break;
			case "r": this.regles();
					break;
			default	:return str;
		}
	}
	



public static void main(String[] args) {
		Boolean estMenuSecondaire = true;
		Menu menu = new Menu(estMenuSecondaire);
		menu.menu();
		menu.sc.close();
	}





}
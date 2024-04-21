import javax.swing.JOptionPane;

public class Java03 {
	
	public static int potenzRechnung(int basis, int zahl2) {
		int ergebnisp =1;
		for(int i= 0; i < zahl2; i++) {
			ergebnisp *= basis;
		}
		return ergebnisp;
		
		
	}
	
	public static int addition(int zahl1, int zahl2) {
		int ergebnisa = zahl1 + zahl2;
		return ergebnisa;
		
		
	}
	
	public static int subtraktion(int zahl1, int zahl2) {
		int ergebniss = zahl1 - zahl2;
		return ergebniss;
		
		
	}
	
	public static int division(int zahl1, int zahl2) {
		int ergebnisd = zahl1 / zahl2;
		return ergebnisd;
		
		
	}
	
	public static int multiplikation(int zahl1, int zahl2) {
		int ergebnism = zahl1 * zahl2;
		return ergebnism;
		
		
	}
	
	

	public static void main(String[] args) {
		int zahl1, zahl2, basis, ergebnisa, ergebnisb,ergebnisc,ergebnisd, ergebnisp;
		String operation;
		char operationsWahl;
		
		
		zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine zahl ein"));
		zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine zahl "));
		operation = JOptionPane.showInputDialog("a fuer Addition, s fuer Subtraktion, d fuer Division, m fuer Multiplikation, p fuer Potenz Rechnung");
		
		
		operationsWahl = operation.charAt(0);
		switch(operationsWahl) {
		case 'a':
			System.out.println("Sie haben die Addition gewaehlt");
			ergebnisa = addition(zahl1, zahl2);			
			System.out.println("Das Ergebnis betraegt:"+ ergebnisa);
			break;
			
		case 's':
			System.out.println("Sie haben die Subtraktion gewaehlt");
			ergebnisb = subtraktion(zahl1, zahl2);			
			System.out.println("Das Ergebnis betraegt:"+ ergebnisb);
			break;
		
		case 'd':
			System.out.println("Sie haben die Division gewaehlt");
			ergebnisc = division(zahl1, zahl2);			
			System.out.println("Das Ergebnis betraegt:"+ ergebnisc);
			break;
		case 'm':
			System.out.println("Sie haben die Multiplikation gewaehlt");
			ergebnisd = multiplikation(zahl1, zahl2);			
			System.out.println("Das Ergebnis betraegt:"+ ergebnisd);
			break;
		
		case 'p':
			System.out.println("Sie haben die Multiplikation gewaehlt");					
			ergebnisp = potenzRechnung(zahl1, zahl2);		
			System.out.println("Das Ergebnis betraegt:"+ ergebnisp);
			break;
		
			
		}
	}
		
		
		
		
		
		
		
			
	
	
	
}


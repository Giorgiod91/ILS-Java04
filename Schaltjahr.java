public class Java03 {

	public static void main(String[] args) {
		int jahresZahl;
		boolean schaltjahrJaOderNein;
		
		
		jahresZahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine JahresZahl ein"));
		System.out.println(jahresZahl);
		if((jahresZahl % 4 ==0 && jahresZahl % 100 !=0) || (jahresZahl % 4 ==0 && jahresZahl % 100 ==0 && jahresZahl % 400 ==0)) {
			schaltjahrJaOderNein = true;
			
			
			System.out.println("Das eingegebene Jahr:" + jahresZahl +" ist ein Schaltjahr");
			System.out.println(schaltjahrJaOderNein);
		}
		else {
			schaltjahrJaOderNein = false;
			System.out.println("Das eingegebene Jahr " + jahresZahl +"  ist kein Schaltjahr");
			System.out.println(schaltjahrJaOderNein);
			
		}

	}

}


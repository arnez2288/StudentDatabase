import java.util.*;

public class Pokedex {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				boolean bye = true;
				while(bye){
			
				
				String[] pokemon = {"Pikachu", "Charizard", "Mewtwo", "Lucario", "Snorlax"};
				String[] power = {"399", "598", "225", "359", "348"};
				String[] attack = {"Thunder Bolt", "Flame Thrower", "Shadow Ball", "Aura Sphere", "Hyper Beam"};
				
				System.out.println("Enter a number between 0 - 4 to choose a Pokemon");
				int select = sc.nextInt();
				sc.nextLine();
				
				try {			
				//	if (select < 5) {
				
				if (select == 0 ) {
					System.out.println(pokemon[select]);
					
				}else if (select == 1 ) {
					System.out.println(pokemon[select]);
					
				}else if (select == 2 ) {
					System.out.println(pokemon[select]);
				}else if (select == 3 ) {
					System.out.println(pokemon[select]);
				}else if (select == 4 ) {
					System.out.println(pokemon[select]);
				}else {
					System.out.println(pokemon[select]);
				}
				
				System.out.println("More Info");
				String moreInfo = sc.nextLine();
				String powerInfo = "Power";
				String attackInfo = "Attack";
				
				
				if (powerInfo.equalsIgnoreCase(moreInfo)) {
					System.out.println(pokemon[select]+ " power Level " + power[select]);
				}else if (attackInfo.equalsIgnoreCase(moreInfo))  {
					System.out.println(pokemon[select]+ " Special attack " + attack[select]);
				}
				System.out.println("Would you like to continue? (Yes or No)");
				String done = sc.nextLine();
				String complete = "No";
				if (complete.equalsIgnoreCase(done)) {	
					bye = false;
					sc.nextLine();
				}
					

		

					//	throw new IllegalArgumentException("Can't be a negative number!");
					}

				 catch (Exception e) {
					sc.next();
					e.printStackTrace();


					System.out.println("Contact Customer Service. Something went really, really wrong.");
				}
	 
		}sc.close();

	}
}
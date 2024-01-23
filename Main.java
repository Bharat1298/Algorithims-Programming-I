
public class Main {

	public static void main(String[] args) {
		Door[] doors = new Door[3];
		
	    doors[0] = new Door();
	    doors[0].setName("Side");
	    doors[0].open();

	    
	    doors[1] = new Door();
	    doors[1].setName("Front");
	    doors[1].close();
	    
	    doors[2] = new Door();
	    doors[2].setName("Back");
	    doors[2].close();
	    
		for(Door door : doors) {
			door.output();
		}
		
		System.out.println("\nSwtiched States:");
	    
		for(Door door : doors) {
			if (door.isOpen()) {
				door.close();
			}else {
				door.open();
			}
			door.output();
		}

	}

}

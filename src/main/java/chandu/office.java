package chandu;

public enum office {
	
	WAITING_LOBBY (4,"used for visitors seating"),TRAINING_ROOM(20,"New employees were trained in the technology"),
	CONFERENCE_ROOM(6,"For meetings"),CAFETERIA(15,"for having coffee, tea or any food "),
	MANAGER_ROOM(1,"For the manager");
	
	String usage;
	int people;
	
	office(int people,String usage){
		this.usage=usage;
		this.people=people;
	}

}

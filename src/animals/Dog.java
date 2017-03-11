package animals;

class Dog extends Mammal implements Predator, Carnivore,Scavenger{
	void speak(){
		System.out.println("The dog says,\"bark.\"");
	}
    public void hunt(){
    }
    public void eat(Object freshMeat){
    }
    public void eat(Object caerrion, boolean tooOld){
    	if (tooOld){
    		
    	} else {
    	}
    }
}

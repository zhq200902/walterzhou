package test;

public class Person implements Comparable<Person>{
String firstName;
String lastName;
public Person (String firstName,String lastName){
	this.firstName = firstName;
	this.lastName= lastName;
}
public boolean equals( Person p){
	if (p==null){
		return false;
	}
	if (p==this){
		return true;
	}
	if (!(p instanceof Person)){
		return false;
	}
	if (p.lastName.equals(this.lastName)
			&& p.firstName.equals(this.firstName)){
		return true;
	} else {
		return false;
		
	}
	}
public int hashcode(){
	int result=17;
	result *=firstName.hashCode()*37;
	result *=lastName.hashCode()*37;
	return result;
	
}
@Override
public int compareTo(Person p) {
	// TODO Auto-generated method stub
	int thisTotal = firstName.hashCode() + lastName.hashCode();
	int pTotal = p.firstName.hashCode() + p.lastName.hashCode();
	if (thisTotal>pTotal){
		return 1;
	}
	if (thisTotal < pTotal){
		return -1;
	}
	   return 0;
}
}

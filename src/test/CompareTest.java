package test;

public class CompareTest {
  public static void main(String[] args){
	  Person samSpade = new Person("Sam","Spade");
	  Person greaNoirDetective = new Person("Sam","Spade");
	System.out.println(samSpade == greaNoirDetective);
	  System.out.println(samSpade.equals(greaNoirDetective));
  }
}


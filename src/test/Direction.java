package test;

public enum Direction {
 north (0),
 east (90),
 south (180),
 west (270);
	private final int degrees;
	Direction (int degrees){
		this.degrees=degrees;
	}
	public int getDegrees(){
		return degrees;
	}
	public static Direction findCardinalDirection(int degrees){
		if (degrees < 45) {
			return north;
		} else if (degrees < 135) {
		  return east;
		} else if (degrees < 225) {
		  return south;
		} else if (degrees < 315) {
		  return west;
		} else {
	      return north;
		}	
	}
}

package _06_duck;

public class duck {
int numberOfFriends;
String favoriteFood;
	
	
	
duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}






void quack() {
	System.out.println("QUACK");
}
	

void waddle() {
	System.out.println("You see a quack waddling, but then it trips and falls into a lake");
}
	

}

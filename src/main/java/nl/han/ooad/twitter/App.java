package nl.han.ooad.twitter;

public class App {
	public static void main(String[] args) {
		// Init all observables
		TwitterUser michel = new Teacher("Michel");
		TwitterUser joost = new Teacher("Joost");
		TwitterUser mark = new Teacher("Mark");

		// Init all observers
		Follower luuk = new Student("Luuk");
		Follower marco = new Teacher("Marco");
		Follower barbara = new Student("Barbara");
		Follower ingrid = new Student("Ingrid");

		// Add observers to observables
		michel.addFollower(luuk);
		joost.addFollower(luuk);
		joost.addFollower(marco);
		joost.addFollower(barbara);
		mark.addFollower(barbara);
		mark.addFollower(ingrid);

		// observe
		michel.tweet("Vandaag mag ik bij OOAD eindelijk IntelliJ gebruiken!");
		joost.tweet("Op enig moment in tijd");
		mark.tweet("De voorbeelden op pluralsight zijn beter");
		
	}
}

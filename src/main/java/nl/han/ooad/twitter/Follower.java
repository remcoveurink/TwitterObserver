package nl.han.ooad.twitter;

public abstract class Follower implements IFollower{

	protected String lastTweet = null;
	protected String name;

	public Follower(String name){
		this.name=name;
	}

	public void update(TwitterUser user, String tweet) {
		lastTweet = "("+this.name+") - @" + user.getId() + " tweets: " + tweet;
		System.out.println(lastTweet);
	}

	public String getLastTweet(){
		return lastTweet;
	}


}

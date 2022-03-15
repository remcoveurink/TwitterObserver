package nl.han.ooad.twitter;

public interface Follower {
	void update(TwitterUser user, String tweet);
	public String getLastTweet();
}

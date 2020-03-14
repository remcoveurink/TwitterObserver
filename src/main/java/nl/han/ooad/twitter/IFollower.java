package nl.han.ooad.twitter;

public interface IFollower {
	void update(TwitterUser user, String tweet);
	public String getLastTweet();
}

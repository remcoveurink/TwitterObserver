package nl.han.ooad.twitter;

import java.util.ArrayList;

public class TwitterUser {

	protected String id;
	private TweetDateFormatter dateFormatter = new TweetDateFormatter();
	private ArrayList<Follower> followers = new ArrayList<Follower>();
	
	String lastTweet = null;
	
	public TwitterUser(String id) {
		this.id = id;
	}

	public void tweet(String tweet) {
		lastTweet = "@" + id + ": " + tweet + " "
				+ dateFormatter.formattedTweetDate();
		System.out.println(lastTweet);
		notifyFollowers(tweet);
	}

	public String getId() {
		return id;
	}

	private void notifyFollowers(String tweet) {
		for (Follower follower : followers) {
			follower.update(this, tweet);
		}
	}

	public void addFollower(Follower follower) {
		followers.add(follower);
	}

	public void removeFollower(Follower follower) {
		followers.remove(follower);
	}

	public void setDateFormatter(TweetDateFormatter dateFormatter) {
		this.dateFormatter = dateFormatter;
	}

}
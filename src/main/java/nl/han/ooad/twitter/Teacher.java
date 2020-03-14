package nl.han.ooad.twitter;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class Teacher extends TwitterUser implements IFollower {

    public Teacher(String id) {
        super (id);
    }


    public void update(TwitterUser user, String tweet) {
        lastTweet = "("+this.id+") - @" + user.getId() + " tweets: " + tweet;
    }

    public String getLastTweet(){
        return lastTweet;
    }

    // More teacher stuff
}

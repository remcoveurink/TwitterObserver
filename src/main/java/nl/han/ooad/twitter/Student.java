package nl.han.ooad.twitter;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 * Updated by Remco Veurink on 15-03-22.
 */
public class Student implements Follower {
    protected String lastTweet = null;
    protected String name;

    public Student(String name){
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

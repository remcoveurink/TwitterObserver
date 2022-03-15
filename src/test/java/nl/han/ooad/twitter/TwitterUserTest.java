package nl.han.ooad.twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TwitterUserTest {

	private TwitterUser user;

	@Before
	public void setup() throws ParseException{
		this.user = new TwitterUser("user");
		TweetDateFormatter formatter = Mockito.mock(TweetDateFormatter.class);
		when(formatter.formattedTweetDate()).thenReturn("13.03.2020");
		user.setDateFormatter(formatter);
	}
	
	@Test
	public void testTweetNoFollowers() {
		user.tweet("msg");
		assertEquals("@user: msg 13.03.2020",user.lastTweet);
	}

	@Test
	public void testOneTeacher() {
		Follower follower = new Teacher("f");
		user.addFollower(follower);
		user.tweet("msg");
		assertEquals("(f) - @user tweets: msg", follower.getLastTweet());
	}
	
	@Test
	public void testRemoveStudent() {
		Follower follower = new Student("f");
		user.addFollower(follower);
		user.tweet("msg");
		assertEquals("(f) - @user tweets: msg", follower.getLastTweet());
		user.removeFollower(follower);
		user.tweet("msg2");
		assertEquals("(f) - @user tweets: msg", follower.getLastTweet());
	}
	
	@Test
	public void testTwoFollowers() {
		Follower follower1 = new Student("f");
		user.addFollower(follower1);
		
		Follower follower2 = new Teacher("g");
		user.addFollower(follower2);
		
		user.tweet("msg");
		assertEquals("(f) - @user tweets: msg", follower1.getLastTweet());
		assertEquals("(g) - @user tweets: msg", follower2.getLastTweet());
	}
	
	

}

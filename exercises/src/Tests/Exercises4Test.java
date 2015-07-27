package Tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import exercises.Ex4Person;


public class Exercises4Test {
	
	Ex4Person ex4;

	@Test
	public void getNameTest() {
		Ex4Person jim = new Ex4Person("Jim");
		assertEquals(jim.getName(), "Jim");
	}
	
	@Test
	public void addLikesTest() {
		Ex4Person jim = new Ex4Person("Jim");
		assertEquals(jim.getLikes(), 0);
		jim.addLike();
		assertEquals(jim.getLikes(), 1);
		jim.addLike();
		assertEquals(jim.getLikes(), 2);
	}
	
	@Test
	public void addFriendTest() {
		Ex4Person jim = new Ex4Person("Jim");
		Ex4Person ray = new Ex4Person("Ray");
		Ex4Person kerry = new Ex4Person("Kerry");
		
		jim.addFriend(ray);
		jim.addFriend(kerry);
		
		List<Ex4Person> friends = jim.getFriends();
		assertEquals(friends.size(), 2);
		assertTrue(friends.contains(ray));
		assertTrue(friends.contains(kerry));
	}
	
	@Test
	public void addFriendShouldNotContainDuplicatesTest() {
		Ex4Person jim = new Ex4Person("Jim");
		Ex4Person ray = new Ex4Person("Ray");
		Ex4Person ray2 = new Ex4Person("Ray");
		
		jim.addFriend(ray);
		jim.addFriend(ray);
		jim.addFriend(ray2);
		
		List<Ex4Person> friends = jim.getFriends();
		assertEquals(friends.size(), 2);
		assertTrue(friends.contains(ray));
		assertTrue(friends.contains(ray2));
	}
	
	@Test
	public void addFriendShouldNotAddYourselfTest() {
		Ex4Person jim = new Ex4Person("Jim");
		
		jim.addFriend(jim);
		
		List<Ex4Person> friends = jim.getFriends();
		assertEquals(friends.size(), 0);
		assertFalse(friends.contains(jim));
	}
	
	@Test
	public void hasFriendTest() {
		Ex4Person jim = new Ex4Person("Jim");
		Ex4Person ray = new Ex4Person("Ray");
		Ex4Person kerry = new Ex4Person("Kerry");
		Ex4Person kerry2 = new Ex4Person("Kerry");
		
		jim.addFriend(ray);
		jim.addFriend(kerry);
		
		assertTrue(jim.hasFriend(ray));
		assertTrue(jim.hasFriend(kerry));
		assertFalse(jim.hasFriend(kerry2));
	}
	
	@Test
	public void hasFriendWithNameTest() {
		Ex4Person jim = new Ex4Person("Jim");
		Ex4Person ray = new Ex4Person("Ray");
		Ex4Person kerry = new Ex4Person("Kerry");
		
		jim.addFriend(ray);
		jim.addFriend(kerry);
		
		assertTrue(jim.hasFriendWithName("Ray"));
		assertTrue(jim.hasFriendWithName("Kerry"));
		assertFalse(jim.hasFriendWithName("Jim"));
	}
	
	@Test
	public void getMutualFriendsTest() {
		Ex4Person me = new Ex4Person("Me");
		Ex4Person friend1 = new Ex4Person("Friend1");
		Ex4Person friend2 = new Ex4Person("Friend2");
		Ex4Person nonMutualFriend = new Ex4Person("NonMutualFriend");
		
		me.addFriend(friend1);
		me.addFriend(friend2);
		me.addFriend(nonMutualFriend);
		friend1.addFriend(me);
		friend2.addFriend(me);
		
		List<Ex4Person> mutuals = me.getMutualFriends();
		
		assertEquals(mutuals.size(), 2);
		assertTrue(mutuals.contains(friend1));
		assertTrue(mutuals.contains(friend2));
		assertFalse(mutuals.contains(nonMutualFriend));
	}
}

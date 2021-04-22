package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	SongsDatabase songsDatabase;
	@BeforeEach
	void setUp() {
		songsDatabase = new SongsDatabase();
	}

	@AfterEach
	void tearDown() throws Exception {
		songsDatabase = null;
	}

	@Test
	@DisplayName ("Test for adding song to database")
	void addSongtest() {
		songsDatabase.addSong("afrobeats", "Burnaboy - Collateral Damage");
		assertEquals(songsDatabase.getDatabase().toString(), "{afrobeats=[Burnaboy - Collateral Damage]}");	
	}
	
	@Test
	@DisplayName ("Test for method to get song by giving genre")
	void getSongTest() {
		songsDatabase.addSong("afrobeats", "Burnaboy - Collateral Damage");
		System.out.println(songsDatabase.getSongs("afrobeats").toString());
		assertEquals(songsDatabase.getSongs("afrobeats").toString(), "[Burnaboy - Collateral Damage]");
		assertEquals(songsDatabase.getSongs("pop").toString(), "[]");
	}
	
	@Test
	@DisplayName ("Test for method to find genre given song")
	void getGenreOfSongtTest() {
		songsDatabase.addSong("afrobeats", "Burnaboy - Collateral Damage");
		songsDatabase.addSong("afrobeats", "Davido -If");
		songsDatabase.addSong("rap", "Cardi B - Up");
		assertEquals(songsDatabase.getGenreOfSong("Davido -If"), "afrobeats");
		assertEquals(songsDatabase.getGenreOfSong("yawa"), "Doesn't Exist");

		
	}



}

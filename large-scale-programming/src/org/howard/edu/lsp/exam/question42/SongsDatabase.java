package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	private Map<String, Set<String>> map = 
			new HashMap<String, Set<String>>();

	/**
	 * Adds a song to the hashmap given the genre and songtitle
	 * @param genre
	 * @param songTitle
	 */
	public Map<String, Set<String>> getDatabase() {
		return this.map;
	}

	public void addSong(String genre, String songTitle) {
		if (map.containsKey(genre)) {
			map.get(genre).add(songTitle);

		}
		else {
			Set<String> set = new HashSet<String>();
			set.add(songTitle);
			map.put(genre, set);
		}
	}

	/**
	 * returns a set of songs even the genre. if the genre doesn't exist in the hashmap, an empty set is returned
	 * @param genre
	 * @return set of songs
	 */

	public Set<String> getSongs(String genre) {
		if (map.containsKey(genre)) {
			return map.get(genre);
		}
		else {
			Set<String> set = new HashSet<String>();
			return set;
		}
	}

	/**
	 * returns the genre of a particular song
	 * @param songTitle
	 * @return genre
	 */
	public String getGenreOfSong(String songTitle) {
		for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
			for (String title: entry.getValue()) {
				if (title == songTitle) {
					return entry.getKey();
				}
			}
		}
		return "Doesn't Exist";
	}
}

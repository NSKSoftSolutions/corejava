package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

import com.businesslayer.Movie;
import com.businesslayer.NameCompare;
import com.businesslayer.RatingCompare;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.5, 2015));
		list.add(new Movie("Star Wars", 9.7, 1977));
		list.add(new Movie("Empire Strikes Back", 6.8, 1980));
		list.add(new Movie("Return of the Jedi", 5.4, 1983));

		Collections.sort(list);

		for (Movie m : list) {
			System.out.println(m.getName() + "\n" + m.getRating() + " \n" + m.getYear());
		}

		RatingCompare r = new RatingCompare();
		// Rating compare
		Collections.sort(list, r);

		System.out.println("After sorting done through Rating");

		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

		NameCompare nc = new NameCompare();

		Collections.sort(list, nc);
		System.out.println("After sorting done Through Name");

		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

	}
}

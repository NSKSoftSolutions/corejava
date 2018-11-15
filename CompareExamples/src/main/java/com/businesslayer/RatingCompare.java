package com.businesslayer;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

	public int compare(Movie o1, Movie o2) {

		if (o1.getRating() < o2.getRating())
			return -1;
		if (o1.getRating() > o2.getRating())
			return 1;
		else
			return 0;
	}

}

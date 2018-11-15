package com.businesslayer;

public class Movie implements Comparable<Movie> {

	private String name;
	private double rating;
	private int year;

	public Movie(String nm, double rt, int yr) {

		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// getter m
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public int compareTo(Movie o) {

		return (this.name.compareTo(o.name));
	}

}

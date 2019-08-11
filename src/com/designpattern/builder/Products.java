package com.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Products {

	private List<String> parts = new ArrayList<>();

	public void addPart(String part) {
		parts.add(part);
	}

	public void getParts() {
		StringBuilder sb = new StringBuilder();
		for (String p : parts) {
			sb.append(p);
		}
		System.out.println(sb.toString());
	}
}

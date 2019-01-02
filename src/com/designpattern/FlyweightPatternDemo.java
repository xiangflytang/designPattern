package com.designpattern;

public class FlyweightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomx());
			circle.setY(getRandomy());
			circle.setRadius(100);
	         circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomx() {
		return (int) Math.random() * 100;
	}

	private static int getRandomy() {
		return (int) Math.random() * 100;
	}

}

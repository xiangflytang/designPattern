package com.designpattern.factory;

public class CircleFactory extends ShapeFactory{

	@Override
	public Shape getShape() {
		return new Circle();
	}
}
class RectangleFactory extends ShapeFactory{

	@Override
	public Shape getShape() {
		return new Rectangle();
	}
}

class SquareFactory extends ShapeFactory{

	@Override
	public Shape getShape() {
		return new Square();
	}
}

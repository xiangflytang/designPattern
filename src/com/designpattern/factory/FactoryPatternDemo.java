package com.designpattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// 获取 Circle 的对象，并调用它的 draw 方法
		ShapeFactory shapeFactory = new CircleFactory();
		Shape shape1 = shapeFactory.getShape();
		shape1.draw();

		// 获取 Rectangle 的对象
		ShapeFactory shapeFactory1 = new RectangleFactory();
		Shape shape2 = shapeFactory1.getShape();
		shape2.draw();
		
		// 获取Square 的对象
		ShapeFactory shapeFactory2 = new SquareFactory();
		Shape shape3 = shapeFactory2.getShape();
		shape3.draw();

	}
}
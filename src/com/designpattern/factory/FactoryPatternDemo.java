package com.designpattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// ��ȡ Circle �Ķ��󣬲��������� draw ����
		ShapeFactory shapeFactory = new CircleFactory();
		Shape shape1 = shapeFactory.getShape();
		shape1.draw();

		// ��ȡ Rectangle �Ķ���
		ShapeFactory shapeFactory1 = new RectangleFactory();
		Shape shape2 = shapeFactory1.getShape();
		shape2.draw();
		
		// ��ȡSquare �Ķ���
		ShapeFactory shapeFactory2 = new SquareFactory();
		Shape shape3 = shapeFactory2.getShape();
		shape3.draw();

	}
}
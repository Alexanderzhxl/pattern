package com.alex.pattern.b4_visitor;

public class ComputerPartDisplayVisitor implements IComputerPartVisitor {

	@Override
	public void visit(Mouse mouse) {
		System.out.println("MOUSE");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("COMPUTER");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("KEYBOARD");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("MONITOR");
	}

}

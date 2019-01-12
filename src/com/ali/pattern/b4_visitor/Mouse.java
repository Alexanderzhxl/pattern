package com.ali.pattern.b4_visitor;

public class Mouse implements IComputerPart {

	@Override
	public void accept(IComputerPartVisitor visotor) {
		visotor.visit(this);
	}

}

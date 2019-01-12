package com.ali.pattern.b4_visitor;

public interface IComputerPartVisitor {

	void visit(Mouse mouse);
	void visit(Computer computer);
	void visit(Keyboard keyboard);
	void visit(Monitor monitor);
}

package com.alex.pattern.b4_visitor;

public interface IComputerPart {

	void accept(IComputerPartVisitor visitor);
}

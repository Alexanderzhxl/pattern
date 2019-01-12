package com.ali.pattern.b4_visitor;

public interface IComputerPart {

	void accept(IComputerPartVisitor visitor);
}

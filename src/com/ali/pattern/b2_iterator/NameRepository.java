package com.ali.pattern.b2_iterator;

public class NameRepository implements IContainer {

	public String[] names = { "alex", "jack" };

	@Override
	public IIterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements IIterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (hasNext()) {
				return names[index++];
			}
			return null;
		}

	}
}

package com.ericsson;

//Understands size of length between two points

public class Distance {

	private final Unit unit;
	private final double value;

	public Distance(double value, Unit unit) {

		this.unit = unit;
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Distance other = (Distance) obj;

		double firstMeasure = this.unit.convert(other.unit, this.value);

		return firstMeasure == other.value;

	}

	@Override
	public String toString() {
		return "Unit=" + this.unit + " measure=" + this.value;

	}

	public class InnerClass {
		public static final String TEST = "TEST";
	}

}

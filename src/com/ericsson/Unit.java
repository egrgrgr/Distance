package com.ericsson;

public class Unit {

	private static final int FEET_BASE_CONVERSION_FACTOR = 1;
	private static final int YARD_BASE_CONVERSION_FACTOR = 3;
	private static final int METRE_BASE_CONVERSION_FACTOR = 6;

	public static final Unit YARD = new Unit(YARD_BASE_CONVERSION_FACTOR);
	public static final Unit FEET = new Unit(FEET_BASE_CONVERSION_FACTOR);
	public static final Unit METRE = new Unit(METRE_BASE_CONVERSION_FACTOR);

	private final double baseConversionFactor;

	private Unit(double baseConversionFactor) {
		this.baseConversionFactor = baseConversionFactor;
	}

	public double convert(Unit unitTo, double value) {
		double baseValue = this.baseConversionFactor * value;
		return baseValue / unitTo.baseConversionFactor;
	}

}

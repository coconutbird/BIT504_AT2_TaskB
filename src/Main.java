public class Main {
    // conversion units for US customary to metric
    // https://blog.ansi.org/2018/06/us-customary-system-conversion-metric/
    private static final double US_FOOT_METER = 0.3048f;
    private static final double US_YARD_METER = 0.91f;
    private static final double US_MILE_METER = 1610f;

    // conversion units for metric to US customary
    // https://cf.linnbenton.edu/eit/auto/krolicp/upload/convert_metric.pdf
    private static final double METER_US_FOOT = 3.28084f;
    private static final double METER_US_YARD = 1.0936f;
    private static final double METER_US_MILE = 1609.35f;

    private static double feetToMeters(double feet) {
        return feet * US_FOOT_METER;
    }

    private static double yardsToMeters(double yards) {
        return yards * US_YARD_METER;
    }

    private static double milesToMeters(double miles) {
        return miles * US_MILE_METER;
    }

    private static double metersToFeet(double meters) {
        return meters * METER_US_FOOT;
    }

    private static double metersToYards(double meters) {
        return meters * METER_US_YARD;
    }

    private static double metersToMiles(double meters) {
        return meters * METER_US_MILE;
    }

    public static void main(String[] args) {
        System.out.printf("METERS PER FOOT: %fm\n", feetToMeters(1));
        System.out.printf("METERS PER YARD: %fm\n", yardsToMeters(1));
        System.out.printf("METERS PER MILE: %fm\n", milesToMeters(1));

        System.out.printf("FEET PER METER: %fm\n", metersToFeet(1));
        System.out.printf("YARDS PER METER: %fm\n", metersToYards(1));
        System.out.printf("MILES PER METER: %fm\n", metersToMiles(1));
    }
}
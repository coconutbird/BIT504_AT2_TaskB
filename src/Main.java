public class Main {
    // conversion units for metric to US customary
    // https://blog.ansi.org/2018/06/us-customary-system-conversion-metric/
    private static final double US_FOOT_METER = 0.3048f;
    private static final double US_YARD_METER = 0.91f;
    private static final double US_MILE_METER = 1610f;

    private static double feetToMeters(double feet) {
        return feet * US_FOOT_METER;
    }

    private static double yardsToMeters(double yards) {
        return yards * US_YARD_METER;
    }

    private static double milesToMeters(double miles) {
        return miles * US_MILE_METER;
    }

    public static void main(String[] args) {
        System.out.printf("METERS PER FOOT: %fm\n", feetToMeters(1));
        System.out.printf("METERS PER YARD: %fm\n", yardsToMeters(1));
        System.out.printf("METERS PER MILE: %fm\n", milesToMeters(1));
    }
}
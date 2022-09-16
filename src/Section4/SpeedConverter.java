package Section4;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour)
    {

        if(kilometersPerHour >= 0) return Math.round(kilometersPerHour / 1.609d);
        return -1;
    }


    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            //"Invalid Value"
            System.out.println("Invalid Value");
        }
        else {
            //"XX km/h = YY mi/h".
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}

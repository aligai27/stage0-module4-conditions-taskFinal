package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide >= secondSide + thirdSide) {
            System.out.println("it's not a triangle");
        } else if (secondSide >= firstSide + thirdSide) {
            System.out.println("it's not a triangle");
        } else if (thirdSide >= firstSide + secondSide) {
            System.out.println("it's not a triangle");
        } else {
            System.out.println("this is a valid triangle");
        }

    }
}

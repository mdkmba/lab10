/**
 * Created by marcking2 on 7/23/17.
 */
public class UsedCar extends Car2 {


//    private String makeM;
//    private String modelM;
//    private int  yearM;
//    private double priceM;
protected double mileageM;

    public UsedCar() {      //!!!! look up use of "super" to bring in constructor values
        makeM = "";
        modelM = "";
        yearM = 0;
        priceM = 0;
        mileageM = 0;

    }

    public UsedCar(String make, String model, int year, double price, double mileage) {
        makeM = make;
        modelM = model;
        yearM = year;
        priceM = price;
        mileageM = mileage;
    }

    public double getMileage() {
        return mileageM;
    }

    public void setMileage(double mileage) {
        mileageM = mileage;
    }

    public String toString() {

        String result = "";

        System.out.printf("%-12s%-12s%-12d$%,-17.2f%,-18.1f", makeM, modelM, yearM, priceM, mileageM);

        return result;
    }

}

/**
 * Created by marcking2 on 7/23/17.
 */
public class Car2 {


    protected String makeM;
    protected String modelM;
    protected int  yearM;
    protected double priceM;

    public Car2() {
        makeM = "";
        modelM = "";
        yearM = 0;
        priceM = 0;
    }

    public Car2(String make, String model, int year, double price) {
        makeM = make;
        modelM = model;
        yearM = year;
        priceM = price;
    }

    public String getMakeM() {
        return makeM;
    }

    public String getModelM() {
        return modelM;
    }

    public int getYearM() {
        return yearM;
    }

    public double getPriceM() {return priceM;

    }

    public void setMakeM(String make) {

        makeM = make;
    }

    public void setModelM(String model) {

        modelM = model;
    }

    public void setYearM(int year) {

        yearM = year;
    }

    public void setPriceM(double price) {
        priceM = price;
    }

    public String toString() {

        String result = "";
//        System.out.printf("\n\n\n%-12s%-12s%-12s%-12s\n", "Make", "Model", "Year", "Price(USD)", Mileage (if used));
        System.out.printf("%-12s%-12s%-12d$%,-18.2f", makeM, modelM, yearM, priceM);
        return result;
    }
}
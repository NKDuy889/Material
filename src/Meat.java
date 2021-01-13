import java.time.LocalDate;
import java.util.Scanner;

public class Meat extends Material {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * super.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate dateDay = super.getManufacturingDate().plusDays(7);
        return dateDay;
    }

    @Override
    public void addMaterial(Scanner sc) {
        super.addMaterial(sc);
        System.out.println("Enter weight: ");
        setWeight(sc.nextDouble());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
        double moneyReal = 0;
        LocalDate dateNow = LocalDate.now();
        int monthNow = dateNow.getMonthValue();
        LocalDate dateSanXuat = super.getManufacturingDate();
        int monthSanXuat = dateSanXuat.getMonthValue();
        int minusMonth = monthNow - monthSanXuat;
        if (minusMonth <= 4) {
            moneyReal = (getAmount() * 0.05) + (getAmount() * 0.05 * 0.2);
        } else if (4 < minusMonth && minusMonth <= 6) {
            moneyReal = (getAmount() * 0.05) + (getAmount() * 0.05 * 0.4);
        } else {
            moneyReal = 0;
        }
        return moneyReal;
    }
}

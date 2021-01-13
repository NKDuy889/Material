import java.time.LocalDate;
import java.util.Scanner;

public class CrispyFlour extends Material {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * super.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate dateYear = super.getManufacturingDate().plusYears(1);
        return dateYear;
    }

    @Override
    public void addMaterial(Scanner sc) {
        super.addMaterial(sc);
        System.out.println("Enter quantity: ");
        setQuantity(sc.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public double getRealMoney() {
        double moneyReal = 0;
        LocalDate dateNow = LocalDate.now();
        int dayNow = dateNow.getDayOfMonth();
        LocalDate dateSanXuat = super.getManufacturingDate();
        int daySanXuat = dateSanXuat.getDayOfMonth();
        int minusDay = dayNow - daySanXuat;
        if (minusDay <= 7) {
            moneyReal = (getAmount() * 0.1) + (getAmount() * 0.1 * 0.3);
        } else if (7 < minusDay && minusDay <= 15) {
            moneyReal = (getAmount() * 0.1) + (getAmount() * 0.1 * 0.5);
        } else {
            moneyReal = 0;
        }
        return moneyReal;
    }
}

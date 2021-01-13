import java.time.LocalDate;
import java.util.Scanner;

public abstract class Material implements Discount {
    private int id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void addMaterial(Scanner sc) {
        System.out.println("Enter id: ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter a name: ");
        setName(sc.next());
        System.out.println("Enter manufacturing date(yyyy-MM-dd): ");
        String date = sc.next();
        setManufacturingDate(LocalDate.parse(date));
        System.out.println("Enter cost: ");
        setCost(sc.nextInt());
        sc.nextLine();
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost;
    }
}

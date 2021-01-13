import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialManagement {
    Scanner sc = new Scanner(System.in);
    List<Material> list = new ArrayList<>();

    public void addCrispyFlour() {
        for (int i = 0; i < 2; i++) {
            CrispyFlour c = new CrispyFlour();
            c.addMaterial(sc);
            list.add(c);
        }
    }

    public void addMeat() {
        for (int i = 0; i < 2; i++) {
            Meat m = new Meat();
            m.addMaterial(sc);
            list.add(m);
        }
    }

    public void addAll() {
        addCrispyFlour();
        addMeat();
    }

    public void showList() {
        for (Material e : list) {
            System.out.println(e);
        }
    }

    public void count(Scanner sc){
        System.out.println("Enter id: ");
        int id = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                System.out.println("total money: " + list.get(i).getRealMoney());
            }
        }
    }
}

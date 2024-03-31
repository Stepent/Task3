import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Melee> melee_all = new ArrayList<>();
        melee_all.add(new Melee("Мечник",50,5,1,8,3,10));
        System.out.print(melee_all.getFirst().toString());
    }
}


public class BonusMilesService {

    public int calculate (int amount) {

        System.out.println("Итоговый миль за пакупки");

        boolean b = amount >= - 20;

        int bonus;
        if (b) {
            bonus = (amount/20);
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
        return bonus;




    }
}

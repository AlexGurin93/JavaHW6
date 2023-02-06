import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Project {
    public static void main(String[] args) {
        noteBook notebook1 = new noteBook("Asus", "4", "1000", "Windows", "grey");
        noteBook notebook2 = new noteBook("Asus", "4", "1000", "Linux", "black");
        noteBook notebook3 = new noteBook("Asus", "4", "2000", "Windows", "black");
        noteBook notebook4 = new noteBook("Asus", "16", "1000", "Windows", "grey");
        noteBook notebook5 = new noteBook("Huawei", "8", "1000", "Windows", "black");

        Set<noteBook> noteBooks = new HashSet<>(List.of(notebook1, notebook2,
                notebook3, notebook4, notebook5));

        Map<String, String> sel = selectCriteria();
        sort(sel, noteBooks);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriteria = new HashMap<>();
        while (true) {
            System.out.println("Вы хотите выбрать критерий? Если да введите 'y', если нет введите 'n'");
            String question = scanner();
            if (question.equals("n")) {
                break;
            } else {

                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
                String key = scanner();
                System.out.println("Введите значения для выбранного критерия: ");
                String value = scanner();

                resultCriteria.put(key, value);
            }
        }
        System.out.println(resultCriteria);
        return resultCriteria;

    }

    public static void sort(Map<String, String> criteria, Set<noteBook> notebooks) {

        Set<noteBook> temp = new HashSet<>(notebooks);
        for (noteBook notebook : notebooks) {

            for (Object pair : criteria.keySet()) {

                if (pair.equals("1") && !notebook.getName().equals(criteria.get(pair))) {
                    temp.remove(notebook);
                }
                for (Object pair1 : criteria.keySet()) {

                    if (pair1.equals("2") && !notebook.getRam().equals(criteria.get(pair1))) {
                        temp.remove(notebook);

                    }
                    for (Object pair2 : criteria.keySet()) {

                        if (pair2.equals("3") && !notebook.getHardDisk().equals(criteria.get(pair2))) {
                            temp.remove(notebook);

                        }
                        for (Object pair3 : criteria.keySet()) {

                            if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criteria.get(pair3))) {
                                temp.remove(notebook);

                            }
                            for (Object pair4 : criteria.keySet()) {

                                if (pair4.equals("5") && !notebook.getColor().equals(criteria.get(pair4))) {
                                    temp.remove(notebook);

                                }
                            }
                        }
                    }
                }
            }

        }
        if (temp.isEmpty()) {
            System.out.println("ничего не найдено!");
        } else {
            System.out.println("мы можем предложить: \n" + temp);
        }

    }
}

public class Inicial {
    static Employee[] employees = new Employee[10];
    static String[] wordListSecond = {"Джонсон", "Уильямс", "Джонс", "Браун", "Дэвис", "Миллер", "Уилсон",
            "Мур", "Тейлор", "Андерсон", "Томас", "Джексон", "Уайт", "Харрис", "Мартин", "Томпсон",
            "Гарсиа", "Мартинес", "Робинсон", "Кларк", "Родригес", "Льюис", "Клинтон", "Трамп", "Буш", "байден"};
    static String[] wordListFirst = {"Джон", "Роберт", "Майкл", "Вильям", "Дэвид", "Ричард", "Чарльз", "Джозеф",
            "Томас", "Кристофер", "Даниэль", "Пол", "Марк", "Дональд", "Джордж", "Кеннет", "Стивен", "Эдвард",
            "Брайан", "Рональд", "Энтони", "Кевин", "Джейсон", "Мэтью", "Дэнни", "Билл"};

    static void inicial() {
        for (int i = 0; i < employees.length; i++) {
            int firstLentgh = wordListFirst.length;
            int secondLentgh = wordListSecond.length;
            int rand1 = (int) (Math.random() * firstLentgh);
            int rand2 = (int) (Math.random() * secondLentgh);
            String phase = wordListFirst[rand1] + " " + wordListSecond[rand2];
            employees[i] = new Employee(phase, (int) (Math.random() * 20000) + 10000, (int) (Math.random() * 5) + 1);
        }
    }
}
public class Main {


    public static void main(String[] args) {

        Inicial.inicial();
        printEmployee();
        //адрес ссылкы на строку сотрудника в массиве с наименьшей зарплатой
        var employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println(String.format("Минимальная зарплата у сотрудника %s и составляет %s",
                employeeWithMinSalary.getFullName(), employeeWithMinSalary.getSalary()));
        //адрес ссылки на строку сотрудника в массиве с наибольшей зарплатой
        var employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println(String.format("Максимальная зарплата у сотрудника %s и составляет %s", employeeWithMaxSalary,
                employeeWithMaxSalary));
        //вариант 2 begin
        // номер  строки в массиве где располжене сотрудник с минимальной зарплатой
        System.out.println("*************   Вариант 2  Начало***********");
        System.out.println("Минимальная зарплата=" + Inicial.employees[linePersonMinSalaryEmployee()].getSalary() +
                " у сотрудника " + Inicial.employees[linePersonMinSalaryEmployee()].getFullName());
        System.out.println("Максимальная зарплата=" + Inicial.employees[linePersonMaxSalaryEmployee()].getSalary() +
                " у сотрудника " + Inicial.employees[linePersonMaxSalaryEmployee()].getFullName());
        // номер  строки в массиве где располжен сотрудник с максимальной зарплатой
        System.out.println("*************   Вариант 2  Окончание***********");
        //вариант 2 end
        System.out.println("сумму затрат на ЗП в месяц=" + getSalarySum());

        System.out.println("среднее значение зарплат=" + avarageSalaryEmployee());

        printEmploeesFullName();
    }

    private static int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < Inicial.employees.length; i++) {
            sum += Inicial.employees[i].getSalary();
        }
        return sum;
    }

    private static double avarageSalaryEmployee() {

        return (double) (getSalarySum() / Inicial.employees.length);

    }

    //ищем номер строки в массиве  ссылок  сотрудника с минимальной зарплатой
    private static int linePersonMinSalaryEmployee() {
        int minSalaryEmployee = Inicial.employees[0].getSalary();
        int linePersonMinSalaryEmploye = 0;
        for (int i = 1; i < Inicial.employees.length; i++) {
            if (Inicial.employees[i].getSalary() < minSalaryEmployee) {
                minSalaryEmployee = Inicial.employees[i].getSalary();
                linePersonMinSalaryEmploye = i;
            }
        }
        return linePersonMinSalaryEmploye;
    }

    //ищем номер строки в массиве  ссылок  сотрудника с максимальной  зарплатой
    private static int linePersonMaxSalaryEmployee() {
        int maxSalaryEmployee = Inicial.employees[0].getSalary();
        int index = 0;
        for (int i = 1; i < Inicial.employees.length; i++) {
            if (Inicial.employees[i].getSalary() > maxSalaryEmployee) {
                maxSalaryEmployee = Inicial.employees[i].getSalary();
                index = i;
            }
        }
        return index;
    }

    private static void printEmployee() {
        //int len=employees[0].getFullNameOfEmployee;
        for (int i = 0; i < Inicial.employees.length; i++) {

            System.out.println(Inicial.employees[i]);
        }
    }

    //метод определяет сотрудника с наименьшей зарплатой
    private static Employee findEmployeeWithMinSalary() {
        var minSalaryEmployee =Inicial.employees[0];
        for (int i = 1; i < Inicial.employees.length; i++) {
            if (Inicial.employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = Inicial.employees[i];
            }
        }
        return minSalaryEmployee;
    }

    //метод определяет сотрудника с наибольшей  зарплатой
    private static Employee findEmployeeWithMaxSalary() {
        var maxSalaryEmployee = Inicial.employees[0];
        for (int i = 1; i < Inicial.employees.length; i++) {
            if (Inicial.employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = Inicial.employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    //выводим данные в виде таблицы использую символы псевдографики
    //в следующем задании вынесу в отдельный метод
    private static void printEmploeesFullName() {
        int maxLenWordPerson = Inicial.employees[0].getFullName().length();
        //ищем макс длинное слово в поле сотрудник  в массиве ссылок
        for (int i = 1; i < Inicial.employees.length; i++) {
            if (Inicial.employees[i].getFullName().length() > maxLenWordPerson) {
                maxLenWordPerson = Inicial.employees[i].getFullName().length();
            }
            // System.out.println("Максимальная длина фио сотрудника=" + maxLenWordPerson);
            var el1 = "\u250c";// ┌
            var el2 = "\u252c";// ┬
            var el3 = "\u251c";// ├
            var el4 = "\u2534";// ┴
            var el5 = "\u253c";// ┼
            var el6 = "\u2502";// │
            var el7 = "\u2500";// ─
            var el8 = "\u2510";// ┐
            var el9 = "\u2518";// ┘
            var el10 = "\u2524";// ┤
            var el11 = "\u2514";// └
            var space = " ";
            var title = "ФИО сотрудника";
            int lenTitle1;
            if (title.length() >= maxLenWordPerson) {
                lenTitle1 = title.length() + 4;
            } else {
                lenTitle1 = maxLenWordPerson + 4;
            }
            int indentLeft;
            int indentRight;
            indentLeft = (lenTitle1 - title.length()) / 2;
            indentRight = lenTitle1 - indentLeft - title.length();
            //System.out.println(lenTitle1 +" " + title.length()+" " + indentLeft);
            //первая строка в таблице
            System.out.println(el1 + el7.repeat(3) + el2 + el7.repeat(lenTitle1) + el8);
            System.out.println(el6 + "№№№" + el6 + space.repeat(indentLeft) + title + space.repeat(indentRight) + el6);
            //третья строка
            // System.out.println(el3+el7.repeat(3)+el5+el7.repeat(lenTitle1)+el10);

            for (i = 1; i < Inicial.employees.length; i++) {
                System.out.println(el3 + el7.repeat(3) + el5 + el7.repeat(lenTitle1) + el10);
                indentLeft = (lenTitle1 - Inicial.employees[i].getFullName().length()) / 2;
                indentRight = lenTitle1 - indentLeft - Inicial.employees[i].getFullName().length();
                System.out.println(
                        el6 + " " + i + " " + el6 + space.repeat(indentLeft) + Inicial.employees[i].getFullName() +
                                space.repeat(indentRight) + el6);
            }
            System.out.println(el11 + el7.repeat(3) + el4 + el7.repeat(lenTitle1) + el9);
        }

    }

}

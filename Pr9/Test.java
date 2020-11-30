package Pr9;

public class Test {
    public static void main(String[] args) {
        Account acc1 = new Account("9876","Иванов И.И.");
        Account.Check(acc1);

        Account acc2 = new Account("123","Петров Е.Е.");
        Account.Check(acc2);

        Account acc3 = new Account("1234567890","Сидоров А.А.");
        Account.Check(acc3);
    }
}
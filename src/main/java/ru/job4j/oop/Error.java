package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
        this.active = true;
        this.status = 20;
        this.message = "test 2";
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(false, 10, "test");
        error1.printInfo();
        Error error2 = new Error();
        error2.printInfo();
    }
}

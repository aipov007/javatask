

class MyException1 extends Exception {
    public MyException1(String message) {
        super(message);
    }
}

class MyException2 extends Exception {
    public MyException2(String message) {
        super(message);
    }
}

class MyException3 extends Exception {
    public MyException3(String message) {
        super(message);
    }
}

class ExceptionThrower {
    public void throwException(int value) throws MyException1, MyException2, MyException3 {
        if (value < 0) {
            throw new MyException1("Value cannot be negative.");
        } else if (value == 0) {
            throw new MyException2("Value cannot be zero.");
        } else {
            throw new MyException3("Value cannot be greater than zero.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();

        try {
            thrower.throwException(0);
        } catch (MyException1 | MyException2 | MyException3 e) {
            System.out.println(e.getMessage());
        }
    }
}

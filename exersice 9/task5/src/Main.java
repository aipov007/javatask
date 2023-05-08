import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyException1 extends Exception {
    private static final Logger logger = Logger.getLogger("LoggingException");

    public MyException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class MyException2 extends Exception {
    private static final Logger logger = Logger.getLogger("LoggingException");

    public MyException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class ExceptionThrower {
    public static void throwFirstOrSecondException(boolean throwFirst) throws MyException1, MyException2 {
        if (throwFirst) {
            throw new MyException1();
        } else {
            throw new MyException2();
        }
    }

    public static void throwSecondException() throws MyException2 {
        throw new MyException2();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionThrower.throwFirstOrSecondException(true);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getName());
        }

        try {
            ExceptionThrower.throwSecondException();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getName());
        }
    }
}
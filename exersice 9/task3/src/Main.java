
public class Main {
    public static void main(String[] args) {
        Account account = new Account("Samir", 500, 1234);
        int transferAmount = 600;
        try {
            account.transfer(transferAmount);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown exception occurred.");
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankService implements AccountService{

    private ConsolePrinter consolePrinter;
    private DateGenerator dateGenerator;

    public int balance;

    List<String> movements = new ArrayList<>();

    public BankService(ConsolePrinter consolePrinter, DateGenerator dateGenerator) {
        this.consolePrinter = consolePrinter;
        this.dateGenerator = dateGenerator;
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
        movements.add(dateGenerator.getDate()+ "|"+amount+ "|"+balance);
    }

    @Override
    public void withdraw(int amount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void printStatement(){
        consolePrinter.print(String.valueOf(balance));
    }

}

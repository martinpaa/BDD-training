public class ConsolePrinter {
    public String print(String balance) {
        String report = "Date       | Amount | Balance\n";
        if (!balance.equals("0"))
        {
            report = report + balance;
        }
        return report;
    }
}

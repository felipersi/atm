package atm.currency;

import atm.Transaction;
import atm.atm.ATM;
import atm.db.BankDatabase;
import atm.ui.Screen;

public class ATMCaseStudy
{
   public static void main(String[] args)
   {
      ATM theATM = new ATM();
      theATM.run();
   }

   public static class BalanceInquiry extends Transaction
   {

      public BalanceInquiry(int userAccountNumber, Screen atmScreen,
         BankDatabase atmBankDatabase)
      {
         super(userAccountNumber, atmScreen, atmBankDatabase);
      }


      @Override
      public void execute()
      {
               BankDatabase bankDatabase = getBankDatabase();
         Screen screen = getScreen();


         double availableBalance =
            bankDatabase.getAvailableBalance(getAccountNumber());


         double totalBalance =
            bankDatabase.getTotalBalance(getAccountNumber());


         screen.displayMessageLine("\nBalance Information:");
         screen.displayMessage(" - Available balance: ");
         screen.displayDollarAmount(availableBalance);
         screen.displayMessage("\n - Total balance:     ");
         screen.displayDollarAmount(totalBalance);
         screen.displayMessageLine("");
      }
   }
}

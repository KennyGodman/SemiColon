package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
 @Test
    @DisplayName("Deposit money, balance increases test")
 public void depositMoneyBalanceIncreasesTest(){
     //given
     Account godmanAccount = new Account ();
     //when
     godmanAccount.deposit(500);
     godmanAccount.deposit(600);
     //check
     assertEquals(1100, godmanAccount.getBalance());
    }

    //todo create test for negative deposit

    @Test
    public void withdrawWorkstest(){
     //given
     Account godmanAccount = new Account();
     godmanAccount.deposit(5000);
     //when
        godmanAccount.withdraw(2000);
        //check
        assertEquals(3000, godmanAccount.getBalance());
    }


}

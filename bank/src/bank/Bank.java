package bank;

public class Bank {

//   예금주
//   계좌번호
//   핸드폰번호
//   비밀번호
//   통장
   private String name;
   private String account;
   private String phoneNumber;
   private String password;
   protected int money;
   
   public Bank() {;}

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAccount() {
      return account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public int getMoney() {
      return money;
   }

   public void setMoney(int money) {
      this.money = money;
   }

//   *static
//   계좌번호 중복검사
   public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
      Bank bank = null;
      
      for (int i = 0; i < arrBank.length; i++) {
         int j = 0;
         for (j = 0; j < arCount[i]; j++) {
            if(arrBank[i][j].getAccount().equals(account)) {
               bank = arrBank[i][j];
               break;
            }
         }
         if(j != arCount[i]) {
            break;
         }
      }
      
      return bank;
   }
   
   
//   핸드폰번호 중복검사
   public final static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
      Bank bank = null;
      
      for (int i = 0; i < arrBank.length; i++) {
         int j = 0;
         for (j = 0; j < arCount[i]; j++) {
            if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) {
               bank = arrBank[i][j];
               break;
            }
         }
         if(j != arCount[i]) {
            break;
         }
      }
      
      return bank;
   }
   
//   로그인
   public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
      Bank user = checkAccount(arrBank, arCount, account);
      if(user != null) {
         if(user.password.equals(password)) {
            return user;
         }
      }
      return null;
   }
   
   
//   *일반
//   입금
   public void deposit(int money) {
      this.money += money;
   }
   
//   출금
   public void withdraw(int money) {
      this.money -= money;
   }
   
//   잔액조회
   public int showBalance() {
      return money;
   }
   
}

































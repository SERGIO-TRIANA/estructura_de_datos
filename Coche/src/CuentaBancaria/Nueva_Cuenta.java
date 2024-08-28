package CuentaBancaria;

public class Nueva_Cuenta {
    public static void main(String[] args) {
        CuentaBancaria1 Nueva_Cuenta = new CuentaBancaria1("37300005873", 500, "Sergio Triana");

        Nueva_Cuenta.deposit(1000);
        Nueva_Cuenta.withdraw(2000);
        Nueva_Cuenta.get_balance();

    }
}

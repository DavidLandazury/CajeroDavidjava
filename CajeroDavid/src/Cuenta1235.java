public class Cuenta1235 {
    private String nombre;
    private double balance;
    private int tarjeta;
    private String password;

    public Cuenta1235(){
        super();
        this.nombre = "David";
        this.balance = 1000;
        this.tarjeta = 0;
        this.password = "1235";
    }

    public Cuenta1235(String nombre,double balance, int tarjeta, String pass){

        this.nombre = nombre;
        this.balance = balance;
        this.tarjeta= tarjeta;
        this.password = getPassword();
    }

    public String getNombre(){

        return nombre;
    }

    public int getCardNum(){

        return tarjeta;
    }

    public String getPassword(){

        return password;
    }

    public void setBalance(double balance){

        this.balance = balance;

    }

    public double getBalance(){

        return balance;
    }
}

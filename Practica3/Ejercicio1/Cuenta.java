package práctica3_cuentabancaria;

import java.util.Scanner;

public class Cuenta {
    String NombreCliente;
    String NumeroCuenta;
    Double TipoInteres;
    Double Saldo;

    
    //Constructor por defecto
    public Cuenta(){

    }
    
    //Constructor con todos los parámetros
    public Cuenta(String NombreCliente, String NumeroCuenta, Double TipoInteres, Double Saldo) {
        this.NombreCliente = NombreCliente;
        this.NumeroCuenta = NumeroCuenta;
        this.TipoInteres = TipoInteres;
        this.Saldo = Saldo;
    }
    
    
    //Constructor copia
    public Cuenta(final Cuenta copia) {
        NombreCliente = copia.NombreCliente;
        NumeroCuenta = copia.NumeroCuenta;
        TipoInteres = copia.TipoInteres;
        Saldo = copia.Saldo;
    }
    
    //Setters
    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public void setTipoInteres(Double TipoInteres) {
        this.TipoInteres = TipoInteres;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
    
    //Getters
    public String getNombreCliente() {
        return NombreCliente;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public Double getTipoInteres() {
        return TipoInteres;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public boolean ingreso(double RealizaIngreso) {
        boolean ingresoCorrecto = true;
        if (RealizaIngreso < 0 && RealizaIngreso<Saldo) {
            ingresoCorrecto = false;
        } else {
            Saldo = Saldo + RealizaIngreso;
        }
        return ingresoCorrecto;
    }
    
    public boolean reintegro(double RetirarDinero) {
        boolean reintegroCorrecto = true;
        if (RetirarDinero < 0) {
            reintegroCorrecto = false;
        } else if (Saldo >= RetirarDinero) {
            Saldo -= RetirarDinero;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }
    
    //método transferencia
    public boolean transferencia(Cuenta CuentaDestino, double importe) {
        boolean correcto = true;
        if (importe < 0) {
            correcto = false;
        } else if (Saldo >= importe) {
            reintegro(importe);
            CuentaDestino.ingreso(importe);
        } else {
            correcto = false;
        }
        return correcto;
    }
    
    public void datos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre=entrada.nextLine();
        this.NombreCliente=nombre;
        System.out.println("Introduce tu número de cuenta: ");
        String cuenta=entrada.nextLine();
        this.NumeroCuenta=cuenta;
        System.out.println("Introduce tu interés anual: ");
        double interes=entrada.nextInt();
        this.TipoInteres=interes;
        System.out.println("Introduce tu saldo inicial: ");
        double saldoinicial=entrada.nextInt();
        this.Saldo=saldoinicial;
    }
}
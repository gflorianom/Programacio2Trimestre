package práctica3_cuentabancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //introduce datos de 2 clientes
        Cuenta Cliente1 = new Cuenta();
        Cuenta Cliente2 = new Cuenta();
        System.out.println("Introduce los datos del cliente 1: ");
        Cliente1.datos();
        System.out.println("Introduce los datos del cliente 2: ");
        Cliente2.datos();

        //menu principal  
        Scanner read = new Scanner(System.in);

        read = new Scanner(System.in);
        int Seleccion = 0; //Primer Menu 

        do {
            System.out.println("===MENÚ PRINCIPAL===");
            System.out.println("1.Cliente 1");
            System.out.println("2.Cliente 2");
            System.out.println("3.Salir");
            System.out.print("Selecciona una Opción: ");
            Seleccion = read.nextInt();

            switch (Seleccion) {
                case 1:
                    int cliente1 = 0;
                    do {

                        System.out.println("===CLIENTE 1===");
                        System.out.println("1.Realizar un ingreso");
                        System.out.println("2.Retirar dinero");
                        System.out.println("3.Hacer una transferencia al cliente2");
                        System.out.println("4.volver Atras.");
                        System.out.print(Cliente1.getNombreCliente() + " Seleccione una opcíón: ");
                        System.out.println("");
                        cliente1 = read.nextInt();
                        switch (cliente1) {
                            case 1:
                                //ingresar dinero cliente 1

                                Scanner ingresar = new Scanner(System.in);
                                System.out.println(Cliente1.getNombreCliente() + " ¿Qué cantidad quieres ingresar en tu cuenta? ");
                                double cantidad = ingresar.nextDouble();
                                Cliente1.ingreso(cantidad);
                                System.out.println("Saldo actual de " + Cliente1.getNombreCliente() + " es: " + Cliente1.getSaldo());
                                break;

                            case 2:
                                //retirar dinero cliente 1
                                Scanner retirar = new Scanner(System.in);
                                System.out.println(Cliente1.getNombreCliente() + " ¿Qué cantidad quieres retirar de tu cuenta? ");
                                double retirardinero = retirar.nextDouble();
                                Cliente1.reintegro(retirardinero);
                                System.out.println("Saldo actual de " + Cliente1.getNombreCliente() + " es: " + Cliente1.getSaldo());
                                break;

                            //Hacer transferencia de cliente 1 a cliente 2
                            case 3:
                                Scanner transferir = new Scanner(System.in);
                                System.out.println(Cliente1.getNombreCliente() + " ¿Qué cantidad quieres transferir de tu cuenta a la cuenta de " + Cliente2.getNombreCliente() + "?");
                                double transferirdinero = transferir.nextDouble();
                                Cliente1.transferencia(Cliente2,transferirdinero);
                                System.out.println(Cliente1.getNombreCliente() + " Ha transferido " + transferirdinero + " € a la cuenta de " + Cliente2.getNombreCliente());
                                System.out.println("Saldo actual de " + Cliente1.getNombreCliente() + " es: " + Cliente1.getSaldo());
                                System.out.println("Saldo actual de " + Cliente2.getNombreCliente() + " es: " + Cliente2.getSaldo());
                                break;

                            default:
                                System.out.println("Selecciono Volver Atras.");
                        }

                    } while (cliente1 < 3);
                    break;

                case 2:
                    int cliente2 = 0;
                    do {

                        System.out.println("===CLIENTE 2===");
                        System.out.println("1.Realizar un ingreso");
                        System.out.println("2.Retirar dinero");
                        System.out.println("3.Hacer una transferencia al cliente1");
                        System.out.println("4.volver Atras.");
                        System.out.print(Cliente2.getNombreCliente() + " Seleccione una opcíón: ");
                        System.out.println("");
                        cliente2 = read.nextInt();
                        switch (cliente2) {
                            case 1:
                                //ingresar dinero cliente 2

                                Scanner ingresar = new Scanner(System.in);
                                System.out.println(Cliente2.getNombreCliente() + " ¿Qué cantidad quieres ingresar en tu cuenta? ");
                                double cantidad = ingresar.nextDouble();
                                Cliente2.ingreso(cantidad);
                                System.out.println("Saldo actual de " + Cliente2.getNombreCliente() + " es: " + Cliente2.getSaldo());
                                break;

                            case 2:
                                //retirar dinero cliente 2
                                Scanner retirar = new Scanner(System.in);
                                System.out.println(Cliente2.getNombreCliente() + " ¿Qué cantidad quieres retirar de tu cuenta? ");
                                double retirardinero = retirar.nextDouble();
                                Cliente2.reintegro(retirardinero);
                                System.out.println("Saldo actual de " + Cliente2.getNombreCliente() + " es: " + Cliente2.getSaldo());
                                break;

                            //Hacer transferencia de cliente 2 a cliente 1
                            case 3:
                                Scanner transferir = new Scanner(System.in);
                                System.out.println(Cliente2.getNombreCliente() + " ¿Qué cantidad quieres transferir de tu cuenta a la cuenta de " + Cliente1.getNombreCliente() + "? ");
                                double transferirdinero = transferir.nextDouble();
                                Cliente2.transferencia(Cliente1,transferirdinero);
                                System.out.println(Cliente2.getNombreCliente() + " Ha transferido " + transferirdinero + " € a la cuenta de " + Cliente1.getNombreCliente());
                                System.out.println("Saldo actual de " + Cliente2.getNombreCliente() + " es: " + Cliente2.getSaldo());
                                System.out.println("Saldo actual de " + Cliente1.getNombreCliente() + " es: " + Cliente1.getSaldo());
                                break;
                            default:
                                System.out.println("Selecciono Volver Atras.");
                        }

                    } while (cliente2 < 4);
                    break;
            }
        } while (Seleccion < 3);
    }
}

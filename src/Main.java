import javax.swing.*;public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int saldo_inicial = 3000;
        int opcion;
        float ingreso;
        float ingrese, salidaActual, retiro;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "bienvenido a su cajero automatico\n"
                + " ingrese dinero a la cuenta\n"
                + "retirar dinero de la cuenta\n"
                + "salir"));
        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidadque desea ingresar en cuenta:"));
                salidaActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, " dinero en cuenta:" + salidaActual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("digite  la cantidad que desea retirar:"));
                if (retiro > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, " no cuenta con la plata suficiente para este retiro");
                } else {
                    salidaActual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "dinero en la cuenta" + salidaActual);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "se equivoco de opcion de menu");
                break;
        }

    }


}
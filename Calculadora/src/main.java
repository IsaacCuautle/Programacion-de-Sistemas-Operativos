import javax.swing.JOptionPane; 
public class main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora...");
        
        float numero1,numero2,resultado;
        String signo,valor1,valor2,continua;
        int operador;
        
        calculadora calc = new calculadora();
        do {
            valor1 = JOptionPane.showInputDialog(null,"Ingrese el primer numero");
            valor2 = JOptionPane.showInputDialog(null,"Ingrese el segundo numero");
            signo = JOptionPane.showInputDialog(null,"¿Que desea realizar?\n1-Suma\n2-Resta\n3-Multiplicacion"
                    + "\n4-Division");
        
        numero1 = Float.parseFloat(valor1);
        numero2 = Float.parseFloat(valor2);
        operador = Integer.parseInt(signo);
        
            switch(operador) {
                case 1:
                    resultado = calc.suma(numero1,numero2);
                break;
                
                case 2:
                    resultado = calc.resta(numero1,numero2);
                break;
                
                case 3:
                    resultado = calc.multiplicacion(numero1,numero2);
                break;
                
                case 4:
                    resultado = calc.division(numero1,numero2);
                break;
                
                default:
                    resultado = 0;
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
            }
            
            JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
            continua = JOptionPane.showInputDialog(null, "¿Desea volver a ejecutar?\nS/N");
        }while(continua.equals("S") | continua.equals("s"));
        
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
    }
}

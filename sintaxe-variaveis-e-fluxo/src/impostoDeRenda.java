public class impostoDeRenda {

    public static void main(String[] args) {

        double salario = 2400;

        if(salario < 1900) {
        	System.out.println("Você não precisa pagar imposto de renda");
        }else { 
        	if(salario >= 1900.0 && salario <= 2800.0) {
        		System.out.println("seu imposto será de " + ((salario * 0.075) - 142));
        	}else {
        		if(salario > 2800.0 && salario <= 3751.0) {
            		System.out.println("seu imposto será de " + ((salario * 0.15) - 350));
        			}else {
        				if(salario > 3751.0) {
                    		System.out.println("seu imposto será de " + ((salario *  0.225) - 636));

        				}
        			}
        		}
        
        	}
    	}
}
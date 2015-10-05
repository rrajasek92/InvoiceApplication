import java.util.Scanner;
public class InvoiceApplication {
			public static void main(String[] args){
				double taxRate, input=-1,sum=0,tax,total=0;
				double[] array=new double[100];
				int i=1;
				Scanner keyboard=new Scanner(System.in);
				System.out.println("Tax Rate?: ");
				taxRate=keyboard.nextDouble();
				while (input!=0.0){
					System.out.println("Price #"+i+": ");
					input=keyboard.nextDouble();
					array[i]=input;
					i++;
				}
				for(int n=1;n<=i;n++){
					sum=sum+array[n];
				}
				tax=sum*taxRate;
				total=tax+sum;
				
				System.out.println("\n-------------------------\nReceipt");
				for (int n=1;n<i-1;n++){
					System.out.println(array[n]);
				}
				System.out.println("\n"+sum+" subtotal\n"+tax+" tax\n" + total+" grand total");
				keyboard.close();
			}
}

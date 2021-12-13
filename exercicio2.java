package VetoreseMatrizes;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[],maior=0,insert,media,total=0;
				x=new int[10];
				Scanner entrada = new Scanner(System.in);
				for(insert=0;insert<10;insert++){
					System.out.println("Digite o numero");
					(x[insert])=entrada.nextInt();	
				}


		          for(insert=0;insert<10;insert++){
		          total=total+x[insert];
		          
		          }
		          for(insert=0;insert<10;insert++){
				if (x[insert]>maior) {
				maior=x[insert];
				}

		          }
				media=total/10;
				System.out.println("O numero  maior é "+maior);
				
		         System.out.println("A media é "+media);
			}

	}



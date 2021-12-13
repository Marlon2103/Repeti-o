package VetoreseMatrizes;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int mat[][],l,c = 0,soma=0;
   mat= new int[3][3];
   Scanner entrada =new Scanner(System.in);
   for(l=0;l<3;l++) {
	   for(c=0;c<3;c++) {
		   System.out.println("Digite o numero : ");
		   mat[l][c]=entrada.nextInt();
	   }
	   System.out.println("\t");
   }
   for(l=0;l<3;l++) {
	   for(c=0;c<3;c++) {
		   System.out.print(+mat[l][c]+"\t");
	   }
	   System.out.print("\n");
   }
   soma=mat[0][0]+mat[1][1]+mat[2][2];
   System.out.print("A soma da diagonal é :"+soma);
   
		}
	}



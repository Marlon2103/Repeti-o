package VetoreseMatrizes;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int  vetor[],maior=0,insert;
      vetor=new int[5];
      Scanner entrada = new Scanner(System.in);
      for(insert=0;insert<5;insert++) {
    	  System.out.println("Digite o numero");
          vetor[ insert]=entrada.nextInt();
      }
      
      for(insert=0;insert<5;insert++) {
    	  if(vetor[insert]>maior) {
    		  maior=vetor[insert];
    	  }
      }
      System.out.println("O maior numero é : "+maior);
	}
	

}

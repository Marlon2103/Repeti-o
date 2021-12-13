package VetoreseMatrizes;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N1[][], N2[][], a, b, c, d=0,M1[][] , M2[][];
		N1=new int [4][6];
		N2=new int [4][6];
		M1=new int [4][6];
		M2=new int [4][6];
				 
				Scanner entrada = new Scanner(System.in);	

					for( a = 0; a<4; a++){

						

						for(b = 0;b<6;b++){
							System.out.println("Digite um numero: " );
							 N1[a][b]=entrada.nextInt();
						}
						System.out.println("\n");

						
					}

					

					for(c  = 0; c<4; c++){
						for(d = 0; d<6; d++) {
							System.out.println("Digite um numero: " );
							 N2[c][d]=entrada.nextInt();
						}

						System.out.println("\n");
					}


					

					for( a = 0; a<4; a++){

						for(b = 0;b<6;b++){

							 M1[a][b] = N1 [a][b] + N2[a][b];
						}
						System.out.print("\n");

						
					}
					
					for( a = 0; a<4; a++){

						

						for(b = 0;b<6;b++){

							 System.out.print(" [ "+ M1[a][b] + "]");

						}
						System.out.println("\n");

					}

					

					for( a = 0; a<4; a++){

						for(b = 0;b<6;b++){

							 M2[a][b] = N1 [a][b] - N2[a][b];
						}
						System.out.print("\n");

						
					}
					
					for( a = 0; a<4; a++){

						

						for(b = 0;b<6;b++){

							 System.out.print(" ["+ M2[a][b] + "]");

						}
						System.out.println("\n");


				}

					}

	private static void println(String string) {
		// TODO Auto-generated method stub
		
	}
					


	}



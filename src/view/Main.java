package view;

public class Main extends Thread {
	private static String ordem = "";
	
	public static String nome = "";

	public static void main(String[] args) {
//         int[][] dados = {{0, 0, 0, 0 },{ 6, 5, 4, 7 }}; // conjunto A
//		   int[][] dados = {{1, 1, 2, 4 },{ 6, 5, 4, 7 }}; // conjunto B
		   int[][] dados = {{1, 2, 2, 4 },{ 6, 5, 4, 7 }}; // conjunto C

//		int disponivel = 10; // disponiveis do conjunto A
//		int disponivel = 2;  // disponiveis do conjunto B
		int disponivel = 1;  // disponiveis do conjunto C

		while (dados[1][0] != 0 || dados[1][1] != 0 || dados[1][2] != 0 || dados[1][3] != 0) {
			int teste = 0;

			for (int i = 0; i < 4; i++) {

				switch (i) {
				case 0:
					nome = " A";
					break;
				case 1:
					nome = " B";
					break;
				case 2:
					nome = " C";
					break;
				case 3:
					nome = " D";
					break;

				default:

				}
				if ((dados[0][i] + disponivel) >= dados[1][i] && dados[1][i] != 0) {
					try {
						System.out.println(nome + "--> Alocado: " + dados[0][i] + "\t Presisa: " + dados[0][i]
								+ "\t Disponivel: " + disponivel);

						disponivel = disponivel + dados[0][i];

						dados[0][i] = 0;

						dados[1][i] = 0;

						sleep(500);
						ordem += nome + ",";

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block

					}
					System.err.println(nome + "-->Alocado: " + dados[0][i] + "\t Presisa: " + dados[0][i]
							+ "\t Disponivel: " + disponivel);
				
					i = -1;
					teste = -1;
				} else {
					if(teste >=3) {
					System.out.println("inseguro");
					return;
					}
				 teste +=1;
				
				}

			}

			mostrarOrdem();

		}

	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void mostrarOrdem() {
		System.err.println(ordem);

	}

}

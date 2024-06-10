package matrizBidimencional;

import javax.swing.*;

public class MtrizBidimencional {
	public static void main(String[] args) {
		int tamanho = 5;
        char[][] matriz = new char[tamanho][tamanho];

        int opcao;

        do {
            String menu = "Escolha uma das opções\n" +
                "1 - Imprimir um quadrado 10x10 completo!\n" +
                "2 - Triângulo retângulo base maior e lado à esquerda!\n" + 
                "3 - Triângulo retângulo teto maior e lado à esquerda!\n" +
                "4 - Triângulo retângulo base maior e lado à direita!\n" + 
                "5 - Triângulo retângulo teto maior e lado à direita!\n" +
                "6 - Sair do programa\n";
            
            String input = JOptionPane.showInputDialog(menu);
            if (input == null) {
                opcao = 6; // Tratar cancelamento como saída
            } else {
                opcao = Integer.parseInt(input);
            }

            switch (opcao) {
                case 1:
                    // Preencher a matriz completa
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            matriz[i][j] = '*';
                        }
                    }
                    break;

                case 2:
                    // Triângulo retângulo base maior e lado à esquerda
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j <= i; j++) {
                            matriz[i][j] = '*';
                        }
                        for (int j = i + 1; j < tamanho; j++) {
                            matriz[i][j] = ' ';
                        }
                    }
                    break;

                case 3:
                    // Triângulo retângulo teto maior e lado à esquerda
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho - i; j++) {
                            matriz[i][j] = '*';
                        }
                        for (int j = tamanho - i; j < tamanho; j++) {
                            matriz[i][j] = ' ';
                        }
                    }
                    break;

                case 4:
                    // Triângulo retângulo base maior e lado à direita
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho - i - 1; j++) {
                            matriz[i][j] = ' ';
                        }
                        for (int j = tamanho - i - 1; j < tamanho; j++) {
                            matriz[i][j] = '*';
                        }
                    }
                    break;

                case 5:
                    // Triângulo retângulo teto maior e lado à direita
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < i; j++) {
                            matriz[i][j] = ' ';
                        }
                        for (int j = i; j < tamanho; j++) {
                            matriz[i][j] = '*';
                        }
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Você saiu do programa!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    continue;
            }

            if (opcao != 6) {
                // Imprimir a matriz
                StringBuilder output = new StringBuilder();
                for (int i = 0; i < tamanho; i++) {
                    for (int j = 0; j < tamanho; j++) {
                        output.append(matriz[i][j]).append(' ');
                    }
                    output.append('\n');
                }
                JOptionPane.showMessageDialog(null, output.toString());
            }

        } while (opcao != 6);
    }
}
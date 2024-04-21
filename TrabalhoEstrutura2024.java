
package ap.franco.trabalhoestrutura2024;

import java.util.Scanner;

public class TrabalhoEstrutura2024 {

    public static void main(String[] args) {
        int metodoEscolha,n,i,j;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Selecione o metodo de ordenacao:\n "
                + "1 - Ordenacao Insercao\n 2 - Ordenacao Selecao\n "
                + "3 - Ordenacao Bolha");
        metodoEscolha = s.nextInt();
        
        System.out.println("Informe o tamanho do vetor: ");
        n = s.nextInt();
        
        int vetorNumeros[] = new int [n];
        
        for (i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Informe o "+ (i+1) + " valor do vetor: ");
            vetorNumeros[i] = s.nextInt();
        }
        
        switch (metodoEscolha){
            case 1: {
                long tempoInicio = System.currentTimeMillis();
                
                System.out.print("Vetor original: ");
                for(i = 0;i<vetorNumeros.length;i++){
                    System.out.print("["+vetorNumeros[i]+"]" + " ");
                }
                for (i=0;i<vetorNumeros.length;i++){
                    int chave = vetorNumeros[i];
                    
                    for(j=i-1;j>=0 && vetorNumeros[j]>chave;j--){
                        vetorNumeros[j+1] = vetorNumeros[j];
                    }
                    vetorNumeros[j+1] = chave;
                }
                System.out.print("\nVetor ordenado: ");
                for(i = 0;i<vetorNumeros.length;i++){
                    System.out.print("["+vetorNumeros[i]+"]" + " ");
                }
                
                long tempoFim = System.currentTimeMillis();
                long tempoMetodo = tempoFim - tempoInicio;
                System.out.println("\nTempo de execucao: "+tempoMetodo+"s");
            }
            break;
            
            case 2: {
                long tempoInicio = System.currentTimeMillis();
                
                System.out.print("Vetor original: ");
                for(i = 0;i<vetorNumeros.length;i++){
                    System.out.print("["+vetorNumeros[i]+"]" + " ");
                }
                for(i=0;i<vetorNumeros.length-1;i++){
                    int valorMenor = i;
                    
                    for(j=i+1;j<vetorNumeros.length;j++){
                        if(vetorNumeros[j]<vetorNumeros[valorMenor]){
                            valorMenor = j;
                        }
                    }
                    if(valorMenor != i){
                        int temp = vetorNumeros[i];
                        vetorNumeros[i] = vetorNumeros[valorMenor];
                        vetorNumeros[valorMenor] = temp;
                    }
                }
                System.out.print("\nVetor ordenado: ");
                for(i = 0;i<vetorNumeros.length;i++){
                    System.out.print("["+vetorNumeros[i]+"]" + " ");
                }
                
                long tempoFim = System.currentTimeMillis();
                long tempoMetodo = tempoFim - tempoInicio;
                System.out.println("\nTempo de execucao: "+tempoMetodo+"s");
            }
            break;
            
            case 3: {
                long tempoInicio = System.currentTimeMillis();
                boolean stTroca = true;
                
                System.out.print("Vetor original: ");
                for(i = 0;i<vetorNumeros.length;i++){
                    System.out.print("["+vetorNumeros[i]+"]" + " ");
                }
                while(stTroca){
                    stTroca = false;
                    
                    for(i=0;i<vetorNumeros.length-1;i++){
                        if(vetorNumeros[i]>vetorNumeros[i+1]){
                            int temp = vetorNumeros[i];
                            vetorNumeros[i] = vetorNumeros[i+1];
                            vetorNumeros[i+1] = temp;
                            stTroca = true;
                        }
                    }
                }
                System.out.print("\nVetor ordenado: ");
                for(i = 0;i<vetorNumeros.length;i++){
                    System.out.print("["+vetorNumeros[i]+"]" + " ");
                }
                
                long tempoFim = System.currentTimeMillis();
                long tempoMetodo = tempoFim - tempoInicio;
                System.out.println("\nTempo de execucao: "+tempoMetodo+"s");
            }
            break;
        }     
        
    }
}

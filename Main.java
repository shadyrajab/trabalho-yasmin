import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        this.iniciarQuestionario();
    }

    public Integer retornarPesos(String peso) {
        HashMap<String, Integer> pesos = new HashMap<>();

        pesos.put("febre", 3);
        pesos.put("dorAtrasDosOlhos", 1);
        pesos.put("dorNasArticulações", 1);
        pesos.put("faltaDeApetite", 2);
        pesos.put("manchasVermelhas", 5);

        return pesos.get(peso);

    }

    public Integer calcularPesos(String febre, String dor1, String dor2, String apetite, String manchas) {
        Integer pesoFebre = 0;
        Integer pesoDorNosOlhos = 0;
        Integer pesoDorArticulacao = 0;
        Integer pesoApetite = 0;
        Integer pesoManchas = 0;
        if (febre.equals("Sim")) {
            pesoFebre = this.retornarPesos("febre");
        }
        if (dor1.equals("Sim")) {
            pesoDorNosOlhos = this.retornarPesos("dorAtrasDosOlhos");
        }

        if (dor2.equals("Sim")) {
            pesoDorArticulacao = this.retornarPesos("dorNasArticulações");
        }

        if (apetite.equals("Sim")) {
            pesoApetite = this.retornarPesos("faltaDeApetite");
        }

        if (manchas.equals("Sim")) {
            pesoManchas = this.retornarPesos("manchasVermelhas");
        }

        return pesoFebre + pesoDorNosOlhos + pesoDorArticulacao + pesoApetite + pesoManchas;
    }

    public void iniciarQuestionario() {
        String resultado = "Negativo";
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Você está com febre superior à 38 graus?: ");
        String febre = scanner.nextLine();

        System.out.print("Está com dor atrás dos olhos?: ");
        String dorAtrasDosOlhos = scanner.nextLine();
        
        System.out.print("Está com dor nas articulações?: ");
        String dorNasArticulacoes = scanner.nextLine();

        System.out.print("Está com falta de apetite?: ");
        String faltaDeApetite = scanner.nextLine();

        System.out.print("Você está com manchas vermelhas no corpo?: ");
        String manchasVermelhas = scanner.nextLine();
        
        Integer pesoFinal = this.calcularPesos(febre, dorAtrasDosOlhos, dorNasArticulacoes, faltaDeApetite, manchasVermelhas);
        System.out.println(pesoFinal);
        if (pesoFinal >= 6) {
            resultado = "Positivo";
        } 

        scanner.close();

        System.out.println("O resultado do seu teste deu " + resultado);

    }
}

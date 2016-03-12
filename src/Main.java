import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Viagem> viagens = new ArrayList<>();
		viagens.add(new Viagem(1, Transporte.AVIAO, new BigDecimal("20.00"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(2, Transporte.ONIBUS, new BigDecimal("34.00"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(3, Transporte.TREM, new BigDecimal("54.00"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(4, Transporte.AVIAO, new BigDecimal("20.00"), "Porto Alegre", "São Paulo"));
		viagens.add(new Viagem(5, Transporte.TREM, new BigDecimal("75.00"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(6, Transporte.TREM, new BigDecimal("2.00"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(7, Transporte.AVIAO, new BigDecimal("200.99"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(8, Transporte.AVIAO, new BigDecimal("2.00"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(9, Transporte.ONIBUS, new BigDecimal("11.00"), "São Paulo", "Porto Alegre"));
		viagens.add(new Viagem(10, Transporte.ONIBUS, new BigDecimal("5.00"), "São Paulo", "Porto Alegre"));

		printViagensLambda(viagens, Transporte.AVIAO, "São Paulo", "Porto Alegre");
	}

	public static void printViagens(List<Viagem> viagens, Transporte transporte, String origem, String destino) {
		Collections.sort(viagens, new ViagemComparator());

		for (Viagem viagem : viagens) {
			if (viagem.getTransporte().equals(transporte)
					&& viagem.getOrigem().toLowerCase().equals(origem.toLowerCase())
					&& viagem.getDestino().toLowerCase().equals(destino.toLowerCase()))
				System.out.println(viagem.toString());
		}
	}

	public static void printViagens(List<Viagem> viagens, Transporte transporte) {
		Collections.sort(viagens, new ViagemComparator());

		for (Viagem viagem : viagens) {
			if (viagem.getTransporte().equals(transporte))
				System.out.println(viagem.toString());
		}
	}

	public static void printViagensLambda(List<Viagem> viagens, Transporte transporte, String origem, String destino) {
		viagens.stream().filter(c -> c.getTransporte().equals(transporte))
				.filter(c -> c.getOrigem().toLowerCase().equals(origem.toLowerCase()))
				.filter(c -> c.getDestino().toLowerCase().equals(destino.toLowerCase()))
				.sorted((o1, o2) -> o1.getValor().compareTo(o2.getValor())).forEach(e -> System.out.println(e));
	}

	public static void printViagensLambda(List<Viagem> viagens, Transporte transporte) {
		viagens.stream().filter(c -> c.getTransporte().equals(transporte))
				.sorted((o1, o2) -> o1.getValor().compareTo(o2.getValor())).forEach(e -> System.out.println(e));
	}

}

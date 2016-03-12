import java.util.Comparator;

public class ViagemComparator implements Comparator<Viagem> {
	@Override
	public int compare(Viagem o1, Viagem o2) {
		return o1.getValor().compareTo(o2.getValor());
	}
}

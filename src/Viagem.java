import java.math.BigDecimal;

public class Viagem {

	private Integer id;
	private Transporte transporte;
	private BigDecimal valor;
	private String origem;
	private String destino;

	public Viagem(Integer id, Transporte transporte, BigDecimal valor, String origem, String destino) {
		super();
		this.id = id;
		this.transporte = transporte;
		this.valor = valor;
		this.origem = origem;
		this.destino = destino;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "id: " + this.id + " - transporte: " + this.transporte.toString() + " - valor: " + this.valor.toString()
				+ " - origem: " + this.origem + " - destino: " + this.destino;

	}

}

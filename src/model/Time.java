package model;

public class Time {
	private String from;
	private String to;
	private String icono;
	private String prono;
	private String preci;
	private String max;
	private String min;
	
	
	public Time() {
		super();
	}

	public Time(String from, String to, String icono, String prono, String preci, String max, String min) {
		super();
		this.from = from;
		this.to = to;
		this.icono = icono;
		this.prono = prono;
		this.preci = preci;
		this.max = max;
		this.min = min;
	}

	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getIcono() {
		return icono;
	}


	public void setIcono(String icono) {
		this.icono = icono;
	}


	public String getPreci() {
		return preci;
	}


	public void setPreci(String preci) {
		this.preci = preci;
	}


	public String getMax() {
		return max;
	}


	public void setMax(String string) {
		this.max = string;
	}


	public String getMin() {
		return min;
	}


	public void setMin(String min) {
		this.min = min;
	}

	public String getProno() {
		return prono;
	}

	public void setProno(String prono) {
		this.prono = prono;
	}

	@Override
	public String toString() {
		return "Time [from=" + from + ", to=" + to + ", icono=" + icono + ", prono=" + prono + ", preci=" + preci
				+ ", max=" + max + ", min=" + min + "]";
	}

}

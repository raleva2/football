package footballResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Resultados {
	
	/**
	 * CLASE DEL OBJETO RESULTADOS QUE UTILIZAREMOS.
	 */
	
	private String nombre1;
	private String nombre2;
	
	private int resultado1;
	private int resultado2;
	
	
	private LocalDateTime dateTime;

	  public LocalDateTime getDateTime() {
	    return dateTime;
	  }

	  public void setDateTime(LocalDateTime datetime) {
	    this.dateTime = datetime;
	  }
	


	public Resultados(String nombre1, String nombre2) {
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.resultado1=0;
		this.resultado2=0;
	}




	public Resultados(String nombre1, String nombre2, int resultado1, int resultado2) {
		super();
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.resultado1 = resultado1;
		this.resultado2 = resultado2;
		
		
		
		this.dateTime = horaActual();
	}

	/**
	 * @return 
	 * 
	 */
	private LocalDateTime horaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dtf.format(now);
        
        return now;
	}




	public String getNombre1() {
		return nombre1;
	}




	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}




	public String getNombre2() {
		return nombre2;
	}




	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}




	public int getResultado1() {
		return resultado1;
	}




	public void setResultado1(int resultado1) {
		this.resultado1 = resultado1;
	}




	public int getResultado2() {
		return resultado2;
	}




	public void setResultado2(int resultado2) {
		this.resultado2 = resultado2;
	}
	
	
	


	
	
	

}

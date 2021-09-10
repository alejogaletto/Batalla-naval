
public class Tablero1 {

		int fila, columna;
		String estado;
		boolean casilleroOcupado;
		boolean atacado;
		
		
		public boolean isCasilleroOcupado() {
			return casilleroOcupado;
		}
		public void setCasilleroOcupado(boolean casilleroOcupado) {
			this.casilleroOcupado = casilleroOcupado;
		}
		public boolean isAtacado() {
			return atacado;
		}
		public void setAtacado(boolean atacado) {
			this.atacado = atacado;
		}
		

		public Tablero1() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Tablero1(int fila, int columna) {
			super();
			this.fila = fila;
			this.columna = columna;
			this.casilleroOcupado = false;
			this.atacado = false;
		} //metodo constructor
		
		if(casilleroOcupado == false && atacado == false)
		{
			estado = "";
		}	//if
		else if(casilleroOcupado == false && atacado == true)
		{
			estado = "*";
		}//elseif
		else if(casilleroOcupado == true && atacado == true)
		{
			estado = "B";
		}//else if
		
		
		public String mostrarTablero(int fila, int columna){
			
		}//mostrarTablero
		
		
		
	} //clase
}

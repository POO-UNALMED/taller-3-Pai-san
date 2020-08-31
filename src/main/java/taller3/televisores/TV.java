package taller3.televisores;

public class TV {
	Marca marca;
	public int canal=1, precio=500, volumen=1;
	public boolean estado;	
	Control control;
	static private int numTV=0;
	public TV (Marca m,boolean e){
		this.marca=m;
		estado=e;
		numTV++;
	}
	public static void setNumTV (int n) {
		numTV = n;
	}
	public static int getNumTV() {
		return numTV;
	}

	public Marca getMarca () {
		return this.marca;
    }
	public Control getControl () {
		return this.control;
    }
	public int getPrecio () {
		return precio;
    }
	public int getVolumen () {
		return volumen;
    }
	public int getCanal () {
		return canal;
    }
	public boolean getEstado() {
		return estado;
	}
	public void setMarca (Marca mar) {
		this.marca=mar;
	}
	public void setControl (Control con) {
		this.control=con;
	}
	public void setPrecio (int pre) {
		precio=pre;
	}
	public void setVolumen (int vol) {
		if((vol>=0) && (vol<=7)){
			volumen=vol;
		}
		
	}
	public void setCanal (int can) {
		if ((can<=120)  && (estado==true) && (can>=1)){
			canal=can;
		}
	}
	public void turnOn () {
		estado=true;
	}
	public void turnOff () {
		estado=false;
	}
	public void canalUp () {
		if ((canal<120) && (canal>=1) && (estado==true)) {
		canal++;
	}
	}
	public void canalDown () {
		if ((canal>1)&& (canal<=120) && (estado==true)) {
		canal--;
		}
	}
	public void volumenUp () {
		if ((volumen<7) && (volumen>=0) && (estado==true)) {
		volumen++;
		}
	}
	public void volumenDown () {
		if ((volumen>0) && (volumen<7) && (estado==true)) {
		volumen--;
		}
	}



}

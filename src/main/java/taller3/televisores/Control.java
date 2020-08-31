
package taller3.televisores;

public class Control {
	TV tv;
	public void turnOn () {
		tv.estado=true;
	}
	public void turnOff () {
		tv.estado=false;
	}
	public void canalUp () {
		tv.canalUp();
	}
	public void canalDown () {
		tv.canalDown();

	}
	public void volumenUp () {
		tv.volumenUp();
	}
	public void volumenDown () {
		tv.volumenDown();
	}
	public TV getTV () {
		return tv;
	}
	public void setTV (TV t) {
		tv=t;
	}
	public TV getTv () {
		return this.tv;
	}
	public void setTv (TV teve) {
		this.tv = teve;
	}
	public void enlazar (TV teve) {
		tv=teve;
		tv.control=this;
	}
	public void setCanal (int can) {
		tv.canal=can;
	}

}

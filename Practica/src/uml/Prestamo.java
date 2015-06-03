package uml;

import java.util.List;

public class Prestamo {

  private int idPrestamo;
  private String fechaPrestamo;
  private double totalAdecuado;
  
  private List  Detalle_prestamo;

  public Prestamo() {
  }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public double getTotalAdecuado() {
        return totalAdecuado;
    }

    public void setTotalAdecuado(double totalAdecuado) {
        this.totalAdecuado = totalAdecuado;
    }

    public List getDetalle_prestamo() {
        return Detalle_prestamo;
    }

    public void setDetalle_prestamo(List Detalle_prestamo) {
        this.Detalle_prestamo = Detalle_prestamo;
    }

}
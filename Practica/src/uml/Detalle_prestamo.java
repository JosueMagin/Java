package uml;

import java.util.ArrayList;
import java.util.List;

public class Detalle_prestamo {

  private Empleado empleado;    
  private Prestamo prestamo;
  private double saldo;
  private List<Detalle_prestamo>lstdetalle;
  
  
  public Detalle_prestamo() {
      lstdetalle = new ArrayList();
      empleado = new Empleado();
      prestamo = new Prestamo();
  }
  
  public Detalle_prestamo(Empleado empleado, Prestamo prestamo) {
        this.empleado = empleado;
        this.prestamo = prestamo;
        calcularPrestamo();
   }

  public void calcularPrestamo() {
      saldo = prestamo.getTotalAdecuado()-empleado.getAbono();
      
  }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Detalle_prestamo> getLstdetalle() {
        return lstdetalle;
    }

    public void setLstdetalle(List<Detalle_prestamo> lstdetalle) {
        this.lstdetalle = lstdetalle;
    }

}
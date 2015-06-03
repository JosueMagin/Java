package uml;

import java.util.List;

public class Empleado {

  private int idCliente;
  private String nombre;
  private String nit;
  private double abono;

    private List  Detalle_prestamo;

  public Empleado() {
  }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public List getDetalle_prestamo() {
        return Detalle_prestamo;
    }

    public void setDetalle_prestamo(List Detalle_prestamo) {
        this.Detalle_prestamo = Detalle_prestamo;
    }

}
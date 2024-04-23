package database;

import java.lang.String;

public class Paciente{

    private int Codigo;
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Telefono;
    private String FechadeNacimiento;

    public Paciente() {
        System.out.println(" este es el constructor vacio de la clase que se agrega por  defecto");
    }
    public Paciente(String Cedula){
       this.Cedula=Cedula;
}
    public Paciente(String cedula, String Nombre, String Apellido ){
        this.Cedula=cedula; this.Nombre=Nombre; this.Apellido=Apellido;
    }

    public Paciente(Integer codigo, String Nombre, String Apellido, String Cedula , String Telefono, String FechadeNacimiento) {
     this.Codigo=codigo;this.Nombre= Nombre;this.Apellido=Apellido; this.Cedula= Cedula; this.Telefono= Telefono;  this.FechadeNacimiento=FechadeNacimiento;
}
//public int getCodigo() {
    //  return Codigo;
//}

// public void setCodigo(int codigo) {
//      Codigo = codigo;
//}

//public String getNombre() {
//      return Nombre;
//}

//  public void setNombre(String nombre) {
//      Nombre = nombre;
//  }

//    public String getApellido() {
//      return Apellido;
//  }

//  public void setApellido(String apellido) {
//      Apellido = apellido;
// }

//  public String getCedula() {
//     return Cedula;
//  }

//  public void setCedula(String cedula) {
//      Cedula = cedula;
//  }

//  public String getTelefono() {
//      return Telefono;
//  }

//  public void setTelefono(String telefono) {
//  Telefono = telefono;
//}

// public Date getFechadeNacimiento() {
//    return FechadeNacimiento;
//    }

//public void setFechadeNacimiento(Date fechadeNacimiento) {
//  FechadeNacimiento = fechadeNacimiento;
//}



public static void main(String[] args) {
    Paciente paciente  = new  Paciente();



    Paciente  Henry=  new Paciente("100457211");
Paciente Juan = new Paciente("100468784", "Juan Jose", "Scalonni");
Paciente gt = new Paciente(1, "Heriberto","Rojas","41788845","31247488","1946-06-22");


    System.out.println("Este es la cedula del paciente Henry:"+ Henry);

    System.out.println("Estos son la cedula el nombre y apellidos del paciente juan:"+ Juan);

    System.out.println("Estos son los datos completos de un paciente al azar:"+ gt);





}




@Override
    public String toString() {
        return "Pacientes{" +
                "Codigo=" + Codigo +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Cedula='" + Cedula + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", FechadeNacimiento=" + FechadeNacimiento +
                '}';
    }
}
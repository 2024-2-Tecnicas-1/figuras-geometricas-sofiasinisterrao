
package com.mycompany.figurageometrica;
public class Triángulo extends FiguraGeometrica {
  private double base;
  private double altura;
public Triángulo(String nombre,String color,double base,double altura) {
 super (nombre, color);
 this.base = base;
 this.altura = altura;
}
public double getArea(){
 return (base * altura)/2;
}
public double getPerimetro (){
  return 3 * base;
}
}

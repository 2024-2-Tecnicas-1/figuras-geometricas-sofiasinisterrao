
package com.mycompany.figurageometrica;

public class Círculo extends FiguraGeometrica{    
private double radio;

public Círculo(String nombre,String color , double radio) {
  super (nombre, color);
  this.radio = radio;
}
public double getArea (){
  return Math.PI* radio * radio;
}
public double getPerimetro (){
    return 2*Math.PI * radio ;
}
}

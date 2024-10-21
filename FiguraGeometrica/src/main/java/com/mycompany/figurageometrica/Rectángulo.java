
package com.mycompany.figurageometrica;
public class Rectángulo extends FiguraGeometrica{
 private double lado1;
 private double lado2;
 
public Rectángulo(String nombre,String color,double lado1,double lado2){
super(nombre, color );
this.lado1 = lado1;
this.lado2 = lado2;
}
public double getArea (){
   return lado1 * lado2;
}
public double getPerimetro (){
  return 2 * (lado1 + lado2);
}
}
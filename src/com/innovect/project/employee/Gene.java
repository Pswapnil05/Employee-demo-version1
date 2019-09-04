package com.innovect.project.employee;
import java.util.*;
import java.util.ArrayList;

public class Gene {

//  T obj1;
//  T obj2;
//  T Obj3;

  static double Calc(int a, int b, double c) {
    double f = ((a*b)+(c*a*b));
    return f;
  }

  // To print objects of type T & U
//  public void print() {
//    System.out.println(obj1+" "+obj2);
//  }


  public static void main(String[] args) {
    Gene food = new Gene();

    System.out.println(Gene.Calc(1, 100, 0.0));

    //food.print();
    //Gene<Object, Object,Object> furn = new Gene<>(1,100,0.05);
    //furn.print();


  }

}


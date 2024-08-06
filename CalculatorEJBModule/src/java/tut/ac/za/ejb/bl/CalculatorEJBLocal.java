/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package tut.ac.za.ejb.bl;

import javax.ejb.Local;

/**
 *
 * @author teffu
 */
@Local
public interface CalculatorEJBLocal {

    int addition(int a, int b);

    int multiplication(int a, int b);

    int subtraction(int a, int b);

    double division(int a, int b);
    
}

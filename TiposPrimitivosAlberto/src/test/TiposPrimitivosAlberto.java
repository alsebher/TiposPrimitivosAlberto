/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Alumno Mañana
 */
public class TiposPrimitivosAlberto {
    /*
    
    *Enteros:
        -byte: 8 bits (-128 a 127) | Byte.MIN_VALUE - Byte.MAX_VALUE
        -short: 16 bits (-32768 a 32767) | Short.MIN_VALUE - Short.MAX_VALUE
        -int: 32 bits (-2147483648 a 2147483647) | Integer.MIN_VALUE - Integer.MAX_VALUE
        -long: 64 bits (-9223372036854775808 a 9223372036854775807) | Long.MIN_VALUE - Long.MAX_VALUE
    *Decimales:
        -float: 32 bits
        -double: 64 bits (4.9E-324 a 1.7976931348623157E308) | Double.MIN_VALUE - Double.MAX_VALUE
    *Caracter:
        -char:
    
    
    
    */
    
    public static void main(String[] args) {
        Byte enteroByte = 5;
        Short enteroShort = 100;
        Integer enteroInt = 300;
        Long enteroLong = 0L;
        Double decimalDouble = 0.0;
        System.out.println("enteroByte: "+enteroByte);
        System.out.println("Valor mínimo: "+ Byte.MIN_VALUE);
        System.out.println("Valor máximo: "+ Byte.MAX_VALUE);
        System.out.println("enteroShort: "+enteroShort);
        System.out.println("Valor mínimo: "+ Short.MIN_VALUE);
        System.out.println("Valor máximo: "+ Short.MAX_VALUE);
        System.out.println("enteroInt: "+enteroInt);
        System.out.println("Valor mínimo: "+ Integer.MIN_VALUE);
        System.out.println("Valor máximo: "+ Integer.MAX_VALUE);
        System.out.println("enteroLong: "+enteroLong);
        System.out.println("Valor mínimo: "+ Long.MIN_VALUE);
        System.out.println("Valor máximo: "+ Long.MAX_VALUE);
        System.out.println("decimalDouble: "+decimalDouble);
        System.out.println("Valor mínimo: "+ Double.MIN_VALUE);
        System.out.println("Valor máximo: "+ Double.MAX_VALUE);
    }
    
}

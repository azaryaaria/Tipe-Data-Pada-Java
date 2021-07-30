package com.tutorial;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        //Tipe Data Pada Java
        //Tipe Data Satuan : Long, Integer, Short, Byte
        //Tipe Data Desimal : Double & Float
        //Tipe Data untuk pernyataan : Boolean

        //Tipe Data Satuan
        System.out.println("\n=====Long=====");
        //Long adalah tipe data yang paling besar range nya
        long l = 320L; //Note : Kalo mau pake tipe long, diakhir angka harus ada huruf "L" untuk membedakan dengan tipe data lain
        System.out.println("l adalah variabel bertipe Long");
        System.out.println("Nilainya adalah = " + l);
        System.out.println("Nilai max tipe long = " + Long.MAX_VALUE);
        System.out.println("Nilai min tipe long = " + Long.MIN_VALUE);
        System.out.println("Nilai Byte pada tipe Long = " + Long.BYTES);
        System.out.println("Nilai Bit pada tipe Long = " + Long.SIZE);


        System.out.println("\n=====Integer=====");
        //Integer adalah tipe data yang kedua paling besar range nya
        int i = 150;
        System.out.println("i adalah variabel bertipe Integer");
        System.out.println("Nilainya adalah = " + i);
        System.out.println("Nilai max tipe integer = " + Integer.MAX_VALUE);
        System.out.println("Nilai min tipe integer = " + Integer.MIN_VALUE);
        System.out.println("Nilai Byte pada tipe Integer = " + Integer.BYTES);
        System.out.println("Nilai Bit pada tipe Integer = " + Integer.SIZE);

        System.out.println("\n=====Short=====");
        //Short adalah tipe data yang ketiga paling besar range nya
        short s = 310;
        System.out.println("s adalah variabel bertipe Short");
        System.out.println("Nilainya adalah = " + s);
        System.out.println("Nilai max tipe integer = " + Short.MAX_VALUE);
        System.out.println("Nilai min tipe integer = " + Short.MIN_VALUE);
        System.out.println("Nilai Byte pada tipe Short = " + Short.BYTES);
        System.out.println("Nilai Bit pada tipe Short = " + Short.SIZE);

        System.out.println("\n=====Byte=====");
        //Byte adalah tipe data yang memiliki range terkecil
        byte b = 120;
        System.out.println("b adalah variabel bertipe Byte");
        System.out.println("Nilainya adalah = " + b);
        System.out.println("Nilai max tipe byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min tipe byte = " + Byte.MIN_VALUE);
        System.out.println("Nilai Byte pada tipe Byte = " + Byte.BYTES);
        System.out.println("Nilai Bit pada tipe Byte = " + Byte.SIZE);

        /*Nilai max dan min itu berpengaruh sama nilai pada variabel
        Variabel yang diinput ditambah angka dan hasilnya melebihi nilai max,
        maka nilainya akan diteruskan ke nilai min*/

        //Setelah nilai max adalah nilai min

        //Kalo variabel dengan tipe tertentu diinput nilai yang lebih besar dari nilai max atau kurang dari nilai min tipe tersebut, maka akan error

        //1 Byte = 8 Bit

        //Tipe Data Desimal

        System.out.println("\n=====Double=====");
        //Double dipake untuk meng-input angka desimal besar ke variabel
        //Kalo gak terlalu besar mending pake float, biar gak makan banyak memori
        double d = 1.4d; //Note : Untuk tipe double harus dikasih huruf "d" di akhir
        System.out.println("d adalah variabel bertipe double");
        System.out.println("Nilainya = " + d);
        System.out.println("Nilai max double = " + Double.MAX_VALUE);
        System.out.println("Nilai min double = " + Double.MIN_VALUE);
        System.out.println("Nilai byte pada tipe double = " + Double.BYTES);
        System.out.println("Nilai bit pada tipe double = " + Double.SIZE);

        System.out.println("\n=====Float=====");
        //Float dipake untuk meng-input angka desimal kecil ke variabel
        //Supaya gak makan banyak memori
        float f = 1.2f; //Note : Untuk tipe double harus dikasih huruf "f" di akhir
        System.out.println("f adalah variabel bertipe double");
        System.out.println("Nilainya = " + f);
        System.out.println("Nilai max double = " + Float.MAX_VALUE);
        System.out.println("Nilai min double = " + Float.MIN_VALUE);
        System.out.println("Nilai byte pada tipe double = " + Float.BYTES);
        System.out.println("Nilai bit pada tipe double = " + Float.SIZE);

        //Semakin banyak nilai byte atau bit pada suatu tipe, maka makin banyak memori yang dipake


        //Tipe Data Pernyataan
        System.out.println("\n=====BOOLEAN=====");
        //Ini adalah tipe data yang cuma punya 2 nilai : True & False
        //Gak ada nilai max, min, byte, dan bit
        boolean bool = true;
        System.out.println("b adalah variabel bertipe boolean");
        System.out.println("Nilainya adalah = " + b);
        System.out.println("Nilai max tipe boolean = " + true);
        System.out.println("Nilai min tipe boolean = " + false);
    }

}

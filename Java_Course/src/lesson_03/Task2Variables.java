package lesson_03;

public class Task2Variables {
    public static void main(String[] args) {
        byte myByte1 = 127;
        byte myByte2 = -128;
        short myShort1 = 32767;
        short myShort2 = -32768;
        int myInt1 = 32456334;
        int myInt2 = -32456334;
        long myLong1 = 324213213231131L;
        long myLong2 = -324213213231131L;
        System.out.println();
        System.out.println("\t\tList of my variables:");
        System.out.println();
        System.out.println("Byte: " + myByte1 + "; " + myByte2 + ";");
        System.out.println("Short: " + myShort1 + "; " + myShort2 + ";");
        System.out.println("Integer: " + myInt1 + "; " + myInt2 + ";");
        System.out.println("Long: " + myLong1 + "; " + myLong2 + ";");
        float myFloat1 = 0.012123213f;
        float myFloat2 = -123.32424123213f;
        double myDouble1 = 2132131.2132131313d;
        double myDouble2 = -213213112313213123.2132131313d;
        boolean myBoolean1 = true;
        boolean myBoolean2 = false;
        System.out.println("Float: " + myFloat1 + "; " + myFloat2 + ";");
        System.out.println("Double: " + myDouble1 + "; " + myDouble2 + ";");
        System.out.println("Boolean: " + myBoolean1 + "; " + myBoolean2 + ";");
        char myChar1 = 'm';
        char myChar2 = 'K';
        char myChar3 = '9';
        char myChar4 = '\u0000';
        char myChar5 = '\u1290';
        char myChar6, myChar7, myChar8;
        myChar6 = 65;
        myChar7 = 'B';
        myChar8 = 67;
        System.out.println("Char: " + myChar1 + "; " + myChar2 + "; " + myChar3 + "; " + myChar4 + "; " + myChar5 + "; " + myChar6 + myChar7 + myChar8 + ";");
    }
}

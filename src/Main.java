import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void m1(int a,int b) {
        try {
            int c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Exception: " +e);
        }
    }
    static void m2(int d[]){
        try {
            d[12]=0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " +e);
        }
    }

    public static void main(String[] args) {
        int a = 37;
        int b = 0;
        int d[] = { 0,2 };

    System.out.println("1.1-1.2 Вывод встроенных типов исключений и вывод их в консоль\nделение на ноль:");
    m1(a,b);
    System.out.println("обращение к элементу массива вне его границ:");
    m2(d);
    System.out.println("1.3 Реализация нескольких типов исключений в одном блоке try-catch,\nпредварительно генерируя их оператором throw:");

    int num=0;
    for(int i = 0; i<1000; i++) {
        try{
        System.out.println("Введите 7, 100 или 0");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();}
        catch(InputMismatchException e){
            System.out.println("Перезапуститие программу и попробуйте ввести снова"+"\nException"+e);
        }
        if (num == 7 || num == 100 || num == 0)
            if (num == 7){
                MyEx(7);
                break;}
            if (num == 100){
                MyEx(100);
                break;}
            if (num == 0){
                MyEx(0);
                break;}
        else {
            System.out.println("Введено неверно, введите снова");
        }
    }
    System.out.println("1.4 Генерирование исключения собственного подкласса:");
    m4();
    }
    static void MyEx(int g){
        try {
            if(g==7)
                throw new NullPointerException("seven");
            if(g==100)
                throw new OutOfMemoryError("hundred");
            if(g==0)
                throw new IncompatibleClassChangeError("null");
        }
        catch(NullPointerException e){
            System.out.println("Exception: " +e);
        }
        catch(OutOfMemoryError e){
            System.out.println("Exception: " +e);
        }
        catch(IncompatibleClassChangeError e){
            System.out.println("Exception: " +e);
        }

    }

    static void m4(){
        try {
            String lvl = "criticality of exception is low";
            String msg = "MyException is activate";
            throw new MyExc(msg, lvl);
        }
        catch(MyExc e){

        }
    }

}

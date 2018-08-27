package com.example.javacore;

public class HandleExceptions {
    public void ArithmeticException() {
        try{
            int a = 0;
            int b = 1;
            int arr[] = new int[1];
            arr[12] = 10;
            arr[10] = b/a;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide 0");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounds");
        } catch (Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("result is not calculated");
        }
    }
}

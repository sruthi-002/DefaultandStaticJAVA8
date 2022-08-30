package com.company;
interface  DefaultandStatic{
    default void defaultmethod()
    {
        System.out.println("This is Default method");
    }
    static void staticmethod()
    {
        System.out.println("This is Static method");
    }
    void abstractmethod();
}
public class Main implements DefaultandStatic {
    public void abstractmethod()
    {
        System.out.println("This is abstract method");
    }
    public static void main(String[] args) {
        Main d = new Main();
        d.defaultmethod();
        DefaultandStatic.staticmethod();
        d.abstractmethod();
    }
}

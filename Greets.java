/ File: mypackage/MyClass.java
package mypackage;

public class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass in mypackage!");
    }
}

//main file

import mypackage.MyClass;

public class Greets {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}

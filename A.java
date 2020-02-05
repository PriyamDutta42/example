package javaexample1;

public abstract class A {
A()
{
	System.out.println("A created");
}
void m1()
{
	System.out.println("m1");
}
abstract void m2();

static void m3()//cannot be pverridden
{
	System.out.println("m3");	
}
public static void main(String[] args)
{
	m3();
}
}

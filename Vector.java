package collection;
import java.lang.vector;
class Demo{
public static void main(String[] args){
vector v1=new vector(6);
v1.add(10);
v1.add(20.56);
v1.add('a');
v1.add("hello");
v1.add(10);
v1.add(10);
v1.add(10);
System.out.println("size "+v1.size());
System.out.println("capacity"+v1.capcity());
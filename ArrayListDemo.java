package mypackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al=new ArrayList();
        al.add(10);//AutoBoxing-added in Java 5 Version
        al.add(20);
        al.add("xxx");
        al.add("yyy");
        System.out.println(al);//[10, 20, XXX, YYY]
        al.add(2,"ppp");
        System.out.println(al);//[10, 20, PPP, XXX, YYY]
        al.set(2,"qqq");
        System.out.println(al);//[10, 20, QQQ, XXX, YYY]
        al.remove("qqq");
        System.out.println(al);//[10, 20, XXX, YYY]
        al.remove(2);
        System.out.println(al);//[10, 20, YYY]
        String s=(String)al.get(2);
        System.out.println(s);//YYY
        System.out.println("Size:"+al.size());
        
	}

}

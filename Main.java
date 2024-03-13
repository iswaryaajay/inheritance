class places{
    final String place = "famous places"; //final keyword
    protected int number;//protected
    String shops;
    places(String shops){//parameterized constructor
        this.shops= shops;// this keyword
    }
    int no = 1234;
    places(){ //default constructor
        System.out.println("its a super class constructor");
    }
    public void show(){ //method
        System.out.println("famous places in all country");
    }
    final public void finalmethod(){ //final method
        System.out.println("final method is does not inherit");
    }
    public void add(){
        System.out.println("superclass:"+place);
    }
}
class india extends places{ //inheritance
    final String indian = "tajmahal";
    india(){ //constructor
        System.out.println("its a sub class constructor");
    }
    public void show(){
        super.show(); // super keyword
        System.out.println("india famous places is tajmahal");
    }
    public void sub(){
        System.out.println("subclass:"+indian);
    }
}
class paris extends places{ //inner class
   private class inner{ //private class
       int n = 9944;
       String s ="nila";
    }
    public void display(){
       inner n = new inner();
       System.out.println(n.n);
       System.out.println(n.s);
    }
    public void show(){
        super.show();
        System.out.println("paris famous place is tower");
    }
}
class abudhabii extends places{
    final public void show(){
        System.out.println("abudhabhii famous place is dessert");
    }
}
class Main {
    public static void main(String[] args) {
        india i = new india();
        abudhabii a = new abudhabii();
        paris p = new paris();
        i.show();
        i.add();
        i.sub();
        i.finalmethod();
        a.show();
        p.show();
        p.display();
    }
}
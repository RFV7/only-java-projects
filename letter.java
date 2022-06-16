public abstract class letter {
   
	String name;

    public abstract void print(); 
}
    class a extends letter{

        @Override
        public void print() {
            System.out.println("A");
    }
    }

    class  b extends letter{
        @Override
        public void print() {
            System.out.println("B");
    }
}
    class  c extends letter {
        @Override
        public void print() {
            System.out.println("C");
    
    }
}

class main {

   public static void main(String[] args) {
       
   
    
            letter p = new a();
            letter m = new b();
            letter f = new c();
            
            p.print();
            m.print();
            f.print();
}
}




